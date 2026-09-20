package network;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostInspector {
    public static void main (String[] args) {
        if (args.length !=1 ) {
        System.out.println("Usage: Java NetWork.HostInspector <hostname>");
        return;
    }
    try {
        InetAddress [] addresses = InetAddress. getAllByname(args[0]);
        System.out.println("Host: " + args [0]);

        for (InetAddress address: addresses) {
            System.out.println("- IP : " + addresses.getHostAddress());
            System.out.println(" Canonical: " + address.getCanonicalHostName());
            System.out.println(" Loopback: " + address.isLoopbackAddress());
            System.out.println(" Site local: " + address.isSiteLocalAddress());
        }
    } catch (UnknownHostException e) {
        System.err.println("Không phân giải được HOST: " + args[0]);
    }
  }

}
