package OOP.Encapsulation;

public class EmployeeInfo {
    public static void main(String[] args) {
        EmpCount empOne = new EmpCount();
        empOne.setEmpId(10);
        empOne.setEmpAge(30);
        empOne.setEmpFirstName("John");
        empOne.setEmpLastName("Smith");


        System.out.println("Id = " + empOne.getEmpId()
                + " Age" + empOne.getEmpAge() + "First Name" + empOne.getEmpFirstName()
                 + " Last Name" + empOne.getEmpLastName());

        EmpCount empTwo = new EmpCount();
        empTwo.setEmpId(11);
        empTwo.setEmpAge(25);
        empTwo.setEmpFirstName("Karen");
        empTwo.setEmpLastName("Brown");

        System.out.println("Id = " + empTwo.getEmpId()
                + " Age" + empTwo.getEmpAge() + "First Name" + empTwo.getEmpFirstName()
                + " Last Name" + empTwo.getEmpLastName());

        EmpCount empThree = new EmpCount();
        empThree.setEmpId(12);
        empThree.setEmpAge(20);
        empThree.setEmpFirstName("Thomas");
        empThree.setEmpLastName("Farak");

        System.out.println("Id = " + empThree.getEmpId()
                + " Age" + empThree.getEmpAge() + "First Name" + empThree.getEmpFirstName()
                + " Last Name" + empThree.getEmpLastName());



    }
}
