// CoffeeDrink object class

// New class Pastry, variables type, flavor, number with "getter" and setter" methods
class CoffeeDrink { //HOMEWORK

    public int numberOfCups;
    private String flavor;
    public boolean hasWhippedCream;

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


    public CoffeeDrink() {
       numberOfCups = 1;
       flavor = "coffee";
       hasWhippedCream = false;
    }//default order


    public CoffeeDrink(int paramNumberOfCups){
        numberOfCups = paramNumberOfCups;
        flavor = "coffee";
        hasWhippedCream = false;
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

    public String getFlavor() {
        return flavor;

    }
    public void setFlavor(String flavor ) {
        this.flavor = flavor;
    }
}
