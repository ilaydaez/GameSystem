package Concrete;

import Abstract.UserCheckService;
import Abstract.UserManager;
import Entity.User;
import Utils.Result;
import Utils.ServiceUtils;

public class PlayerManager extends	UserManager {
	
	
	
	private UserCheckService userCheckService;

	public PlayerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(User user) {
		Result result = ServiceUtils.runChecks(
				userCheckService.realUser(user)
				);
		
		if(!result.isSuccess()) {
			System.out.println(result.message());
			return;
		}
		
		super.add(user);
		
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
