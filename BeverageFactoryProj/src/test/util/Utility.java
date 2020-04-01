package test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.model.MenuItems;

public class Utility 
{
	static HashMap<String, Double> ingredientPrice = null;
	static List<MenuItems> menuItems = null;
	
	public static Map<String, Double> getPriceList() {
		ingredientPrice = new HashMap<String, Double>();
		ingredientPrice.put("MILK", 1.0);
		ingredientPrice.put("SUGAR", 0.5);
		ingredientPrice.put("SODA", 0.5);
		ingredientPrice.put("MINT", 0.5);
		ingredientPrice.put("WATER", 0.5);
		return ingredientPrice;
	}

	public static List<MenuItems> getMenuItemList() {
		menuItems = new ArrayList<MenuItems>();
		menuItems.add(
				new MenuItems("Coffee", new ArrayList<String>(Arrays.asList("Coffee", "milk", "sugar", "water")), 5.0));
		menuItems
				.add(new MenuItems("Chai", new ArrayList<String>(Arrays.asList("Tea", "milk", "sugar", "water")), 4.0));
		menuItems.add(new MenuItems("Banana Smoothie",
				new ArrayList<String>(Arrays.asList("banana", "milk", "sugar", "water")), 6.0));
		menuItems.add(new MenuItems("Strawberry Shake",
				new ArrayList<String>(Arrays.asList("Strawberries", "milk", "sugar", "water")), 6.0));
		menuItems.add(new MenuItems("Mojito",
				new ArrayList<String>(Arrays.asList("Lemon", "sugar", "water", "soda", "mint")), 7.0));
		return menuItems;
	}
}
