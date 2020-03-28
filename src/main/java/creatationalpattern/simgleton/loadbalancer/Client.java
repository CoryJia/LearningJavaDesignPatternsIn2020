package creatationalpattern.simgleton.loadbalancer;

/**
 * @author : Cory Jia on 11/25/19
 */
public class Client {
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
    }
}
