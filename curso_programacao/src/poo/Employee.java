package poo;

public class Employee {

	public String name;
	public double grossSalary; //salario bruto
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
		
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}
	
	public String toString() {
		return "Updated data: " + name + ", $ " + netSalary();
	}
}
