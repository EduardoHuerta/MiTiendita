package com.mcc.MiTiendita.app.domain.entities;

import com.mcc.MiTiendita.app.domain.ProductCategory;

public class Product {

  public Product() {}

  private String Description;
  private Double quantity;
  private Double price;
  private ProductCategory productCategory;

  public String getDescription() {
    return Description;
  }

  public void setDescription(String description) {
    Description = description;
  }

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductCategory getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }
}
