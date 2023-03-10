package generics.ex3;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;

   private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            System.out.println("Team already exist!");
            return false;
        }else{
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName()+ " " + t.ranking());
        }
    }
}
