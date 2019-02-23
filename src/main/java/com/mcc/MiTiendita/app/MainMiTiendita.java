package com.mcc.MiTiendita.app;

import com.mcc.MiTiendita.app.daysOfSale.*;
import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;
import com.mcc.MiTiendita.framework.Sale;

import java.util.ArrayList;
import java.util.List;

public class MainMiTiendita {

  public static void main(String[] args) {

    Product leche = new Product();
    leche.setDescription("Leche");
    leche.setQuantity(10.0);
    leche.setPrice(15.50);
    leche.setProductCategory(ProductCategory.DAIRY);

    Product crema = new Product();
    crema.setDescription("Crema");
    crema.setQuantity(0.5);
    crema.setPrice(10.0);
    crema.setProductCategory(ProductCategory.DAIRY);

    Product mantequilla = new Product();
    mantequilla.setDescription("Mantequilla");
    mantequilla.setQuantity(0.250);
    mantequilla.setPrice(4.50);
    mantequilla.setProductCategory(ProductCategory.DAIRY);

    Product queso = new Product();
    queso.setDescription("Queso");
    queso.setQuantity(0.500);
    queso.setPrice(100.0);
    queso.setProductCategory(ProductCategory.DAIRY);

    Product platano = new Product();
    platano.setDescription("Platano");
    platano.setQuantity(1.0);
    platano.setPrice(14.0);
    platano.setProductCategory(ProductCategory.FRUIT);

    Product manzana = new Product();
    manzana.setDescription("Manzana");
    manzana.setQuantity(2.0);
    manzana.setPrice(13.0);
    manzana.setProductCategory(ProductCategory.FRUIT);

    Product jamon = new Product();
    jamon.setDescription("Jamon");
    jamon.setQuantity(1.0);
    jamon.setPrice(35.0);
    jamon.setProductCategory(ProductCategory.SAUSAGE);

    List<Product> products = new ArrayList<>();
    products.add(leche);
    products.add(crema);
    products.add(mantequilla);
    products.add(queso);
    products.add(platano);
    products.add(manzana);
    products.add(jamon);

    Sale mondaySale = new MondaySale();
    System.out.println("Total venta del lunes:" + mondaySale.sell(products));

    Sale tuesdaySale = new TuesdaySale();
    System.out.println("Total venta del martes:" + tuesdaySale.sell(products));

    Sale wednesdaySale = new WednesdaySale();
    System.out.println("Total venta del miercoles:" + wednesdaySale.sell(products));

    Sale thursdaySale = new ThursdaySale();
    System.out.println("Total venta del jueves:" + thursdaySale.sell(products));

    Sale fridaySale = new FridaySale();
    System.out.println("Total venta del viernes:" + fridaySale.sell(products));

    Sale saturdaySale = new SaturdaySale();
    System.out.println("Total venta del sabado:" + saturdaySale.sell(products));

    Sale sundaySale = new SundaySale();
    System.out.println("Total venta del domingo:" + sundaySale.sell(products));
  }
}
