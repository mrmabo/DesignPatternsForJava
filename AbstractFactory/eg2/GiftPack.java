package AbstractFactory.eg2;

import java.util.List;

public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private String packType; //"Business", "Adults", or "Kids"
	public GiftPack(List<GiftItem> giftItems, Address shippingAddress, String packType) {
		//super();
		this.giftItems = giftItems;
		this.shippingAddress = shippingAddress;
		this.packType = packType;
	}
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}
	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPackType() {
		return packType;
	}
	public void setPackType(String packType) {
		this.packType = packType;
	}
	
	
}
