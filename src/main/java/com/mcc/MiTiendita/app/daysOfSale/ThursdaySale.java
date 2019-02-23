package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.FruitDiscountDay;

public class ThursdaySale extends Sale {

  public ThursdaySale() {
    discountDayBehavior = new FruitDiscountDay();
  }
}
