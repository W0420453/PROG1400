public class Customer extends Person{
    int id = 1;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public void print() { System.out.println("\tCustomer: " + super.toString() + "\t| ID: "+ this.id); }

    public Customer() {};

    public Customer(int age) { this.age = age;}

    public Customer(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

}
