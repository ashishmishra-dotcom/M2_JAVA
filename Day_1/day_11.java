import java.io.*;
import java.util.*;

public class Match{

public static void main(String[] args)
{
Scorecard s=new Scorecard();
Scanner sc=new Scanner(System.in);
//String a=sc.nextLine();
//String b=sc.nextLine();
//int c=sc.nextInt();
System.out.println("Enter the Team Name");
s.setTeamname(sc.nextLine());
System.out.println("Enter Sessions");
s.setInnings(sc.nextLine());
System.out.println("Enter runs");
s.setScore(sc.nextInt());
s.display();
}
}