/**
 * Created by Ben on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int num = 12345;
        //want 54321
        String nStr = Integer.toString(num);
        char[] array = new char[5];
        int j = 4;
        for(int i = 0; i <5; i++) {
            array[i] = nStr.charAt(j);
            j--;
        }






    }
}
