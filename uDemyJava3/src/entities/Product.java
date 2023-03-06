package entities;

public class Product {

	public String name;
	public double GrossSalary;
	public double Tax;
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100 ;
	}
	
	public String toString() {
		return name + ", $ " + NetSalary();
	}
	
}
