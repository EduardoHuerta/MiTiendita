package com.mcc.MiTiendita;

import com.mcc.MiTiendita.app.daysOfSale.*;
import com.mcc.MiTiendita.app.domain.ProductCategory;
import com.mcc.MiTiendita.app.domain.entities.Product;
import com.mcc.MiTiendita.framework.Sale;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MiTienditaApplicationTests {

  private List<Product> products = new ArrayList<>();
  private Sale venta;

  @Before
  public void setUp() {
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

    products = new ArrayList<>();
    products.add(leche);
    products.add(crema);
    products.add(mantequilla);
    products.add(queso);
    products.add(platano);
    products.add(manzana);
    products.add(jamon);
  }

  @Test
  public void mondayTotalIsEqualToRealValue() {
    venta = new MondaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(315.30975),venta.sell(products));
  }

  @Test
  public void tuesdayTotalIsEqualToRealValue() {
    venta = new TuesdaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(331.905),venta.sell(products));
  }

  @Test
  public void wednesdayTotalIsEqualToRealValue() {
    venta = new WednesdaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(307.4145),venta.sell(products));
  }

  @Test
  public void thursdayTotalIsEqualToRealValue() {
    venta = new ThursdaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(324.945),venta.sell(products));
  }


  @Test
  public void fridayTotalIsEqualToRealValue() {
    venta = new FridaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(293.13925),venta.sell(products));
  }


  @Test
  public void saturdayTotalIsEqualToRealValue() {
    venta = new SaturdaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(331.905),venta.sell(products));
  }

  @Test
  public void sundayTotalIsEqualToRealValue() {
    venta = new SundaySale();
    venta.sell(products);

    Assert.assertEquals(Double.valueOf(315.30975),venta.sell(products));
  }



}
