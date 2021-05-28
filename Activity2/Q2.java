import java.util.*;
class Innings{
    private String teamname;
    private String inningsname;
    private int runs;
    String getTeamName(){
        return this.teamname;
    }
    void setTeamName(String str){
        this.teamname = str;
    }
    String getInnings(){
        return this.inningsname;
    }
    void setInnings(String str){
        this.inningsname = str;
    }
    int getRuns(){
        return this.runs;
    }
    void setRuns(int runs){
        this.runs = runs;
    }
}

class InningsMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String teamname, inningsname;
        int runs;
        System.out.println("Enter the team name:");
        teamname = sc.nextLine();
        System.out.println("Enter session:");
        inningsname = sc.nextLine();
        System.out.println("Enter runs:");
        runs = sc.nextInt();

        Innings abc = new Innings();
        abc.setTeamName(teamname);
        abc.setInnings(inningsname);
        abc.setRuns(runs);

        System.out.println("Employee Details");
        System.out.println("Name: " + abc.getTeamName());
        System.out.println("Scored: " + abc.getRuns());
        if(abc.getInnings().equals("First")){
            System.out.println("Need " + (abc.getRuns()+1) + " to win");
        } else {
            System.out.println("Match Ended.");
        }
        

        sc.close();
    }
}