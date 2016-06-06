import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by Ben on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "andrew", "edward"};

        //ArrayList<names> that contains the names with only capital letters
        //filter out names that don't start with A
        //ALICE, ANDREW

        ArrayList<String> newNames = new ArrayList<>();

        for (String name : names) {

            newNames.add(name.toUpperCase());
        }

        ArrayList<String> tempNames = new ArrayList<>();

        for (int i = 0; i < newNames.size(); i++) {
            String name = newNames.get(i);
            if (!name.startsWith("A")) {
                tempNames.add(name);
            }
        }

        Iterator<String> iter = newNames.iterator();

        while (iter.hasNext()) {
            String name = iter.next();

            if(!name.startsWith("A")) {
                iter.remove();
            }
        }
        System.out.println(newNames);

        newNames = new ArrayList<>();
        for (String name : names) {
            newNames.add(name);
        }

        newNames = newNames.stream()
                .map((name) -> {
                   return name.toUpperCase();
                })
                .filter((name) -> {
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));
        System.out.println(newNames);
    }


}

