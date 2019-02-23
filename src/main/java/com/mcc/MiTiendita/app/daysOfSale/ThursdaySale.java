package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.FruitDayDiscount;

public class ThursdaySale extends Sale {

  public ThursdaySale() {
    discountDayBehavior = new FruitDayDiscount();
  }
}
