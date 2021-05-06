package Abstract;

import Entity.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("Oyun Eklendi : "+ product.getName());
		
	}

	@Override
	public void addBulk(Product[] products) {
		for(Product product : products) {
			this.add(product);
		}
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Oyun Silindi : "+ product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Oyun Güncellendi : "+ product.getName());
		
	}

}
