package Entity;

import java.util.Date;

public class Order {
	
	private int id;
	private Date date;
	private String name;
	private User user;
	private Product productId;
	private Product productName;
	private Campaign campaignId;
	private Campaign campaignName;
	private int quantity;
	private double unitPrice;
	private double discountPercent;
	
	public Order() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	public Product getProductName() {
		return productName;
	}
	public void setProductName(Product productName) {
		this.productName = productName;
	}
	public Campaign getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Campaign campaignId) {
		this.campaignId = campaignId;
	}
	public Campaign getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(Campaign campaignName) {
		this.campaignName = campaignName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
