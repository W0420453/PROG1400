
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Employee extends Person{
    String location;
    int ID;
    double salary;
    int age;
    private Date start_date = new Date();

    //Date of Birth for employee 1 "02/10/2000"  DD/MM/YYYY
    LocalDate date_of_birth;


    public Employee(String fName, String lName, String location, int ID, double salary, String date_of_birth)
    {
        super(fName,lName);
        this.location = location;
        this.ID = ID;
        this.salary = salary;

        this.date_of_birth = setDate_of_birth(date_of_birth);

        this.age = calcAge();
    }

    public Employee(String fName, String lName, String location, int ID, double salary, int age) {
        super(fName,lName);
        this.location = location;
        this.ID = ID;
        this.salary = salary;
        this.age = age;
    }

    public void setDate_of_birth(String date)
    {
        // SimpleDateFormat simple_date = new SimpleDateFormat("dd/MM/yyyy");
        this.date_of_birth = LocalDate.parse(date);

    }

    /*
    public void printEmployeeInformation()
    {
        System.out.println("Employee Name: " + this.employee_name);
        System.out.println("Location: " + this.location);
        System.out.println("ID: " + this.ID);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }
    */

    public int calcAge() {
        return Period.between(LocalDate.parse(this.date_of_birth), LocalDate.now()).getYears();
    }

    public void print() {
        System.out.println("\tEmployee: " + super.toString() +
                "\t| Salary: " + this.salary +
                "\t| Start Date: " + this.start_date);
    }

    public void raiseSalary()
    {
        this.salary = this.salary * 1.08;
    }

    /*
    public void printStartDate()
    {
        System.out.println("Starting Date: " + this.start_date);
    }
     */

}

