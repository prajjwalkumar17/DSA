package oops.Polymorphism;

public class Car {
    private Boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public Car() {
        this.engine = true;
        this.cylinders = 0;
        this.name = "name";
        this.wheels = 4;
    }

    public static Car randomCar() {
        int randomNo = (int) (Math.random() * 3) + 1;
        System.out.println("The Random no generated is " + randomNo);
        switch (randomNo) {
            case 1:
                return new Mistubishi();
            case 2:
                return new Porche();
            case 3:
                return new Lamborghini();
        }
        return null;
    }

    public String StartEngine() {
        return "startEngine --:> Car";
    }

    public String Accelerate() {
        return "Accelerate --:> Car";
    }

    public String Brake() {
        return "StartEngine --:> Car";
    }
}

class Mistubishi extends Car {

    public Mistubishi() {
        super(3, "Mistuubishi");
    }

    @Override
    public String StartEngine() {
        return "Mistubishi-->Started";
    }

    @Override
    public String Accelerate() {
        return "Mistubishi-->Accelerated";
    }

    @Override
    public String Brake() {
        return "Mistubishi-->Brake";
    }
}


class Porche extends Car {
    public Porche() {
        super(6, "Porche");
    }

    @Override
    public String StartEngine() {
        return getClass().getSimpleName() + "-->Started";
    }

}

class Lamborghini extends Car {

    public Lamborghini() {
        super(18, "Lamborghini");
    }

    @Override
    public String StartEngine() {
        return "Lamborghini-->Started";
    }

    @Override
    public String Accelerate() {
        return "Lamborghini-->Accelerated";
    }

    @Override
    public String Brake() {
        return "Lamborghini-->Brake";
    }
}
