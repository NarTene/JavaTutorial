package OOP.Encapsulation;

public class EmpCount {
    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    private int empAge;
    private String empLastName;
    private String empFirstName;

}

// Create the three different employees
class A{
    public static void main(String[] args) {
        EmpCount emp1 = new EmpCount();
        EmpCount emp2 = new EmpCount();
        EmpCount emp3 = new EmpCount();


    }
}