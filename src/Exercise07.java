/**
 * Created by Ben on 6/28/16.
 */
public class Exercise07 {
    public static void main(String[] args) {
        String racecar = "racecar";
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome(racecar));
    }

    public static boolean isPalindrome(String input){
        char[] array = input.toCharArray();
        int size = array.length;
        int j = size-1;
        char[] reverse = new char[size];
        for (int i =0; i<size; i++) {
            reverse[j] = array[i];
            j--;
        }
        String revStr = new String(reverse);
        if (revStr.equals(input)){
            return true;
        } else return false;


    }
}
