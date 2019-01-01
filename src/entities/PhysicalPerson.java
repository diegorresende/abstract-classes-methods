package entities;

public class PhysicalPerson extends Person{
	
private Double spendingOnHealth;
	
	public PhysicalPerson() {
		
	}

	public PhysicalPerson(String name, Double annualIncome, Double spendingOnHealth) {
		super(name, annualIncome);
		this.spendingOnHealth = spendingOnHealth;
	}

	public Double getSpendingOnHealth() {
		return spendingOnHealth;
	}

	public void setSpendingOnHealth(Double spendingOnHealth) {
		this.spendingOnHealth = spendingOnHealth;
	}

	public double IncomeTax() {
		if(getAnnualIncome()<=20000) {
			return (getAnnualIncome()*0.15) - (spendingOnHealth*0.50);
		}
		else {
		return (getAnnualIncome()*0.25) - (spendingOnHealth*0.50);
		}
	}
	
	public String TaxesPaid() {
		return getName()+": $" + String.format("%.2f", IncomeTax());
	}
	

}
