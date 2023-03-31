public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("George","Castaza", (int)(Math.random() * 60 + 20));
        Customer c1 = new Customer();
        Customer c2 = new Customer("Cool", "Buyer", (int)(Math.random() * 60 + 20) );
        Customer c3 = new Customer((int)(Math.random() * 60 + 20));
        Employee e1 = new Employee("Full", "Name","123 Fake" ,1000 , 40000, "02/10/2000" );
        Person emptyPerson = new Person();

        System.out.println(p1);

        p1.print();

        c1.print();
        c2.print();
        c3.print();

        e1.print();

    }
}