package com.mcc.MiTiendita.framework;

import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.DiscountDayBehavior;
import com.mcc.MiTiendita.app.domain.entities.Product;

import java.util.List;

public abstract class Sale {

  protected DiscountDayBehavior discountDayBehavior;

  public Sale() {}

  public Double sell(List<Product> products) {
    return 0.0;
  }

  public void setDiscountDayBehavior(DiscountDayBehavior discountDayBehavior) {
    this.discountDayBehavior = discountDayBehavior;
  }
}
