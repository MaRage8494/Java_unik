package Task17;

public class EmployeeView {
    public void printEmployeeDetails(String EmployeeName, String EmployeeId, int EmployeeSalary){
        System.out.println("Employee Details: ");
        System.out.println("Name: " + EmployeeName);
        System.out.println("Employee ID: " + EmployeeId);
        System.out.println("Employee Salary: " + EmployeeSalary + "$");
    }
}