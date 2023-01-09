package design.patterns.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {

    private static Servers instance;
    private List<String> serversList;

    public Servers(){
        this.serversList = new ArrayList<>();
    }

    public static Servers getInstance(){
        if(instance == null){
            instance = new Servers();
        }
        return instance;
    }

    public Boolean addServer(String server){
        if(!serversList.contains(server) || server.startsWith("http") || server.startsWith("https")){
            serversList.add(server);
            return true;
        }else{
            System.err.println("Server already Exist in the ServerList");
            return false;
        }
    }

    public List<String> httpLoadServer(){
        return serversList.stream()
                .filter(s -> s.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> httpsLoadServer(){
        return serversList.stream()
                .filter(s -> s.startsWith("https"))
                .collect(Collectors.toList());
    }
}
