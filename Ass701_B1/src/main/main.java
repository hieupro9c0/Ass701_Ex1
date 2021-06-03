package main;

import Controller.Validate;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Validate v = new Validate();
		System.out.println("====== Validate Program ======");
		System.out.println("Enter phone:");
		String phone = sc.nextLine();
		v.checkPhone(phone);
		System.out.println("Enter Email:");
		String email = sc.nextLine();
		v.checkEmail(email);
		System.out.println("Enter Date:");
		String date = sc.nextLine();
		v.checkDate(date);
		System.out.println("Input: ");
		System.out.println(phone);
		System.out.println(email);
		System.out.println(date);
	}
}
