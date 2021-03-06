package com.yash.FourthAssignment;

import java.util.List;

public class Product {
	
	private String productId;
    private String productName;
    private List<Item> items;

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

   

    public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", items=" + items + "]";
	}

	

}
