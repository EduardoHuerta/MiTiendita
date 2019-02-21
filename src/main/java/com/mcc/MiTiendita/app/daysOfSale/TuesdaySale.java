package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.DaywithoutDiscount;

public class TuesdaySale extends Sale {

  public TuesdaySale() {
    discountDayBehavior = new DaywithoutDiscount();
  }
}
