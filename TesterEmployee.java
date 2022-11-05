public class TesterEmployee {
    public static void main(String[] args) {
        Employee emp =new Employee("MARAM",1000);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        emp.raiseSalary(10);
        System.out.println(emp.getSalary());


    }
}
