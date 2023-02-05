package week03;

import java.util.Scanner;

public class KeyboardReader {

    Scanner m_sc;

    public KeyboardReader() {
        m_sc = new Scanner(System.in);
    }

    public int getInt(String title) {
        int retv = 0;
        boolean valid = false;
        do {
            try {
                System.out.print(title + " : ");
                String input = m_sc.nextLine();
                retv = Integer.parseInt(input);
                valid = true;
                return retv;
            } catch (NumberFormatException e) {
                System.out.println("only valid integers are allowed");
                System.out.print("Please try again : ");
            }
        } while (!valid);
        return retv;
    }

    public String getString(String title) {
        String retv = "";
        boolean valid = false;
        do {
            try {
                System.out.print(title + " : ");
                String input = m_sc.nextLine();
                valid = true;
                return input;
            } catch (NumberFormatException e) {
                System.out.println("only valid integers are allowed");
                System.out.print("Please try again : ");
            }
        } while (!valid);
        return retv;
    }

}
