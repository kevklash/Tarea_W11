public class Hourly
extends Employee {
  public double hourlyWage;
  public double hoursWorked;

  /* *Constructor */
  public Hourly() {
    hourlyWage = 0;
    hoursWorked = 0;
  }

  /* *Parameterized constructor */
  public Hourly(double hourlyWage, double hoursWorked, String nombre, int serie) {
    this.hourlyWage = hourlyWage;
    this.hoursWorked = hoursWorked;
    this.serialNumber = serie;
    this.name = nombre;
  }

  /* *Getters */
  public double getHourlyWage() {
    return hourlyWage;
  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  /* *Overriding methods from parent class */
  @Override
  public double getGrossPay() {
    return this.hoursWorked * this.hourlyWage;
  }

  @Override
  public double getFedWithholding() {
    return (this.hoursWorked * this.hourlyWage) * 0.15;
  }

  @Override
  public double getStateWithholding() {
    return (this.hoursWorked * this.hourlyWage) * 0.07;
  }

}