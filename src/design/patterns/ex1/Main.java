package design.patterns.ex1;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Main {

    public static void main(String[] args) {


        Servers servers = Servers.getInstance();
        servers.addServer("https:download!");
        servers.addServer("http:java.remote.course.com");
        servers.addServer("http:inteliji.idea");
        System.out.println(servers.httpLoadServer());

        System.out.println("--------------");
        System.out.println(servers.httpsLoadServer());
    }
}
