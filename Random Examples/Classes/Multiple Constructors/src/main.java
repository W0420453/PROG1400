
public class main
{
    /* Basic Object creation of a class
	CLASSNAME objectName = new CLASSNAME();

	Object Creation of a Class with variables
	CLASSNAME objectName = new CLASSNAME();
	*/

    /* Creating a Vehicle, with default values*/
    Vehicle car = new Vehicle();

	/* Creating a Vehicle, but with an integer, which represents the number of wheels.
	NOTE: a color is NOT being provided
	*/
    Vehicle bike = new Vehicle(2);

	/* Creating a Vehicle, but with an integer, which represents the number of wheels.
	NOTE: a color is NOT being provided
	*/
    Vehicle tricycle = new Vehicle(3);

    Vehicle blueTricycle = new Vehicle(3, "Blue");

    car.PrintProperty();
    bike.PrintProperty();
    tricycle.PrintProperty();
    blueTricycle.PrintProperty();

}

