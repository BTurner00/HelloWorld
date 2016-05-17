/**
 * Created by Ben on 5/16/16.
 */
public class Plant {
    String name;
    boolean isEdible;
    double height;

    public Plant(String name, boolean isEdible, double height) {
        this.name = name;
        this.isEdible = isEdible;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public boolean getIsEdible() {
        return isEdible;
    }

    public void setIsEdible(boolean newIsEdible) {
        isEdible = newIsEdible;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        if (newHeight < 379.7) {
            height = newHeight;
        }
    }

}
