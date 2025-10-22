package car123;

public class carTester {
    public static void main(String[] args)
    {
        // Create a Car object
        Car compact = new Car("S3", 8);
        Car tesla=new ElectricCar("tesla",12);
        ElectricCar tesla2 = (ElectricCar) new Car("tesla", 25);

        // Print out the model

        // Print out the fuelLevel

        // Print how many miles are left with 23 mpg

        // Print the object

        // Create an ElectricCar object

        // Print out the model

        // Print out the fuelLevel

        // Print how many miles are left with 400 miles per charge

        // Print the object
    }
}
