package KI304.Stefaniv.Lab3;

/**
 * This class represents a driver program for testing the Boot class and its waterproof functionality using polymorphism.
 */
public class BootDriver {
    public static void main(String[] args) {
        // Creating a Boot object
        Footwear boot = new Boot("Timberland", "Classic", 44,
                new Sole("Leather", false),
                new Laces(50, "Black"),
                new Upper("Leather"), true);

        // Casting to the Waterproofable interface
        Waterproofable waterproofBoot = (Waterproofable) boot;

        // Displaying information about the waterproofness of the footwear
        System.out.println("Boot is waterproof: " + waterproofBoot.isWaterproof());

        // Changing the waterproof property
        waterproofBoot.setWaterproof(false);

        // Displaying updated information about the waterproofness of the footwear
        System.out.println("Boot is waterproof: " + waterproofBoot.isWaterproof());
    }
}
