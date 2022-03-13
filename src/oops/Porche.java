package oops;

public class Porche extends car {
    private String plateno;

    public Porche(String plateno, String topspeed, String model) {
        super("Porche", model, topspeed);
        this.plateno = plateno;
    }

    @Override
    public void Move() {
        System.out.println("The brand new cary has no as " + plateno);
        super.Move();
    }
}
