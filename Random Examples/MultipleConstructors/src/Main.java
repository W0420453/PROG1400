public class Main {
    public static void main(String[] args)
    {
        /* Creating a Vehicle object with No Parameters */
        Vehicle car = new Vehicle();

        /* Creating a Vehicle object with ONLY the number of wheels*/
        Vehicle bike = new Vehicle(2);

        /* Creating a Vehicle object with the number of wheels AND a color*/
        Vehicle tricycle = new Vehicle(3, "Blue");

        System.out.println("\nVEHICLE INFORMATION FOR: CAR");
        System.out.println("Number of Wheels: " + car.GetNumOfWheels() );
        System.out.println("Color: " + car.GetColor() );

        System.out.println("\nVEHICLE INFORMATION FOR: BIKE");
        System.out.println("Number of Wheels: " + bike.GetNumOfWheels() );
        System.out.println("Color: "+ bike.GetColor() );

        System.out.println("\nVEHICLE INFORMATION FOR: TRICYCLE");
        System.out.println("Number of Wheels: " + tricycle.GetNumOfWheels() );
        System.out.println("Color: "+ tricycle.GetColor() );

        System.out.println("\n\nChanging the vehicle object 'car' to have 1000 wheels and set the color to Purple");

        car.SetNumOfWheels(1000);
        car.SetColor("Purple");

        System.out.println("\nAFTER SETTING VEHICLE INFORMATION FOR: CAR");
        System.out.println("Number of Wheels: " + car.GetNumOfWheels() );
        System.out.println("Color: " + car.GetColor() );
    }
}