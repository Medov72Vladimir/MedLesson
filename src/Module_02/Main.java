/*
В классе Main объявлены два массива: strings и output.
Ваша задача — из каждой строки массива strings взять nth-ый символ
и положить его в массив output.
 */
package Module_02;
import java.util.Arrays;
public class Main {
    public static String[] strings = new String[]{
            "Claudius, King of Denmark.",
            "Hamlet, Son to the former, and Nephew to the present King.",
            "Polonius, Lord Chamberlain.",
            "Horatio, Friend to Hamlet.",
            "Laertes, Son to Polonius.",
            "Voltimand, Courtier.",
            "Cornelius, Courtier.",
            "Rosencrantz, Courtier.",
            "Guildenstern, Courtier.",
            "Osric, Courtier.",
            "A Gentleman, Courtier.",
            "A Priest.",
            "Marcellus, Officer.",
            "Bernardo, Officer.",
            "Francisco, a Soldier",
            "Reynaldo, Servant to Polonius.",
            "Players.",
            "Two Clowns, Grave-diggers.",
            "Fortinbras, Prince of Norway.",
            "A Captain.",
            "English Ambassadors.",
            "Ghost of Hamlet's Father."
    };
    public static Character[] output = new Character[strings.length];

    public static void main(String[] args) {
        int nth = 0;
        for (int i = 0; i < strings.length; i++) {
            output[i] = strings[i].charAt(nth);
        }

        Arrays.stream(output).forEach(System.out::print);
    }
}

