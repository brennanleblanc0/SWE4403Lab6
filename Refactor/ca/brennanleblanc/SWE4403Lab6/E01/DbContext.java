package ca.brennanleblanc.SWE4403Lab6.E01;

import java.util.HashMap;
import java.util.Map;

public class DbContext {
  private Map<Integer, DbElement> updatedObjects = new HashMap<>();

  public DbElement getProduct(int id) {
    // Automatically generate SQL statements
    // to read the product with the given ID.
    System.out.printf("SELECT * FROM products WHERE product_id = %d \n", id);

    // Simulate reading a product object from a database.
    var product = new DbElementProxy(new Product(id), this);
    product.setName("Product 1");

    return product;
  }

  public void saveChanges() {
    // Automatically generate SQL statements
    // to update the database.
    for (var updatedObject : updatedObjects.values())
      System.out.printf("UPDATE products SET name = '%s' WHERE product_id = %d \n", updatedObject.getName(), updatedObject.getId());

    updatedObjects.clear();
  }

  public void markAsChanged(DbElement product) {
    updatedObjects.put(product.getId(), product);
  }

}
