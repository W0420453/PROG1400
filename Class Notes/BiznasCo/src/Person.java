public class Person {
    String fName = "Default";
    String lName = "Name";
    int age = 102030;

    public Person() { } /* Empty Constructor, uses Default Values */

    public Person(String fName, String lName) {this.fName = fName; this.lName = lName;}

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public void setFName(String fName) { this.fName = fName;}

    public void setLName(String lName) { this.lName = lName;}

    public void setAge(int age) {this.age = age;}

    public String getFName() {return fName;}

    public String getLName() {return lName;}

    public int getAge() { return age; }


    @Override
    public String toString() {
        return "\tFirst Name: '" + fName + "\' \t| Last Name: '" + lName +"\' \t| Age: " + age;
    }

    public void print() {
        System.out.println("\n\tPerson: " + this.toString());
    }
}
