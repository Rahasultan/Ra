// Implement a class Employee. An employee has a name (a string) and a salary (a double). Provide a constructor
// with two arguments public Employee(String employeeName, double currentSalary) and methods public String getName()
// public double getSalary() public void raiseSalary(double byPercent) These methods return the name and salary,
// and raise the employee’s salary by a certain percentage. Sample usage:
// Employee harry = new Employee("Hacker, Harry", 50000); harry.raiseSalary(10);
// Harry gets a 10 percent raise Supply an EmployeeTester class that tests all methods.
public class Employee {
   private String name;
   private double salary,raise;
   public Employee(String employee_name,double currentsalary)
   {
       name = employee_name;
       salary = currentsalary;
   }
   public String getName()
   {
       return name;
   }
   public double getSalary()
   {
       return salary;
   }
   public void raiseSalary(double byPercent)
   {
       raise =((salary * byPercent)/100);
       salary=salary+raise;
   }

}

