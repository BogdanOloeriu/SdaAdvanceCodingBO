package generics.ex2;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team> {

    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private final List<T> playerList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player){
        if(playerList.contains(player)){
            System.out.println("Player name: " + player.getName() + " exist in the team!");
            return false;
        }else{
            playerList.add(player);
            return true;
        }
    }

    public Integer teamMembers(){
        return this.playerList.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = "beat";
        }else if(ourScore == theirScore){
            tied++;
            message = "drew with" ;
        }else {
            lost++;
            message = "lost against ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + " " + message + " " + opponent.getName());
            opponent.matchResult(null,ourScore,theirScore);
        }
    }

    public int ranking(){
        return (won*2) +tied;
    }

    @Override
    public int compareTo(Team team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }
}
