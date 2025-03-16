
package ecommerce;

public class Test {
   public static void main(String[] args) {
        User user1 = new User("cbustudent", "Zeynep", "Tirman", "23/09/2024", "password123", "zey@mail.com", "123 Manisa ", "School");
        User user2 = new User("oopstudent", "Selin", "Kargi", "04/04/2024", "password456", "sel@mailcom", "789 Manisa", "School123");

        
        CreditCard card1 = new CreditCard("1234 5678 9012 3456", user1, "123", "11/22");
        CreditCard card2 = new CreditCard("7891 0111 2131 4151", user2, "456", "33/44");

        
        user1.getCreditCards().add(card1);
        user2.getCreditCards().add(card2);

        
        Product product1 = new Product("pen", "Maroon", "Stationary", 15, 0.2, "Most in demand pen.");
        Product product2 = new Product("headphone", "Pink", "Electronics", 20, 0.3, "102 dB ");
        
        System.out.println("***ORDER PAGE*** ");
        System.out.println(" ");
        
        System.out.println(user1.getUsername() + " ordered: ");
       
        Order order1 = new Order(user1, product1, card1);
        order1.processOrder(5);
        
        System.out.println(" ");
        System.out.println( user2.getUsername() + " ordered: ");
        
        Order order2 = new Order(user2, product2, card2);
        order2.processOrder(1);  
        
        user1.addToFavorites(product1);
        user2.addToFavorites(product2);
        
        System.out.println("\nUser 1 Information:");
        displayUserInfo(user1);
        
        System.out.println("\nUser 2 Information:");
        displayUserInfo(user2);
    }

    
    public static void displayUserInfo(User user) {
        System.out.println("Username: " + user.getUsername());
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Date of Birth: " + user.getDateOfBirth());
        System.out.println("Email Address: " + user.getEmailAddress());
        System.out.println("Home Address: " + user.getHomeAddress());
        System.out.println("Work Address: " + user.getWorkAddress());
        System.out.println("Products Ordered: " + user.getProductsOrdered());
        System.out.println("Favorite Products: " + user.getFavoriteProducts());
        System.out.println("Credit Cards: ");
        for (CreditCard card : user.getCreditCards()) {
            System.out.println("   Card Number: " + card.getCardNumber());
            System.out.println("   Card User: " + card.getCardUser().getName() + " " + card.getCardUser().getSurname());
            System.out.println("   Expiration Date: " + card.getExpirationDate());
            System.out.println();
        }
    } 
}
