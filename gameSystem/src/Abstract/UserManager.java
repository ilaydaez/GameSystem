package Abstract;

import Entity.User;

public class UserManager implements UserService {

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi : "+ user.getId() );
		
	}

	@Override
	public void addBulk(User[] users) {
		for(User user : users) {
			this.add(user);
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Silindi : "+ user.getId());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Güncellendi : "+ user.getId());
		
	}

}
