package design.patterns.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServersThread {

    private static ServersThread instance;
    private List<String> serverList;

    public ServersThread(){
        serverList = new ArrayList<>();
    }

    public static ServersThread getInstance(){
        if(instance == null){
            synchronized (ServersThread.class){
                if(instance == null){
                    instance = new ServersThread();
                }
            }
        }
        return instance;
    }

    public Boolean addToServer(String serversThread){
        if(!serverList.contains(serversThread) || serversThread.startsWith("http") || serversThread.startsWith("https")){
            serverList.add(serversThread);
            return true;
        }else{
            return false;
        }
    }

    public List<String> httpLoadServers(){
        return serverList.stream()
                .filter(s-> s.startsWith("http"))
                .collect(Collectors.toList());
    }

    public List<String> httpsLoadServers(){
        return serverList.stream()
                .filter(s-> s.startsWith("https"))
                .collect(Collectors.toList());
    }
}
