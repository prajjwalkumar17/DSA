package oops;

public class car extends Vehicles {
    private String company;
    private String model;
    private String wheels;
    private String topSPeed;
    private String color;

    public car() {
        this("Company Unknown but of car", "Model Unknown but of car", "unknown but of car", "Top speed but of car", "color unknown");
    }

    public car(String company, String model, String wheels, String topSPeed, String color) {
        this.company = company;
        this.model = model;
        this.wheels = wheels;
        this.topSPeed = topSPeed;
        this.color = color;
    }

    public car(String company, String model, String topSPeed) {
        super("car", topSPeed, "4");
        this.company = company;
        this.model = model;
    }


    @Override
    public void Move() {
        System.out.println("The car of " + company + " and of model " + model);
        super.Move();
    }
}
