package Concrete;

import Abstract.OrderService;
import Entity.Order;

public class OrderManager implements OrderService {
	 
	
	public OrderManager() {
		System.out.println("");
		System.out.println("----Sipariþ Sayfasý----");
		System.out.println("");
	 }

	@Override
	public void add(Order order) {
		System.out.println("Sipariþ Eklendi : " + order.getId());
		System.out.println("Sipariþ Miktarý : " + order.getQuantity());
		System.out.println("Kullanýcý Bilgisi : " + order.getName());
		System.out.println("Ürün Bilgisi : " + order.getProductName().getName());
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariþ Güncellendi : " + order.getId());
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariþ Silindi : " + order.getId());
		
	}

}
