import java.util.*;
class Name{
     static String convert(String F)
     {
         char ch[] = F.toCharArray();
         for (int i = 0; i < F.length(); i++) {
             if (i == 0 && ch[i] != ' ' ||
                ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                   ch[i] = (char)(ch[i] - 'a' + 'A');
                 }
            }
            
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
 
                ch[i] = (char)(ch[i] + 'a' - 'A');           
        }
        String st = new String(ch);
        return st;
         
 }
public static void main(String[] args){
         Scanner myObj = new Scanner(System.in);
         String F = myObj.nextLine();
         String S = myObj.nextLine();
         System.out.println(convert(F) + S.toUpperCase());
         myObj.close();
         }
}