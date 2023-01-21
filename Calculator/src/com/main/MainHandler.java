package com.main;

import java.util.Scanner;

public class MainHandler {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int ch=0;
	do {
	System.out.println("My Calculator App");
	System.out.println();
	System.out.println("1.Add");
	System.out.println("2.Substract");
	System.out.println("3.Multiply");
	System.out.println("4.Division");
	System.out.println("5.Exit");
	ch = sc.nextInt();
	
	}while(ch!=5);
	
}
}
