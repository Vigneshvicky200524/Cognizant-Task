import java.util.Scanner;

public class ECommerceSearch {

    public static void main(String[] args) {

        // Array of products
        String[] products = {
            "Laptop",
            "Mobile",
            "Headphones",
            "Camera",
            "Smartwatch"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product to search: ");
        String searchProduct = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(searchProduct)) {
                System.out.println("Product found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }

        sc.close();
    }
}