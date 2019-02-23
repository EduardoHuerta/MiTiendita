package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.SausageAndDairyDiscountDay;

public class FridaySale extends Sale {

  public FridaySale() {
    discountDayBehavior = new SausageAndDairyDiscountDay();
  }
}
