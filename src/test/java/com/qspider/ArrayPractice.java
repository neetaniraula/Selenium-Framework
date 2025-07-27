package com.qspider;

public class ArrayPractice {

	public static void main(String[] args) {
		System.out.println("main starts");
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=10;
		a[3]=20;
		for(int i = 0;i<=a.length;i++) {
			System.out.println(a[i]);
			System.out.println("=================");
			{	
	boolean[] b = new boolean[3];
	b[0]= true;
	b[1]= false;
	b[2]= true;
System.out.println(b[0]);
System.out.println(b[1]);
System.out.println(b[2]);
for(int j = 0;j<b.length ;j++) {
	System.out.println(b[j]);
}

	
System.out.println("Main ends");
}
}
	}}
	
