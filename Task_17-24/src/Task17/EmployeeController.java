package Task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public void setEmployeeName (String Name){
        this.model.setName(Name);
    }
    public void setEmployeeId (String Id){
        this.model.setId(Id);
    }
    public void setEmployeeSalary (int Salary){
        this.model.setSalary(Salary);
    }
    public int getEmployeeSalary (){
        return this.model.getSalary();
    }
    public String getEmployeeId (){
        return this.model.getId();
    }
    public String getEmployeeName (){
        return this.model.getName();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getId(), model.getSalary());
    }

}
