package com.pranayshetty;
import java.util.*;

public class Basket {
	private final String name;
	private final Map<StockItem,Integer> list;
	
	public Basket(String name) {
		this.name=name;
		this.list=new HashMap<>();
		
	} 
	
	public int addToBasket(StockItem item ,int quantity) {
		 if((item!=null) && quantity>0) {
			 int inBasket=list.getOrDefault(item, 0);
			 list.put(item,inBasket+quantity);
			 return inBasket;
		 }
		 return 0;
	}
	
	public Map<StockItem,Integer> Items(){
		return Collections.unmodifiableMap(list);
	}

	
	
	

}
