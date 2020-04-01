package test.model;

import java.util.List;

public class MenuItems {
	
	private String menuItem;
	private List<String> ingredients;
	private double price;
	
	
	public MenuItems(String menuItem, List<String> ingredients, double price) {
		super();
		this.menuItem = menuItem;
		this.ingredients = ingredients;
		this.price = price;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

	
}
