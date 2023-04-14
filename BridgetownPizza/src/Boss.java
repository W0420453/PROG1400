public class Boss {
    private int health;

    public void spitFires() {
        System.out.print("*");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Boss() {
        this.health = 3;
    }
}
