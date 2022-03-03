import java.util.*;

class players {
    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {

        String P1 = "";
        String P2 = "";

        String fname = "";
        String lname = "";
        String lname1 = "";
        String lname2 = "";

        String string, string2;

        int space;
        int i = 0;
        int j = 0;

        while (i < 2) {

            while (j == i) {
                string = scan.nextLine();

                space = string.indexOf(" ");
                fname = string.substring(0, space);

                string2 = string.toLowerCase();
                lname = string.substring(space);

                string2 = lname.toLowerCase();
                j++;

            }
            if (i == 0) {
                P1 = fname;
                lname1 = lname;
            }

            else if (i == 1) {
                P2 = fname;
                lname2 = lname;
            }

            i++;
        }

        if (lname1.equals(lname2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}