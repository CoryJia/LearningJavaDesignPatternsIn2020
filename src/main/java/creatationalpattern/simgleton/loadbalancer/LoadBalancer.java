package creatationalpattern.simgleton.loadbalancer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Cory Jia on 11/25/19
 */
public class LoadBalancer {
    private static LoadBalancer instance = null;

    private List<String> serverList = null;

    private static int pointer;

    private LoadBalancer() {
        pointer = 0;
        serverList = new ArrayList<>();
    }

    public static LoadBalancer getInstance() {
        if (instance == null) {
            synchronized (Object.class) {
                if (instance == null) {
                    instance = new LoadBalancer();
                }
            }
        }

        return instance;
    }

    public void addServer(String serverId) {
        if (!serverList.contains(serverId)) {
            serverList.add(serverId);
        }
    }

    public void removeServer(String serverId) {
        serverList.remove(serverId);
    }

    public  String dispatchRequest() {
        String serverId = serverList.get(pointer);
        synchronized (Object.class){
            pointer = ++pointer % serverList.size();
        }
        return serverId;
    }
}
