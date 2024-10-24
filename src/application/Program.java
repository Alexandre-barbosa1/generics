package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> print = new PrintService<>();
		System.out.println("quantos valores? ");
		int valor = sc.nextInt();
		for(int i=0;i<valor;i++) {
			int value = sc.nextInt();
			print.addvalue(value);
		}
		System.out.println("first: "+print.fisrt());
		print.print();
		
		
		
		
		
		
		sc.close();

	}

}
