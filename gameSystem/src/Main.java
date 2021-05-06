
import java.util.GregorianCalendar;

import Abstract.CampaignService;
import Abstract.CategoryService;
import Abstract.OrderService;
import Abstract.ProductService;
import Abstract.UserService;
import Adapter.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CategoryManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Entity.Campaign;
import Entity.Category;
import Entity.Game;
import Entity.Order;
import Entity.Player;
import Entity.Product;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		
				// Categories
				CategoryService categoryService = new CategoryManager();
				
				Category category1 = new Category();
				category1.setId(1);
				category1.setName("Aksiyon");
				
				Category category2 = new Category();
				category2.setId(2);
				category2.setName("Strateji");
				
				Category category3 = new Category();
				category3.setId(3);
				category3.setName("Simülasyon");

				categoryService.addBulk(new Category[] {category1, category2, category3});
				System.out.println("");
				
				// Games
				ProductService productService = new GameManager();
				
				Product game1 = new Game();
				game1.setId(1);
				game1.setCategoryId(1);
				game1.setName("Counter-Strike");
				game1.setDescription("Counter-Strike: Global Offensive (CS: GO) "
						+ "expands upon the team-based action gameplay that it pioneered "
						+ "when it was launched 19 years ago. CS: GO features new maps, "
						+ "characters, weapons, and game modes, and delivers updated versions "
						+ "of the classic CS content" );
				game1.setSellingPrice(127);
				
				
				Product game2 = new Game();
				game2.setId(2);
				game2.setCategoryId(3);
				game2.setName("Age of Empires III");
				game2.setDescription("Age of Empires III: Definitive Edition, "
						+ "yeniden düzenlenmiþ grafikler ve müziklerle, "
						+ "daha önce çýkýþ yapan tüm geniþletmelerle ve "
						+ "ilk kez keyifle oynanacak yepyeni içeriklerle "
						+ "en çok sevilen gerçek zamanlý strateji serilerinden "
						+ "birinin kutlanýþýný tamamlýyor.");
				game2.setSellingPrice(108.38);
				
				productService.addBulk(new Product[] {game1, game2});	
				System.out.println("");
				
				// Players + IdentityNumberValidation
				UserService userService = new PlayerManager(new PlayerCheckManager(new MernisServiceAdapter()));
				
				User player1 = new Player(1, "Ýlayda", "Ez", "100000000", 1997);
				
				
				userService.addBulk(new User[] {player1});
				System.out.println("");
				
				// Campaign
				CampaignService campaignService = new CampaignManager();
				Campaign campaign1 = new Campaign();
				campaign1.setId(1);
				campaign1.setName("Spring Campaign");
				campaign1.setDescription("Ýlk baharýn geliþini kutluyoruz.");
				campaign1.setDiscountPercent(75);
				campaign1.setCampaignCode("SPRNGCMPGN");
				campaign1.setStartDate(new GregorianCalendar(2021,5,29).getTime());
				campaign1.setEndDate(new GregorianCalendar(2021,6,6).getTime());
				campaign1.setProduct(game2);
				
				campaignService.add(campaign1);
				System.out.println("");

				// Order

				OrderService orderService = new OrderManager();
				Order order1= new Order();
				order1.setId(1);
				order1.setDate(new GregorianCalendar(2021,5,6).getTime());
				order1.setQuantity(1);
				order1.setName("Ýlayda Ez");
				order1.setProductName(game2);
				order1.setCampaignId(campaign1);
				order1.setDiscountPercent(75);
				
				orderService.add(order1);
				System.out.println("");
		
	
		

	}

}
	