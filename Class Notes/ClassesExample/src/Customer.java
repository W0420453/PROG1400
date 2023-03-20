public class Customer {
    String first_name;
    String last_name;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    /* Very dumb Idea, why is id private if their is a public function to get the private id*/
    public int getId() {
        return this.id;
    }

    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setLast_name(String last_name){
        this.last_name = last_name;
    }

    public String getLast_name() {
        return this.last_name;
    }
    
    public Customer(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
        this.id = 30;
    }

}
