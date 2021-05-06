package Concrete;

import Abstract.CategoryService;
import Entity.Category;

public class CategoryManager implements CategoryService {
	
	public CategoryManager() {
		System.out.println("");
		System.out.println("----Kategori Sayfasý----");
		System.out.println("");
	}

	@Override
	public void add(Category category) {
		System.out.println("Category Eklendi : "+ category.getName());
		
	}

	@Override
	public void addBulk(Category[] categories) {
		for(Category category : categories) {
			this.add(category);
		}
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Category Silindi : "+ category.getName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Category Güncellendi : "+ category.getName());
		
	}

}
