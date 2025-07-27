package com.qspider;

public class StringFunctions {

	public static void main(String[] args) {
			        System.out.println("main starts");
		        String s="Software Developer";
		        System.out.println(s.length());
		        System.out.println("=======");
		        System.out.println(s.toLowerCase());
		        System.out.println("=======");
		        System.out.println(s.toUpperCase());
		        System.out.println("=======");
		        System.out.println(s.startsWith("soft"));
		        System.out.println(s.startsWith("Soft"));
		        System.out.println("=======");
		        System.out.println(s.endsWith("Per"));
		        System.out.println(s.endsWith("per"));
		        System.out.println("=======");
		        System.out.println(s.contains("dev"));
		        System.out.println(s.contains("Dev"));
		        System.out.println("=======");
		        System.out.println(s.concat(" in ty"));
		        System.out.println("=======");
		        System.out.println(s.charAt(3));
		        System.out.println(s.charAt(5));
		        System.out.println("=======");
		        System.out.println(s.indexOf('t'));
		        System.out.println(s.indexOf('a'));
		        System.out.println("=======");
		        String a="java";
		        String b="Java";
		        String c="java";
		        System.out.println(a.equals(b));
		        System.out.println(a.equals(c));
		        System.out.println(a.equalsIgnoreCase(b));
		        System.out.println("=======");
		        String x="hello dinga";
		        System.out.println(x.substring(3));
		        System.out.println(x.substring(3,7));
		        System.out.println("main ends");
		    }

		}
	


