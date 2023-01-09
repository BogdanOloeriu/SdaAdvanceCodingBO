package generics.ex3;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("Olympic");
        Team<FootballPlayer> team1 = new Team<>("Team1");
        Team<FootballPlayer> team2 = new Team<>("Team2");
        Team<FootballPlayer> team3 = new Team<>("Team3");
        Team<FootballPlayer> team4 = new Team<>("Team4");

        footballLeague.add(team1);
        footballLeague.add(team2);
        footballLeague.add(team3);
        footballLeague.add(team4);

        footballLeague.showLeagueTable();
    }
}
