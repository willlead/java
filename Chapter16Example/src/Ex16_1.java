import java.net.*;

public class Ex16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// InetAddress ip = null;
		byte[] ip = { (byte) 192, (byte) 168, (byte) 10, (byte) 100 };
		byte[] subnet = { (byte) 255, (byte) 255, (byte) 255, (byte) 0 };

		byte[] network = new byte[4];
		byte[] host = new byte[4];

		for (int i = 0; i < ip.length; i++) {
			network[i] = (byte) (ip[i] & subnet[i]);
		}
		System.out.print("匙飘况农 林家: ");
		for (int i = 0; i < network.length; i++) {

			System.out.print(network[i] >= 0 ? network[i] : network[i] + 256);
			System.out.print(".");

		}
		System.out.println();
		for (int i = 0; i < ip.length; i++) {
			host[i] = (byte) (ip[i] & ~subnet[i]);
		}
		System.out.print("龋胶飘 林家: ");
		for (int i = 0; i < host.length; i++) {

			System.out.print(host[i] >= 0 ? host[i] : host[i] + 256);
			System.out.print(".");

		}
	}

}
