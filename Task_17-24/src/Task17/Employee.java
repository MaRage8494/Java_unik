package Task17;

public class Employee {
    private String EmployeeName;
    private String EmployeeId;
    private int EmployeeSalary;
    private int EmployeeHours;

    public String getId(){
        return EmployeeId;
    }

    public String getName() {
        return EmployeeName;
    }

    public int getSalary() {
        return EmployeeSalary;
    }

    public void setId(String Id) {
        EmployeeId = Id;
    }

    public void setName(String Name) {
        EmployeeName = Name;
    }

    public void setSalary(int Hours) {
        int Salary = Hours * 10;
        EmployeeSalary = Salary;
    }
}
