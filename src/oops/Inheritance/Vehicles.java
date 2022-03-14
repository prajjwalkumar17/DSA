package oops.Inheritance;

public class Vehicles {
    private String Steering;
    private String classType;
    private String wheels;
    private String geers;
    private String maxSpeed;


    public Vehicles(String classType, String maxSpeed, String wheels) {
        this("automatic", classType, wheels, "geers", maxSpeed);
    }

    public Vehicles() {
        this("automatic", "Unspecifiedvehicle", "wheelsUnknown", "Geers 5", "not known of now");
    }

    public Vehicles(String steering, String classType, String wheels, String geers, String maxSpeed) {
        Steering = steering;
        this.classType = classType;
        this.wheels = wheels;
        this.geers = geers;
        this.maxSpeed = maxSpeed;
    }


    public void Move() {
        System.out.println("The vehicle that is " + classType + " moves with top speed of " + maxSpeed);
    }

    public void NoOfWheels() {
        System.out.println("The " + classType + " has " + wheels + " no.of wheels");
    }
}
