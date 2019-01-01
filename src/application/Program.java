package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	List<Person> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of tax payers: ");
	int n = sc.nextInt();
	
	for(int i=1; i<=n; i++) {
		sc.nextLine();
		System.out.println("Tax payer #"+i+" data");
		System.out.print("Individual or company?(i/c)");
		char type = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Annual Income: ");
		Double annualIncome = sc.nextDouble();
		
		
		if(type == 'i') {
			System.out.print("Health expenditures: ");
			double spendingOnHealth = sc.nextDouble();
			list.add(new PhysicalPerson(name, annualIncome, spendingOnHealth));
		}
		
		else {
			System.out.print("Number of employeers: ");
			Integer numberOfEmployees = sc.nextInt();
			list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			
		}
	}
	
	double sum=0;
	System.out.println();
	System.out.println("PRICE TAGS:");
	for (Person  per : list) {
		System.out.println(per.TaxesPaid());
		sum += per.IncomeTax();
	}
	
	System.out.print("Total Taxes: "+sum);
	sc.close();
	
	}

}
