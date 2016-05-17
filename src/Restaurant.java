/**
 * Created by Ben on 5/16/16.
 */
public class Restaurant {
    String name;
    int sqft;
    int numEmployees;
    String cuisineType;
    boolean openLunch;
    String[] menuItems = new String[50];

    public Restaurant( String name, int sqft, int numEmployees, String cuisineType, boolean openLunch, String[] menuItems) {
        this.name = name;
        this.sqft = sqft;
        this.numEmployees = numEmployees;
        this.cuisineType = cuisineType;
        this.openLunch = openLunch;
        this.menuItems = menuItems;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int newSqft) {
        sqft = newSqft;

    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(int newNumEmployees) {
        if(newNumEmployees>0) {
            numEmployees = newNumEmployees;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;

    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String newCuisineType) {
        cuisineType = newCuisineType;

    }

    public boolean getOpenLunch() {
        return openLunch;
    }

    public void setOpenLunch(boolean newOpenLunch) {
        openLunch = newOpenLunch;

    }
    public String[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[] newMenuItems) {
        menuItems = newMenuItems;

    }
}
