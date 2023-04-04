public class ExampleChild extends ExampleParent {

    public ExampleChild() {
        this.name = "Child Name";
    }

    public void printName()
    {
        System.out.println("The Child Name is : " + this.name);
    }
}
