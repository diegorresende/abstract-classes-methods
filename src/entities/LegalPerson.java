package entities;

public class LegalPerson extends Person {

	private Integer numberOfEmployees;
	
	public LegalPerson() {
		
	}

	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public double IncomeTax() {
		if(numberOfEmployees<=10) {
			return (getAnnualIncome()*0.16);
		}
		else {
		return (getAnnualIncome()*0.14);
		}
	}
	
	public String TaxesPaid() {
		return getName()+": $" + String.format("%.2f",IncomeTax());
	}
}