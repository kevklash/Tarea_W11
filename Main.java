import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    System.out.println("Payroll Report");
    
    /* *Creating the ArrayList */
    ArrayList<Employee>employees = new ArrayList<>();
    employees.add(new Hourly(15, 30, "Harry Hacker", 123));
    employees.add(new Hourly(12.50, 20, "Isabel Intern", 233));
    employees.add(new Salaried(80000, "Cathy Coder", 611));

    for(Employee i : employees) {
      System.out.println("Employee: " + i.getName()  + " Serial: " + i.getSerialNumber());
      System.out.format("Gross pay: $%3.2f \n", i.getGrossPay());
      System.out.format("Federal Withholding: $%3.2f \n", i.getFedWithholding());
      System.out.format("State Withholding: $%3.2f \n", i.getStateWithholding());
      System.out.format("Net pay: $%5.2f", (i.getGrossPay() - (i.getFedWithholding() + i.getStateWithholding())) );
      System.out.println("\n");
    }
    System.out.println("Goodbye.");
  }
}