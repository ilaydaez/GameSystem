package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {
	
	public CampaignManager() {
		System.out.println("");
		System.out.println("----Kampanya Sayfas�----");
		System.out.println("");
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi : "+ campaign.getName());
		System.out.println("Kampanya �ndirimi : "+ campaign.getDiscountPercent());
		System.out.println("Kampanyal� �r�n : "+ campaign.getProduct().getName());
		System.out.println("Kampanya Kodu : "+ campaign.getCampaignCode());
	
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi : "+ campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi : "+ campaign.getName());
		
	}

}
