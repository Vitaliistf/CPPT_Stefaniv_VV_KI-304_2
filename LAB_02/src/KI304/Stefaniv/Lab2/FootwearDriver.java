package KI304.Stefaniv.Lab2;

/**
 * The `FootwearDriver` class and its main method serve as the entry point of the program and demonstrate the usage
 * of the `Footwear` class to create footwear objects and interact with them. The program creates two footwear objects,
 * displays information about them, modifies their properties, and compares them using the `equals` method.
 */
public class FootwearDriver {

    public static void main(String[] args) {
        // Create a footwear object
        Footwear footwear1 = new Footwear("Nike", "Air Max", 42,
                new Sole("Rubber", true),
                new Laces(120, "White"),
                new Upper("Mesh"));

        // Display information about footwear
        System.out.println("Information about footwear 1:");
        System.out.println(footwear1);

        // Modify the size and sole material
        footwear1.setSize(43);
        footwear1.getSole().setMaterial("EVA");

        // Lace up the shoes
        footwear1.laceUp();

        // Display updated information about footwear
        System.out.println("\nUpdated information about footwear 1:");
        System.out.println(footwear1);

        // Create another footwear object
        Footwear footwear2 = new Footwear("Adidas", "Superstar", 41,
                new Sole("Rubber", true),
                new Laces(100, "Black"),
                new Upper("Leather"));

        // Compare two footwear objects using equals
        System.out.println("\nAre footwear 1 and footwear 2 equal: " + footwear1.equals(footwear2));
    }
}
