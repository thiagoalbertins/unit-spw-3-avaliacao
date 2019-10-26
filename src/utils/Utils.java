package utils;

public class Utils {

	public static void limparTela() {
		System.out.println(new String(new char[50]).replace("\0", "\r\n"));
	}
}
