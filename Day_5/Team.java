
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Team
{
    private String name;
    private int numberOfMatches;

    public Team(String name,int numberOfMatches)
    {
        this.name=name;
        this.numberOfMatches=numberOfMatches;
    }

    public int getNumberOfMatches()
    {
        return this.numberOfMatches;
    }

    @Override
    public String toString()
    {
        return this.name+"-"+this.numberOfMatches;
    }
}

class TeamComparator implements Comparator<Team>
{
    @Override
    public int compare(Team t1,Team t2)
    {
        if(t1.getNumberOfMatches()<t2.getNumberOfMatches())
            return -1;
        else if(t1.getNumberOfMatches()==t2.getNumberOfMatches())
            return 0;
        return 1;
    }
}

class sorting
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter number of teams:");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Team> teamList=new ArrayList<>();
        int n=Integer.parseInt(in.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter team "+(i+1)+" detail");
            System.out.println("Enter Name");
            String name=in.readLine();
            System.out.println("Enter number of matches");
            int numberOfMatches=Integer.parseInt(in.readLine());
            teamList.add(new Team(name, numberOfMatches));
        }
        Collections.sort(teamList,new TeamComparator());
        System.out.println("Team list after sort by number of matches");
        for(int i=0;i<n;i++)
        {
            System.out.println(teamList.get(i));
        }
        in.close();
    }
}