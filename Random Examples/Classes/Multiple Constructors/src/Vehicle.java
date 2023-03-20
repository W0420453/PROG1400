public class Vehicle
{
    int numOfWheels;
    int numOfDoor;
    String color;

    public Vehicle()
    {
        this.numOfWheels = 4;
        this.color = "red";
        System.out.println("Vehicle has been made with All Default Parameters");
    }

    public Vehicle(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
        this.color = "red";
        System.out.println("Vehicle has been given a number of wheels, but no color");
    }

    public Vehicle(int numOfWheels, String color)
    {
        this.numOfWheels = numOfWheels;
        this.color = color;
        System.out.println("Vehicle has been all required parameters");
    }

    public void PrintProperty()
    {
        System.out.println("VEHICLE PROPERTY'S");
        System.out.println("Number of Wheels: "+ numOfWheels);
        System.out.println("Color of Vehicle: "+ color +"\n");
    }

}
