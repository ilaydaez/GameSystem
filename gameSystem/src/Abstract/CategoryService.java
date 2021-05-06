package Abstract;

import Entity.Category;

public interface CategoryService {
	
	void add(Category category);
	void addBulk(Category[] categories);
	void delete (Category category);
	void update(Category category);

}
