package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public class FruitDayDiscount implements DiscountDayBehavior {

  //15 percent
  private final Double FRUIT_DISCOUNT = 0.85;

  @Override
  public Double applyDiscount(List<Product> products) {
    Double total = 0.0;
    if (products != null && !products.isEmpty()) {
      for (Product item : products) {
        if (ProductCategory.FRUIT.equals(item.getProductCategory())) {
          total += (item.getPrice() * item.getQuantity()) * FRUIT_DISCOUNT;
        } else {
          total += item.getPrice() * item.getQuantity();
        }
      }
    }
    return total;
  }
}
