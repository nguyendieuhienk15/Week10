
enum VehicleType {
    VT_TwoWheeler, VT_ThreeWheeler, VT_FourWheeler
};

// Library classes
abstract class Vehicle {

    public abstract void printVehicle();

    public static Vehicle Create(VehicleType type) {
        if (type == VehicleType.VT_TwoWheeler) {
            return new TwoWheeler();
        } else if (type == VehicleType.VT_ThreeWheeler) {
            return new ThreeWheeler();
        } else if (type == VehicleType.VT_FourWheeler) {
            return new FourWheeler();
        } else {
            return null;
        }
    }
;

};
class TwoWheeler extends Vehicle {

    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
};

class ThreeWheeler extends Vehicle {

    public void printVehicle() {
        System.out.println("I am three wheeler");
    }
};

class FourWheeler extends Vehicle {

    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
};

// Client class
class Client {

    Vehicle mVehicle;

    // Client doesn't explicitly create objects
    // but passes type to factory method "Create()"
    public Client() {
        VehicleType type = VehicleType.VT_ThreeWheeler;
        mVehicle = Vehicle.Create(type
        );
    }

    Vehicle getVehicle() {
        return mVehicle;
    }
};

// Driver program
// Driver class
class FactoryPatternDemo {

    public static void main(String args[]) {
        Client pClient = new Client();
        Vehicle pVehicle = pClient.getVehicle();
        pVehicle.printVehicle();
    }
}
