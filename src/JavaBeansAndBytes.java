import java.util.Scanner;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen == true) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2006;
        System.out.println("We were actually founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Iced Caramel Latte");
        countCups();
        baristasChoice();


        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink drink1 = new CoffeeDrink(7,
                "vanilla", true);
        //CoffeeDrink drink2 = new CoffeeDrink(8, "caramel iced", false);

       CoffeeDrink drink2 = new CoffeeDrink();
       CoffeeDrink drink3 = new CoffeeDrink(8);


        // TODO
        // Print out the order details
        drink1.printInfo();
        drink2.printInfo();
        //drink3.printInfo();
        //System.out.println(drink2.flavor);
        //drink2.flavor = "caramel";
        System.out.println( "drink 2 flavor is " + drink2.getFlavor() );
        drink2.setFlavor("caramel");
        System.out.println( "drink 2 flavor is " + drink2.getFlavor() );

       // customDrink();
        //returnTypes(5);
        System.out.println("***" + returnTypes(5));

        System.out.println(returnString());

        System.out.println(returnDistance(2, 1, 3, 4));

    }// end of constructor

    public double returnDistance(int x1, int y1, int x2, int y2) {
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return distance;
    }

    public String returnString() {
        String name = "Bob";
        return name;
    }

    public int returnTypes(int a) {
        System.out.println("returnTypes method");
        System.out.println(a);
        return a;
    }

    //method to take a drink order from a customer


    public void customDrink() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cups do you want?");
        int nCups = scanner.nextInt();

        System.out.println(nCups);
    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount = (int) (Math.random() * 31);
        System.out.println("Your random discount is " + discount + "%!");
        //whiile loop for getting the best discount
        //while loop: good for looping an unknown number of times
        //untl some condition is met
        while (discount < 30) {
            discount = (int) (Math.random() * 31);
            System.out.println("Your random discount is " + discount + "%!");
        }
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String Special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Todays Special is the " + Special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int x = 0; x < 6; x++) {
            System.out.println(x);

        }

        int n = 1;
        while (n < 6) {
            System.out.println(n);
            n++;

        }

        // Print 2, 5, 8, 11
        for (int x = 2; x < 12; x = x + 3) {
            if (x < 11) {
                System.out.print(x + ", ");
            } else {
                System.out.println(x);// stoping the commas
            }


        }
        System.out.println("\n"); //putting a space between lines

        // Print 8 to 0
        for (int Potato = 8; Potato > 0; Potato = Potato - 1) {
            System.out.print(Potato + ",");
        }
        int m = 1;
        while (m < 6) {
            System.out.println(n);
            m = m + 1;
        }

        int p = 0;
        while (true) {
            System.out.println(p);
            if (p > 100) {
                break; // end the loop
            }
            if (p % 5 == 0) {
                System.out.println(p);
            }
            p++;
        }
        System.out.println("end of while loop");
    }


        // Method to recommend a coffee based on a random number
        public void baristasChoice () {
            // TODO
            // Make this method generate a random decimal between 0 and 1
            // and print one of four drink recommendations based on its value.
            System.out.println("\n");
            double r = Math.random();
            if (r < 0.25) {
                System.out.println(" The barista recommends a latte");
            } else if (r < .5) {
                System.out.println("Cappuccino");
            } else if (r < .75) {
                System.out.println("Cold whole milk");
            } else {
                System.out.println("Cold Water");
            }
        }
    }



