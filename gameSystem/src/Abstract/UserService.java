package Abstract;

import Entity.User;

public interface UserService {
	
	void add(User user);
	void addBulk(User[] user);
	void delete (User user);
	void update(User users);

}
