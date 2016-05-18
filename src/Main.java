import javax.sound.midi.Soundbank;

/**
 * Created by McLoy on 18.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println((double)20*1/3+Math.pow(158,2));
        ////////////////////////////////////////
        double a = 14;
        System.out.println(a/209+a*(29-Math.pow(13,2)+a/3));
        /////////////////////////////////////////////
        int n = 73, result = 0;
        String word = "";
        word = word + n;
        char[] CharBox = word.toCharArray();

        for (int i = 0; i < CharBox.length; i++) {
            result = result + Character.getNumericValue(CharBox[i]);
        }
        System.out.println("Result summary of concatination digit " + n + " is: " + result);
        ///////////////////////////////////
        double f = 14.567;
        System.out.println((int)f);
        /////////////////////////////////////
        


    }
}
