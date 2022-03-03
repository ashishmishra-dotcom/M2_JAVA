import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] as) {
        
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name: ");
        String F=sc.next();
	System.out.println("Enter last name: ");
        String S=sc.next();
        
        int len_A = F.length();
        int len_B = S.length();
        System.out.println((("Output: "+ F.substring(0,1)).toUpperCase()+(F.substring(1,len_A).toLowerCase()))+" "+ ((S.toUpperCase())));
    }
}