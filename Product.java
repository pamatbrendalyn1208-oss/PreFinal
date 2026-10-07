/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author User
 */
public class Product {
    private String productId;
    private String name;
    private String category;
    private int quantity;
    private final String ProductID;
    private final String Name;
    private final String Category;
    private final int Quantity;
    
    public Product(String ProductID,String Name,String Category,int Quantity) {
      this.ProductID = ProductID;
      this.Name = Name;
      this.Category = Category;
      this.Quantity = Quantity;
        
      
    }

    Product(String string, String milk, int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getProductID(){return ProductID;}
    public String getName(){return Name;}
    public String getCategory(){return Category;}
    public int getQuantity(){return Quantity;}
    
    public void display() {
        System.out.println();
    }
    
    
    
}
