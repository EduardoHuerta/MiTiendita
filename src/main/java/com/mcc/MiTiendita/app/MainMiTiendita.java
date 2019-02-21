package com.mcc.MiTiendita.app;

import com.mcc.MiTiendita.app.daysOfSale.MondaySale;
import com.mcc.MiTiendita.app.domain.entities.Product;
import com.mcc.MiTiendita.framework.Sale;

import java.util.ArrayList;
import java.util.List;

public class MainMiTiendita {

  public static void main(String[] args) {

    Sale mondaySale = new MondaySale();

      Product crema = new Product();
      crema.setDescription("crema");

      Product elotes = new Product();

    List<Product> products = new ArrayList<>();
    products.add(crema);
    products.add(elotes);

    mondaySale.sell(products);
  }
}
