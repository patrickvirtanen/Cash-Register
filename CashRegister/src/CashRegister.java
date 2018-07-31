
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;
import javax.swing.JFrame;


public class CashRegister extends JFrame{
	
//	Map<Product, Integer> products = new HashMap<>();
	
	Map<String, Integer> productList = new HashMap<>();
	String[] name = {"Banan", "Tomat", "Kiwi", "Watermelon", "Apple",
			"Pear", "Mixed fruits", "Pinapple"};
	int[] prices = {5,3,6,10,4,5,15,12};
	
			
		
	
	// Map<Integer, > priceProd = new HashMap<>();
	//DefaultListModel<String> ProductsName = new DefaultListModel<>();

	JTextArea area=new JTextArea(5,20);
	
	public void sortArrays() {
		for(int i =0; i < name.length; i++) {
			for(int j =0; j < prices.length; j++) {
				String prod = name[i];
				int index = i;
				if (index == j) {
					int price = prices[j];
					productList.put(prod, price);
				}
			}
		}
	}
	
	
	public CashRegister() {
		
		sortArrays();
		
		for(Map.Entry<String, Integer> entry : productList.entrySet()) {
			String s  = entry.getKey();
			int i = entry.getValue();
			System.out.println(s + " : " + i);
		}
		
		
		//ProductsName.addElement("Hello");
		JButton tomato = new JButton("Tomato");
		JButton banana = new JButton("Banana");
		//JList<String> lista = new JList<>(ProductsName);
		
//		area.setBounds(20,75);  
		
		JPanel west = new JPanel();
		JPanel east = new JPanel();
		
		
		west.add(area);
		east.add(tomato);
		tomato.addActionListener(new ProductButton());
		east.add(banana);
		banana.addActionListener(new ProductButton());
		
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,400);
		setVisible(true);
		
		
		
//		Product p1 = new Product("Mac Cosmetics", "Lipstick", 199.99);
//		Product p2 = new Product("Benefit", "Blush", 299.45);
//		Product p3 = new Product("Isadora", "Eyeshadow", 89.00);
//		
//		products.put(p1, 100);
//		products.put(p2, 200);
//		products.put(p3, 50);
//		
//		for(Map.Entry<Product, Integer> entry : products.entrySet()) {
//			Product p = entry.getKey();
//			int retailPrice = entry.getValue();
//			
//			System.out.println(p.getBrand() + " Retailprice:"+ retailPrice);
//		}
	}
	
	class ProductButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText(" ");
			JButton b = (JButton)e.getSource();
			String bText = b.getText();
			area.setText(bText);
		}
		
	}

	
	public static void main(String[] args) {
		new CashRegister();
	}
	
//	class Product {
//		String brand, description;
//		double price;
//		
//		public Product(String brand, String description, double price) {
//			this.brand = brand;
//			this.description = description;
//			this.price = price;
//		}
//		public String getBrand() {
//			return brand;
//		}
//		public String toString() {
//			return brand + ", " + description + ", " + price;
//		}
//		
//	}

}
