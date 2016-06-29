import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ben on 6/29/16.
 */
public class Exercise08 {
    public static void main(String[] args) throws FileNotFoundException {
        String saveFile = "people.csv";

        // parse people.csv into array list with first and last names seperated by a space
        // using scanner prompt user for search term
        // print out names that contain term
        ArrayList<String> names = parsePerson(saveFile);

        System.out.println("Enter a name to search: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        //search = search.toLowerCase();
/*
        for( String name : names) {
            if (name.contains(search)) {
                System.out.println(name);
            }
        }*/


        //stream

        names.stream()
                .filter(name -> name.toLowerCase().contains(search.toLowerCase()))
                .forEach(System.out::println);




    }

    public static ArrayList<String> parsePerson(String filename) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        File f = new File(filename);
        Scanner filescanner = new Scanner(f);
        filescanner.nextLine();
        while (filescanner.hasNext()) {
            String line = filescanner.nextLine();
            String[] columns =line.split("\\,");
            String name = columns[1] + " " + columns[2];
            names.add(name);
        }
        return names;
    }
}
