import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Employee {
    String employee_name;
    String location;
    int ID;
    double salary;
    int age;
    private Date start_date = new Date();

    //Date of Birth for employee 1 "02/10/2000"  DD/MM/YYYY
    String date_of_birth;

    public Employee(String employee_name, String location, int ID, double salary, int age, String date_of_birth)
    {
        this.employee_name = employee_name;
        this.location = location;
        this.ID = ID;
        this.salary = salary;
        this.age = age;
        this.date_of_birth = date_of_birth;
    }

    public Date stringToDate(String date)
    {
        try
        {
            SimpleDateFormat simple_date = new SimpleDateFormat("dd/MM/yyyy");
            Date formatted_date = simple_date.parse(date);
            return formatted_date;
        }
        catch (ParseException e)
        {
            System.out.println(e.toString());
        }

        return null;
    }

    public void printEmployeeInformation()
    {
        System.out.println("Employee Name: " + this.employee_name);
        System.out.println("Location: " + this.location);
        System.out.println("ID: " + this.ID);
        System.out.println("Salary: " + this.salary);
        System.out.println("Age: " + this.age);
    }


    public int getAge() {
        return Period.between(LocalDate.parse(this.date_of_birth), LocalDate.now()).getYears();
    }

    public void raiseSalary()
    {
        this.salary = this.salary * 1.08;
    }

    public void printStartDate()
    {
        System.out.println("Starting Date: " + this.start_date);
    }

}
