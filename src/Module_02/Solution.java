package Module_02;

public class Solution {
    public static void numberToWorld(int number) {
        String num = Integer.toString(number);
        if (num.length() == 1) {
            if (number % 2 == 0) {
                System.out.println("even single digit number");
            } else {
                System.out.println("odd single digit number");
            }
        }
        if (num.length() == 2) {
            if (number % 2 == 0) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }
        }
        if (num.length() == 3) {
            if (number % 2 == 0) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
    }

    public static void main(String[] args) {
        numberToWorld(0);
    }
}

