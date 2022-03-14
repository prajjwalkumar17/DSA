package oops.Composition;

import java.util.Objects;

public class Lamp {
    String lightColor;
    Boolean isOn;

    public Lamp(String lightColor, Boolean isOn) {
        this.lightColor = lightColor;
        this.isOn = isOn;
    }

    public String getLightColor() {
        return lightColor;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void switchOn(String sWitch) {
        if (Objects.equals(sWitch, "on")) {
            isOn = true;
            System.out.println("The lamp presently is on");
        } else {
            isOn = false;
            System.out.println("The lamp presently is off");
        }
    }
}
