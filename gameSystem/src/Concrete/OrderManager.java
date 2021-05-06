package Concrete;

import Abstract.OrderService;
import Entity.Order;

public class OrderManager implements OrderService {
	 
	
	public OrderManager() {
		System.out.println("");
		System.out.println("----Sipari� Sayfas�----");
		System.out.println("");
	 }

	@Override
	public void add(Order order) {
		System.out.println("Sipari� Eklendi : " + order.getId());
		System.out.println("Sipari� Miktar� : " + order.getQuantity());
		System.out.println("Kullan�c� Bilgisi : " + order.getName());
		System.out.println("�r�n Bilgisi : " + order.getProductName().getName());
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipari� G�ncellendi : " + order.getId());
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipari� Silindi : " + order.getId());
		
	}

}
