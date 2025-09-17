package corejava;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
		String s="piyush jawak";
		String p="       Cravita                                      ";
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('y'));
		System.out.println(s.equals("piyuSh"));
		System.out.println(s.concat("jawak"));
		System.out.println(s.contains("w"));
		System.out.println("p");
		System.out.println(s.endsWith("h"));
		System.out.println(s.startsWith("p"));
		System.out.println("2");
		System.out.println(s.equalsIgnoreCase("Piyush"));
		System.out.println(s.replace("h", "H"));
		System.out.println(s.isEmpty());//is string are empty
		System.out.println(s.isBlank());//only white spaces
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		char sr[]=s.toCharArray();
		System.out.println(Arrays.toString(sr));
		System.out.println(s.substring(0, 3));
		System.out.println("3");
		System.out.println(p.trim());
		System.out.println(p);
		String str="Pune,Ahilyanagar,Mumbai";
		String ns[]=str.split(",");
		System.out.println(Arrays.toString(ns));
		System.out.println();
	}

}
