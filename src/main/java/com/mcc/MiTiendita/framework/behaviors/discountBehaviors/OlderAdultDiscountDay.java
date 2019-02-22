package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public class OlderAdultDiscountDay implements DiscountDayBehavior {

  // 10 percent
  private final Double OLDERADULT_DISCOUNT = 0.95;

  @Override
  public Double applyDiscount(List<Product> products) {
    Double total = 0.0;
    if (products != null && !products.isEmpty()) {
      for (Product item : products) {
        total += (item.getPrice() * item.getQuantity()) * OLDERADULT_DISCOUNT;
      }
    }
    return total;
  }
}
