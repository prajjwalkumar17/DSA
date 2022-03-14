package oops.Composition;

public class Bedsheet {
    private String color;

    public Bedsheet(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void changeBedsheetTogreen(String newcolor) {
        setColor(newcolor);
        System.out.println("The bedsheet color is changed to " + newcolor);
    }
}
