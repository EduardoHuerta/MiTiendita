package com.mcc.MiTiendita.app.daysOfSale;

import com.mcc.MiTiendita.framework.Sale;
import com.mcc.MiTiendita.framework.behaviors.discountBehaviors.MenonitaDayDiscount;

public class WednesdaySale extends Sale {

  public WednesdaySale() {
    discountDayBehavior = new MenonitaDayDiscount();
  }
}
