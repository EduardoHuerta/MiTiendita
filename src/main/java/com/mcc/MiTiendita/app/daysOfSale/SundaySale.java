package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.OlderAdultDiscountDay;

public class SundaySale extends Sale {

  public SundaySale() {
    discountDayBehavior = new OlderAdultDiscountDay();
  }
}
