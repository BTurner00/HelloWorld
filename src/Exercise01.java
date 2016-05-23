import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ben on 5/23/16.
 */
public class Exercise01 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Charlie", "Bob", "David", "Andrea", "Albert", "Beth"};
        //A: [Alice, Albert, Andrea]
        //B: [Bob, Beth]
        //C: [Charlie]
        //D: [David]

        HashMap<String, ArrayList<String>> nameMap = new HashMap<>();

        //A []
        //B []
        //C []
        //D []

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            nameMap.put(firstLetterStr, new ArrayList<>());

        }
        System.out.println(nameMap);

        for (String name : names) {
            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            arr.add(name);



        }
        System.out.println(nameMap);


        nameMap = new HashMap<>();
        for (String name: names) {

            char firstLetter = name.charAt(0);
            String firstLetterStr = String.valueOf(firstLetter);
            ArrayList<String> arr = nameMap.get(firstLetterStr);
            if (arr==null){
                arr = new ArrayList<>();
                arr.add(name);
                nameMap.put(firstLetterStr, arr);
            } else {
                arr.add(name);
            }
        }
        System.out.println(nameMap);

    }

}
