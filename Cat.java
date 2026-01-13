public class Cat extends Animal{
    private String bread;

    public Cat(String name, String bread) {
        super(name);
        this.bread = bread;
    }

    public String toString() {
        return "This is cat. It has a bread called " + this.bread + ". " + super.toString();
    }
}
