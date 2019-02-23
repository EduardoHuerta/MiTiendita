package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public class DaywithoutDiscount implements DiscountDayBehavior {
  @Override
  public Double applyDiscount(List<Product> products) {
    Double total = 0.0;
    if (products != null && !products.isEmpty()) {
      for (Product item : products) {
        total += item.getPrice() * item.getQuantity();
      }
    }
    return total;
  }
}
