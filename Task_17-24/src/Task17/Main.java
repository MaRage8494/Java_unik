package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Employee model = CreateEmployee();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        System.out.println("------------------------------------------");
        controller.updateView();
    }
    private static Employee CreateEmployee (){
        Employee employee = new Employee();
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter name: ");
        employee.setName(temp.nextLine());
        System.out.print("Enter ID: ");
        employee.setId(temp.nextLine());
        System.out.print("Enter hours in mouth: ");
        employee.setSalary(temp.nextInt());
        return employee;
    }
}