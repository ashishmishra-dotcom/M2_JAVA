import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Ranking implements Comparable<Ranking>
{
    private String name;
    private long score;

    public Ranking(String name,long score)
    {
        this.name=name;
        this.score=score;
    }

    @Override
    public int compareTo(Ranking r)
    {
        if(this.score<r.score)
            return -1;
        else if(this.score==r.score)
            return 0;
        return 1;
    }

    @Override
    public String toString()
    {
        return this.name+" "+this.score;
    }
}

class RankingMain
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please provide the number of players");
        int n=in.nextInt();
        ArrayList<Ranking> players=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the player "+(i+1));
            String name=in.next();
            System.out.println("Ente the score of the player "+(i+1));
            long score=in.nextLong();
            players.add(new Ranking(name, score));
        }
        Collections.sort(players,Collections.reverseOrder());
        System.out.println("Player Details by Score(High to low)");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+" "+players.get(i-1));
        }
        in.close();
    }
}