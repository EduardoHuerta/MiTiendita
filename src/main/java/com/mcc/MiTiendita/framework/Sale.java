package com.mcc.MiTiendita.framework;

import com.mcc.MiTiendita.app.domain.entities.Product;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.DiscountDayBehavior;

import java.util.List;

public abstract class Sale {

  public final Double IVA = 0.16;
  protected DiscountDayBehavior discountDayBehavior;

  public Sale() {}

  public Double sell(List<Product> products) {

    Double total = 0.0;

    if (products != null && !products.isEmpty()) {
      total = discountDayBehavior.applyDiscount(products);

      if (total != null && total > 0) {
        total += (total * 0.16);
      }
    }

    return total;
  }

  public void setDiscountDayBehavior(DiscountDayBehavior discountDayBehavior) {
    this.discountDayBehavior = discountDayBehavior;
  }
}
