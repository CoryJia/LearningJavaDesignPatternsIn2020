package creatationalpattern.simgleton.loadbalancer.IoDH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Cory Jia on 11/25/19
 */
public class LoadBalancer {

    private List<String> serverList = null;

    private static int pointer;

    private LoadBalancer() {
        System.out.println("Create a load balance by Initialization Demand Holder technology.");
        pointer = 0;
        serverList = new ArrayList<>();
    }

    private static class HolderClass{
        private final static LoadBalancer instance = new LoadBalancer();
    }

    public static LoadBalancer getInstance() {
        return HolderClass.instance;
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

    public static void main(String[] args) {
        LoadBalancer loadBalancer1, loadBalancer2, loadBalancer3, loadBalancer4;

        loadBalancer1 = LoadBalancer.getInstance();
        loadBalancer2 = LoadBalancer.getInstance();
        loadBalancer3 = LoadBalancer.getInstance();
        loadBalancer4 = LoadBalancer.getInstance();

        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4) {
            System.out.println("Create a global unique load balancer!!!");
        }

        loadBalancer1.addServer("Server 1");
        loadBalancer1.addServer("Server 2");
        loadBalancer1.addServer("Server 3");
        loadBalancer1.addServer("Server 4");
        loadBalancer1.addServer("Server 5");

        for (int i = 0; i < 10; i++) {
            String server = loadBalancer1.dispatchRequest();

            System.out.println("Dispatch request to: " + server);
        }

        List<Integer> list = Arrays.asList(1,3,2,1,2,3,4,6,1);
         List<Integer> arr = list.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(arr);
    }
}