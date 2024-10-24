package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService<Integer> pr = new PrintService<>();
		System.out.print("how many values? ");
		int valor = sc.nextInt();
		System.out.println("typer the numbers: ");
		for(int i=0;i<valor;i++) {
			int value = sc.nextInt();
			pr.addvalue(value);
		}
		System.out.println("first: "+pr.fisrt());
		pr.print();
		
		sc.close();

	}

}
