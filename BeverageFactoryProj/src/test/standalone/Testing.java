package test.standalone;

import java.util.List;

import test.controller.MenuOrderController;
import test.model.MenuItems;
import test.util.Utility;

public class Testing {

	public static void main(String[] args) {
		String sampleOrder = null;
		// sampleOrder = "Chai-sugar";
		//sampleOrder = "Chai-sugar-milk";
		// sampleOrder = "Chai";
		//sampleOrder = "Chai-sugar-milk,Chai,Coffee-milk";
		//sampleOrder = "";
		//new MenuOrderController().placeOrder(sampleOrder);
		List<MenuItems> list=Utility.getMenuItemList();
		
		list.stream().filter(item-> item.getPrice() > 4 && item.getPrice() < 6).forEach(item->System.out.print(item.getPrice()));
	}

}
