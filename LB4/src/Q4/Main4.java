public class Main4 {

    public static void main(String[] args) {

        // Create owner object
        Owner owner1 =
                new Owner("Madusha", "0771234567");

        // Create bicycle object
        Bicycle bike =
                new Bicycle(owner1);

        // Display details
        System.out.println("Owner Name: "
                + bike.getOwner().getOwnerName());

        System.out.println("Phone Number: "
                + bike.getOwner().getPhoneNo());
    }
}