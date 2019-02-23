package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public class SausageAndDairyDiscountDay implements DiscountDayBehavior {

  // 5 percent
  private final Double SAUSAGE_DISCOUNT = 0.95;
  // 15 percent
  private final Double DAIRYS_DISCOUNT = 0.85;

  @Override
  public Double applyDiscount(List<Product> products) {
    Double total = 0.0;
    if (products != null && !products.isEmpty()) {
      for (Product item : products) {
        if (item.getProductCategory() != null) {
          switch (item.getProductCategory()) {
            case DAIRY:
              total += (item.getPrice() * item.getQuantity()) * DAIRYS_DISCOUNT;
              break;
            case SAUSAGE:
              total += (item.getPrice() * item.getQuantity()) * SAUSAGE_DISCOUNT;
              break;
            default:
              total += item.getPrice() * item.getQuantity();
              break;
          }
        }
      }
    }
    return total;
  }
}
