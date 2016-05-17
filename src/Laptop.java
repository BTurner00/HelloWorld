/**
 * Created by Ben on 5/16/16.
 */
public class Laptop {
    String manufacturer;
    double weight;
    boolean hasDVD;
    double screenSize[] = new double[10];

    public Laptop(String manufacturer, double weight, boolean hasDVD, double[] screenSize) {
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.hasDVD = hasDVD;
        this.screenSize = screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String newManufacturer) {
        if((newManufacturer == "Apple")||(newManufacturer == "apple")) {
            manufacturer = newManufacturer;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public boolean gethasDVD() {
        return hasDVD;
    }

    public void setHasDVD(boolean newHasDVD) {
        hasDVD= newHasDVD;
    }

    public double[] getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double[] newScreenSize) {
        screenSize = newScreenSize;
    }
}


