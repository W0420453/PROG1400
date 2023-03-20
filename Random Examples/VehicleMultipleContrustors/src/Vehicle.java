public class Vehicle {
    int numOfWheels;
    String color;

    public Vehicle() {
        this.numOfWheels = 4;
        this.color = "Red";
    }

    public Vehicle(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
        this.color = "Red";
    }

    public Vehicle(int numOfWheels, String color)
    {
        this.numOfWheels = numOfWheels;
        this.color = color;
    }

    public void SetNumOfWheels(int numOfWheels)
    {
        System.out.println(numOfWheels);
        System.out.println(this.numOfWheels);
        this.numOfWheels = numOfWheels;
    }


    public void PrintInformation() {
        System.out.println("VEHICLE INFORMATION");
        System.out.println("Number of Wheels:" + this.numOfWheels);
        System.out.println("Color: " + this.color + "\n");
    }
}
