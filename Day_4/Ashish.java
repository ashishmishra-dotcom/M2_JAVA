import java.util.*;
class Ashish{
       public static void main(String args[]){
              List<String> l = new ArrayList<String>();
              Scanner input=new Scanner(System.in);
      System.out.println("Enter the names of top 5 teams of IPL season 13");
      for(int j=0; j<5; j++){
              String a =input.nextLine();
                 l.add(a);
              }
        /*for (int i = 0; i < l.size(); i++) {
          System.out.println("\t" + l.get(i));
              }*/
	System.out.println("Enter swap positons");
	int a =input.nextInt();
        int b =input.nextInt();
        Collections.swap(l, a, b);
        for (int i = 0; i < l.size(); i++) {
          System.out.println("\t" + l.get(i));
              }
        
        
   }
}