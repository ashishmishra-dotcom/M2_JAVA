import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1,p2;
        p1=sc.nextLine();
        p2=sc.nextLine();
        String lp1=p1.substring(p1.lastIndexOf(" ")+1);
        String lp2=p2.substring(p2.lastIndexOf(" ")+1);
        String llp1=lp1.toLowerCase();
        String llp2=lp2.toLowerCase();
        if(llp1.equals(llp2))
        {
        System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
        sc.close();
    }
}