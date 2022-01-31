import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
public class Kadai {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> network_interfaces = NetworkInterface.getNetworkInterfaces();
            while (network_interfaces.hasMoreElements()){
                NetworkInterface name_interface = network_interfaces.nextElement();
                System.out.print(name_interface.getName() + ": ");
                Enumeration<InetAddress> ip_num = name_interface.getInetAddresses();
                while (ip_num.hasMoreElements()){
                    System.out.println(ip_num.nextElement());
                }
                System.out.println();
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}