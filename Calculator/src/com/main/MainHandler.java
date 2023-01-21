package com.main;

import java.util.Scanner;

import com.main.service.ServiceHandler;

public class MainHandler {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	ServiceHandler service =new ServiceHandler();
	int ch=0;
	do {
	System.out.println("My Calculator App");
	System.out.println();
	System.out.println("Enter number 1:");
    int a = sc.nextInt();
    System.out.println("Enter number 2:");
    int b = sc.nextInt();
	System.out.println("1.Add");
	System.out.println("2.Substract");
	System.out.println("3.Multiply");
	System.out.println("4.Division");
	System.out.println("5.Exit");
	ch = sc.nextInt();
	switch(ch) {
	case 1: System.out.println("Result:"+service.add(a, b));
			break;
	default: System.out.println("Invalid character");
			 break;
	}
	}while(ch!=5);
	
}
}
