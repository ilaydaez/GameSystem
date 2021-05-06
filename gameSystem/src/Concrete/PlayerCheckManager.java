package Concrete;

import Abstract.IdentityValidationService;
import Abstract.UserCheckManager;
import Entity.Player;
import Entity.User;
import Utils.Result;

public class PlayerCheckManager extends UserCheckManager{
	
	public PlayerCheckManager() {
		System.out.println("");
		System.out.println("----Kullanýcý Doðrulama Sayfasý----");
		System.out.println("");
	}
	
	private IdentityValidationService identityValidationService;

	public PlayerCheckManager(IdentityValidationService identityValidationService) {
		this.identityValidationService = identityValidationService;
	}

	@Override
	public Result realUser(User user) {
		Player player = (Player) user;
		return this.identityValidationService.CheckIfRealPerson(
				player.getIdentityNumber(), 
				player.getFirstName(), 
				player.getLastName(), 
				player.getBirthYear());
	}

}
