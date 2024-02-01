package HW2.Q4;

public class HRManager extends Employee{
    String Employee;
    public void work(){
        System.out.println("HR manages every work's details");
    }
    public void addEmployee(String Employee){
this.Employee=Employee;
    }
    
    public static void main(String[] args) {
        Employee emp=new Employee();
        HRManager hr=new HRManager();

        emp.work();
        emp.getSalary(120000.00);
        hr.work();
        hr.addEmployee("CEO");
    }
}
