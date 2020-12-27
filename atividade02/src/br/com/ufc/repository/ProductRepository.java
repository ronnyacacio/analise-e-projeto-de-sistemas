package br.com.ufc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.ufc.exception.PJCException;
import br.com.ufc.exception.PNEException;
import br.com.ufc.model.product.Product;

public class ProductRepository {
  private Map<String, Product> products = new HashMap<String, Product>();

  public void addProduct(Product product) throws PJCException {
    if (!products.containsKey(product.getCode())) {
      products.put(product.getCode(), product);
      return;
    }
    throw new PJCException();
  }

  public Product findProductByCode(String code) throws PNEException {
    Product product = products.get(code);
    if (product == null) {
      throw new PNEException();
    }
    return product;
  }

  public ArrayList<Product> listProdutcs() throws PNEException {
    ArrayList<Product> productList = new ArrayList<Product>();

    for (Product product : products.values())
      productList.add(product);

    if (productList.isEmpty()) {
      throw new PNEException();
    }

    return productList;
  }
}
