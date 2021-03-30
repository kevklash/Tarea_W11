public class Salaried
extends Employee {
  public double annualSalary;

  /* *Constructor */
  public Salaried() {
    annualSalary = 0;
  }

  /* *Parameterized constructor */
  public Salaried(double annualSalary, String nombre, int serie) {
    this.annualSalary = annualSalary;
    this.name = nombre;
    this.serialNumber = serie;
  }

  /* *Getter */
  public double getAnnualSalary() {
    return 0;
  }

  /* *Overriding methods from parent class */
  @Override
  public double getGrossPay() {
    return this.annualSalary / 52;
  }

  @Override
  public double getFedWithholding() {
    return (this.annualSalary / 52) * 0.15;
  }

  @Override
  public double getStateWithholding() {
    return (this.annualSalary / 52) * 0.07;
  }
}