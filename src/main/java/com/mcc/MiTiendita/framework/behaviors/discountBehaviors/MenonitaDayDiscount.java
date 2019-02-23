package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public class MenonitaDayDiscount implements DiscountDayBehavior {

  // 10 percent
  private final Double MENONITA_DISCOUNT = 0.90;

  @Override
  public Double applyDiscount(List<Product> products) {
    Double total = 0.0;
    if (products != null && !products.isEmpty()) {
      for (Product item : products) {
        if (ProductCategory.DAIRY.equals(item.getProductCategory())) {
          total += (item.getPrice() * item.getQuantity()) * MENONITA_DISCOUNT;
        } else {
          total += item.getPrice() * item.getQuantity();
        }
      }
    }
    return total;
  }
}
