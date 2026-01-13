public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public Animal() {
        this.name = "Defalut";
    }

    public void eat() {
        System.out.println("Animal which name is " + this.name + " is eating");
    }

    public String toString() {
        return "This is animal and its name is " + name;
    }
}
