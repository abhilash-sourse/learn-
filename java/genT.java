public class genT {
    public static void main(String[] args) {
        // Create a generic object
        Product<String, Double> product = new Product<>("Apple", 0.30);

        // Access data
        System.out.println("Item: " + product.getItem());
        System.out.println("Price: " + product.getPrice());
    }
}

// Generic class definition