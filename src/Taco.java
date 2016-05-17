/**
 * Created by Ben on 5/16/16.
 */
public class Taco {
    boolean hardShell;
    int numToppings;
    String from;

    public Taco(boolean hardShell, int numToppings,  String from){
        this.hardShell = hardShell;
        this.numToppings = numToppings;
        this.from = from;
    }

    public boolean getHardShell() {
        return hardShell;
    }

    public void setHardShell(boolean newHardShell) {
        hardShell = newHardShell;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int newNumToppings) {
        if(newNumToppings<10) {    //too many toppings
           numToppings = newNumToppings;
        }
    }


    public String getFrom() {
        return from;
    }

    public void setfrom(String newFrom) {
        from = newFrom;
    }
}
