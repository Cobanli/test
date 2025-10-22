package car123;

public class ElectricCar extends Car{
    // Complete the constructor
    // Note we're reinterpreting "fuelLevel" as "batteryLevel"
    public ElectricCar(String model, int batteryLevel){
        super(model, batteryLevel);

    }

    // Override getFuelLevel

    @Override
    public double getFuelLevel() {
        return super.getFuelLevel()/100.0;
    }

    // Reinterprets fuelLevel() as a percentage
    // Remember super.getFuelLevel will return fuelLevel!


    // Override milesLeft

    @Override
    public double milesLeft(double milesPerCharge) {
        return getFuelLevel() * milesPerCharge;
    }

    // Takes one parameter - the total number of miles an ElectricCar
    // gets on a full charge.
    // Computes miles left by interpreting fuelLevel as the
    // battery percentage left in the car


    // Override toString
    // Should print: model electric car

    @Override
    public String toString() {
        return super.toString()+"model cars";
    }
}
