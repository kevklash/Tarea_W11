public class Employee{
  public String name;
  public int serialNumber;

  /* *Constructor */
  public Employee() {
    this.name = "none";
    this.serialNumber = 0;
  }

  /* *Parameterized Constructor */
  public Employee(String nombre, int serie) {
    this.name = nombre;
    this.serialNumber = serie;
  }

  /* *Getters */
  public String getName() {
    return name;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public double getGrossPay() { return 0; }

  public double getFedWithholding() { return 0; }

  public double getStateWithholding() { return 0; }

}