package bookmarket.model;

public class Cart {
	CartItem[] itemList = new CartItem[64];
	int numItems = 0;

	public boolean isEmpty() {
		return numItems == 0;
	}

	public CartItem[] getItemList() {
		return itemList;
	}

	public void setItemList(CartItem[] itemList) {
		this.itemList = itemList;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public String getItemInfo(int index) {
		return itemList[index].toString();
	}
	
	

}
