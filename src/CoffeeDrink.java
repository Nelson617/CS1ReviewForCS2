// CoffeeDrink object class

class CoffeeDrink { //HOMEWORK

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int paramNumberOfCups, String paramFlavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = paramNumberOfCups;
        flavor = paramFlavor;
        hasWhippedCream = true;
        //java defaults to the variable with the smallest scope
        this.hasWhippedCream = hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("You ordered " + numberOfCups + " of " + flavor
        + " coffee ");
        if (hasWhippedCream) {
            System.out.println("with whipped cream");
        }else{
            System.out.println("without whipped cream");

        }
    }
}
