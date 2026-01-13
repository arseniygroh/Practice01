public class Dog extends Animal{
    private String bread;

    public Dog(String name, String bread) {
        super(name);
        this.bread = bread;
    }

    public void eat() {
        System.out.println("Dog which bread is " + this.bread + " is eating meat");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public String toString() {
        return "This is dog. It has a bread called " + this.bread + ". " + super.toString();
    }

}
