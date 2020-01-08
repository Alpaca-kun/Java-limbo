/**
 * Wand
 */
public class Wand {
    private String name;
    private double power;

    public String getName () {
        return this.name;
    }

    public void setName (String newName) {
        if (newName == null)
            throw new IllegalArgumentException("The name you entered is NULL");
        else if (newName.length() < 3)
            throw new IllegalArgumentException("The name you entered is too short");
        else
            this.name = newName;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower (double newPower) {
        if (newPower < 0.5)
            throw new IllegalArgumentException("The Wand's power is very low!");
        else if (newPower > 100.0)
            throw new IllegalArgumentException("The Wand's power is very high!");
        else
            this.power = newPower;
    }
}