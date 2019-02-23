package com.mcc.MiTiendita.framework.behaviors.discountBehaviors;

import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public interface DiscountDayBehavior {
  public Double applyDiscount(List<Product> products);
}
