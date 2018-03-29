package crypt.maths;
import java.util.*;

public class Modulo {
	public static String calculate(String n_str, String d_str) {
		int n_int;
		int d_int;

		try {
			d_int = Integer.parseInt(d_str);
			n_int = Integer.parseInt(n_str);
		} catch (NumberFormatException e) {
			//System.out.println("Not a valid number.");
			return "";
		}

		return (Integer.toString(n_int % d_int));
	}
}
