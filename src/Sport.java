/**
 * Created by Ben on 5/16/16.
 */
public class Sport {
    String name;
    double avgGameLength;
    int rosterSize;
    String originCountry;

    public Sport(String name, double avgGameLength, int rosterSize, String originCountry) {
        this.name = name;
        this.avgGameLength = avgGameLength;
        this.rosterSize = rosterSize;
        this.originCountry = originCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getAvgGameLength() {
        return avgGameLength;
    }

    public void setAvgGameLength(double newAvgGameLength) {
        avgGameLength = newAvgGameLength;
    }

    public int getRosterSize() {
        return rosterSize;
    }

    public void setRosterSize(int newRosterSize) {
        if (newRosterSize > 0) {
            rosterSize = newRosterSize;
        }
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String newOriginCountry) {
        originCountry = newOriginCountry;
    }


}
