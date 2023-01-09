package generics.ex2;

public class Main {

    public static void main(String[] args) {
        FootballPlayer john = new FootballPlayer("John");
        SoccerPlayer mark = new SoccerPlayer("Mark");
        BaseballPlayer andrew = new BaseballPlayer("Andrew");

        Team<FootballPlayer> team1 = new Team<>("Olympic Team");
        team1.addPlayer(john);
//        team1.addPlayer(mark);
//        team1.addPlayer(andrew);

        System.out.println(team1.teamMembers());

        FootballPlayer mircea = new FootballPlayer("mircea");
        SoccerPlayer mihai = new SoccerPlayer("mihai");
        BaseballPlayer bogdan = new BaseballPlayer("bogdan");

        Team<BaseballPlayer> team2 = new Team<>("National Team");
//        team2.addPlayer(mircea);
//        team2.addPlayer(mihai);
        team2.addPlayer(bogdan);


//        team1.matchResult(team2,1,3);
//        team1.matchResult(team2,2,1);
//        team1.matchResult(team2,3,3);
//        team1.matchResult(team2,5,3);


        System.out.println(team1.getWon());
        System.out.println(team2.getWon());
    }



}
