// 1. Using Records eliminates boilerplate and optimizes heap allocation for data objects
interface Vehicle {
    String getType();
}

record Car() implements Vehicle {
    @Override public String getType() { return "Car"; }
}

record Bike() implements Vehicle {
    @Override public String getType() { return "Bike"; }
}

record Truck() implements Vehicle {
    @Override public String getType() { return "Truck"; }
}

// 2. Functional Interface allows using method references instead of boilerplate factory subclasses

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

// Concrete factories implementation using your existing hierarchy pattern
class CarFactory extends VehicleFactory {
    @Override Vehicle createVehicle() { return new Car(); }
}

class BikeFactory extends VehicleFactory {
    @Override Vehicle createVehicle() { return new Bike(); }
}

class TruckFactory extends VehicleFactory {
    @Override Vehicle createVehicle() { return new Truck(); }
}
