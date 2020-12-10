package br.com.ufc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.ufc.exception.PJCException;
import br.com.ufc.exception.PNEException;
import br.com.ufc.model.product.Product;

public class ProductRepository {
  private Map<String,Product> products = new HashMap<String,Product>();

  public void addProduct(Product product) throws PJCException {
    if (!products.containsKey(product.getCode())) {
      products.put(product.getCode(), product);
      return;
    }
    throw new PJCException();
  }

  public Product findProductByCode(String code) throws PNEException {
    Product product = products.get(code);
    if(product == null) {
      throw new PNEException();
    }
    return product;
  }

  public ArrayList<Product> listProdutc() throws PNEException {
    ArrayList<Product> product = new ArrayList<Product>();

    for (Product product2 : products.values()){ // Preenchendo o array com os produtos
      product.add(product2);
    }

    if(product.isEmpty()){ // É lançado uma exception caso não exista nenhum produto
      throw new PNEException();
    }

    return product; // Retornando o array de produtos
  }
}
