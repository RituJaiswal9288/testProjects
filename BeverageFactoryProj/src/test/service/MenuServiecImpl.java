package test.service;

import java.util.HashMap;
import java.util.List;

import test.constant.CommonConstant;
import test.model.MenuItems;
import test.util.Utility;

public class MenuServiecImpl implements MenuProcessingService  {

	static HashMap<String, Double> ingredientPrice = null;
	static List<MenuItems> menuItems = null;
	String item = null;
	String excludedIngre = null;
	String[] excludedIngres = null;
	Double excludedAmount = 0.0;
	
	public MenuServiecImpl() {
		this.ingredientPrice = (HashMap<String, Double>) Utility.getPriceList();
		this.menuItems = Utility.getMenuItemList();
	}
	
	public Double processSingleOrder(String order) {
		Double finalprice=null;
		try {
		String[] custOrder = order.split("-");
		if (custOrder.length > 1) {
			// Customized order
			item = custOrder[0];
			for (String et : custOrder) {
				Double d = ingredientPrice.get(et.toUpperCase());
				if(d != null)excludedAmount += d;
			}

			MenuItems mi = menuItems.stream().filter(m -> m.getMenuItem().equalsIgnoreCase(item)).findAny().get();
			 finalprice = mi.getPrice() - excludedAmount;
			System.out.println(item + "'" + "s price is ::" + finalprice + CommonConstant.PRICEUNIT);
		
		} else {
			// Order from menu list
			item = order;
			MenuItems mi =menuItems.stream().filter(m -> m.getMenuItem().equalsIgnoreCase(item)).findAny().get();
			System.out.println(item + "'" + "s price is ::" + mi.getPrice() + CommonConstant.PRICEUNIT);
			finalprice= mi.getPrice() ;
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		if(finalprice != null)
		{
		return finalprice ;
		}else
		{
			return 0.0;
		}
	}
}
