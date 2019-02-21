package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.OlderAdultDiscountDay;

public class MondaySale extends Sale {

  public MondaySale() {
    discountDayBehavior = new OlderAdultDiscountDay();
  }
}
