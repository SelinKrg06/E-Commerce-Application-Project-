/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce;

public class Order {
    private User user;
    private Product product;
    private CreditCard creditCard;


    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

   
    public void processOrder(int quantity) {
        if (product != null && user != null && creditCard != null) {
            if (product.getProductStock() > quantity) {
                product.orderProduct(quantity);

                for (int i = 0; i < quantity; i++) {
                    user.getProductsOrdered().add(product);
                }

                System.out.println("Order processed successfully.");
                System.out.println(" ");
                System.out.println("__Ordered Products Properties__ ");
                product.displayProductProperties();
            } else {
                System.out.println("Product is out of stock.");
            }
        } else
            System.out.println("Error, please check product information.");
    }
}
