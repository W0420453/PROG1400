public class Vehicle {
    /* Setting the Default values for the Vehicle Class */
    int numOfWheels = 4;
    String color = "Red";




    /*This is a blank constructor to prevent errors when calling Vehicle with no variables.
    Default values are already applied so no code needs to be inside the constructor, but it could be assigned here.
    REQUIRED if no arguments are given, despite not doing anything itself */
    public Vehicle() {
        /* Including both of the following lines are redundant, including them will not throw errors but is pointless
        this.numOfWheels = 4;
        this.color = "Red";
         */


    }

    public Vehicle(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
        /* Not needed due to default values being set on line 3
        this.color = "Red";
         */
    }

    public Vehicle(int numOfWheels, String color)
    {
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    /* Setter for the Number of Wheels of the Vehicle
    This method has commented out code to prove that numOfWheels != this.numOfWheels when the method is first called*/
    public void SetNumOfWheels(int numOfWheels)
    {
        /*
        PRE-MODIFICATION to this.numOfWheels
        System.out.println("Desired Change to Number of Wheels: " + numOfWheels);
        System.out.println("Current Number of Wheels (this.numOfWheels): "+ this.numOfWheels);
         */
        this.numOfWheels = numOfWheels;
        /*
        POST-MODIFICATION to this.numOfWheels
        System.out.println("Desired Change to Number of Wheels" + numOfWheels);
        System.out.println("Current Number of Wheels (this.numOfWheels): "+ this.numOfWheels);
         */
    }

    /* Getter for the number of wheels of the Vehicle*/
    public int GetNumOfWheels()
    {
        return this.numOfWheels;
    }

    /* Setter for the color of the Vehicle */
    public void SetColor(String color)
    {
        this.color = color;
    }

    /* Getter for the color of the Vehicle */
    public String GetColor()
    {
        return this.color;
    }

}
