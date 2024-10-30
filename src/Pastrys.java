public class Pastrys {
    //homework
    // New class Pastry, variables type, flavor, number with "getter" and "setter" methods
    private int numberOfPastries;
    private String nameOfPastry;
    private String flavor;

    public void Pastry (int paramNumber0fPastries, String type, String name0fPastry){

        numberOfPastries = paramNumber0fPastries;
        this.nameOfPastry = name0fPastry;
        this. flavor = type;

        pastries();
    }

    public void pastries(){

        numberOfPastries = 2;
        flavor = "strawberry";
        nameOfPastry = "donuts";

}
    public String getType () { return flavor; }
        //public void type(String type) { this. flavor = flavor; }

        public void printInfo(){
        System.out.println("Your order comes with " + numberOfPastries + flavor + nameOfPastry);


        }
    public String getFlavor() {
        return flavor;

    }
    public void setFlavor(String flavor ) {
        this.flavor = flavor;
    }
}

