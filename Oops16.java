import java.util.ArrayList;

/*
Design a class ShoppingCart with attributes items (list of products).
Implement methods to add and remove items and calculate total cost.
 */
import java.util.ArrayList;

class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }
}

class ShoppingCart {
    ArrayList<Product> shop = new ArrayList<>();
    ArrayList<Product> cart = new ArrayList<>();

    public ShoppingCart() {
        Product p1 = new Product("computer", 50000, 20);
        Product p2 = new Product("Mouse", 1000, 10);
        Product p3 = new Product("keyboard", 1000, 10);
        Product p4 = new Product("cpu", 20000, 15);

        shop.add(p1);
        shop.add(p2);
        shop.add(p3);
        shop.add(p4);
    }

    public void addToCart(Product p) {
        for (Product p1 : shop) {
            if (p1.getName().equals(p.getName()) && p1.getQuantity() >= p.getQuantity()) {
                p1.decreaseQuantity(p.getQuantity());
                boolean productInCart = false;
                for (Product p2 : cart) {
                    if (p2.getName().equals(p.getName())) {
                        p2.increaseQuantity(p.getQuantity());
                        productInCart = true;
                        break;
                    }
                }

                if (!productInCart) {
                    cart.add(new Product(p.getName(), p.getPrice(), p.getQuantity()));
                }

                System.out.println("Added to cart successfully");
                break;
            }
            else if (p1.getName().equals(p.getName())) {
                System.out.println("Product is out of stock");
                break;
            }
        }
    }

    public void removeFromCart(Product p) {
        for (Product p1 : cart) {
            if (p1.getName().equals(p.getName())) {
                for (Product pShop : shop) {
                    if (pShop.getName().equals(p.getName())) {
                        pShop.increaseQuantity(p1.getQuantity());
                        break;
                    }
                }

                cart.remove(p1);
                System.out.println("Removed from cart successfully");
                break;
            }
        }
    }

    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is Empty");
        } else {
            for (Product p : cart) {
                System.out.println("Product Name : " + p.getName() + "\t\tprice : " + p.getPrice() + "\tQuantity : " + p.getQuantity());
            }
        }
    }

    public void showShop() {
        for (Product p : shop) {
            System.out.println("Product Name : " + p.getName() + "\t\tprice : " + p.getPrice() + "\tQuantity : " + p.getQuantity());
        }
    }

    public int generateBill() {
        int amount = 0;
        for (Product p : cart) {
            amount += (p.getPrice() * p.getQuantity());
        }
        return amount;
    }
}

public class Oops16 {
    public static void main(String[] args) {
        Product p1 = new Product("computer", 50000, 10);
        Product p2 = new Product("Mouse", 1000, 5);
        Product p3 = new Product("keyboard", 1000, 6);

        ShoppingCart s1 = new ShoppingCart();
        s1.showShop();

        s1.addToCart(p1);
        s1.addToCart(p2);
        s1.addToCart(p3);

        s1.showCart();
        System.out.println("Total cost: " + s1.generateBill());

        s1.removeFromCart(p3);
        s1.showCart();
        System.out.println("Total cost: " + s1.generateBill());
        s1.showShop();
    }
}
