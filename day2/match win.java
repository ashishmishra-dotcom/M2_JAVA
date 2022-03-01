import java.util.Scanner;


public class match{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String a = sc.nextLine();
        System.out.println("Enter session:\r");
        String b=sc.nextLine();
        String c= " to win";
        System.out.println("Enter runs:\r");
        int z=sc.nextInt();
        if(b.equals("First") || b.equals("first"))
        {
            ++z;
            System.out.println("Name:" + a);
            System.out.println("Scored:" + b);
            System.out.println("Need " + z + c);
        }
       else if(b.equals("second") || b.equals("Second")){
           System.out.println("Name:" + a);
           System.out.println("Scored:" + b);
           System.out.println("Matched Ended.");
       }
       else{
        System.out.println("Invalid Input.");
       }
       sc.close();
    }

}