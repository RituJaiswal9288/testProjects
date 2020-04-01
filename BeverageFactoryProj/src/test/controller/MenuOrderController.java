package test.controller;

import java.io.Serializable;

import test.service.MenuProcessingService;
import test.service.MenuServiecImpl;


public class MenuOrderController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8633356336346575017L;
	MenuProcessingService menuServiecImpl = null;
	String[] orders = null;
	double totalPrice=0.0d;

	public Object placeOrder(Object order) {
		if (order instanceof String) {
			totalPrice=processOrders(String.valueOf(order));
			System.out.println("Sub Total ::: "+totalPrice);
		} else {
			System.out.println("Invalid input !!!!!");
		}
		if(totalPrice == 0.0d)
		{
			return "Invalid input !!!!!";
		}else
		{
			return totalPrice;
		}
		
	}

	public double processOrders(String order) {
		menuServiecImpl = new MenuServiecImpl();
		orders = order.split(",");

		if (orders.length > 0 && orders.length == 1) {
			// Single Order
			totalPrice=menuServiecImpl.processSingleOrder(orders[0]);

		} else if (orders.length > 0 && orders.length > 1) {
			// Multiple orders process each
			totalPrice=0.0d;
			for (String eachOrder : orders) {
				double d=menuServiecImpl.processSingleOrder(eachOrder);
				totalPrice=totalPrice+d;
			}

		}
		
		return totalPrice;
	}

}
