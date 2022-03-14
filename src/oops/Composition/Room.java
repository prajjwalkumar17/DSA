package oops.Composition;

public class Room {
    private String paint;
    private Bed bed;
    private Lamp lamp;

    public Room(String paint, Bed bed, Lamp lamp) {
        this.paint = paint;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void whatIsbedsheetlengthandcolor() {
        System.out.println("The length of bed is " + bed.getLength()
                + " and the sheets color is " + bed.getBedsheet().getColor());
    }

    public void changebedsheet(String color) {
        bed.getBedsheet().changeBedsheetTogreen(color);
    }

    public void statusOfLampIsItOn() {
        System.out.println(lamp.getOn());
    }

    public void SwitchOffLamp() {
        lamp.switchOn("false");
    }

    public void switchOnLamp() {
        lamp.switchOn("on");
    }

    public Bed getBed() {
        return bed;
    }
}
