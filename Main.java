public class Main {
    public static void main(String[] args) {
        // Task1
        Dog d1 = new Dog("Bale", "Labrador");
        System.out.println(d1);

        //Task2

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("Check with double equal sign: " + (str1 == str2));
        System.out.println("Check with equals(): " + str1.equals(str2));


        for (int i = -128; i <= 128; i++) {
            Integer a = i;
            Integer b = i;

            if (a == b) {
                System.out.println("Caching is working: " + i);
            } else {
                System.out.println("a.equals(b) works beyond the range: " + a.equals(b) + " для " + i);
            }
        }
        //
        
        /*
            Оскільки подвійне дорівнює перевіряє об'єкти за їхнім розташування у пам'яті,
            то перша перевірка нам дає false.
            Метод equals() перевіряє об'єкти за їхнім вмістом, тому ми отримали true
            Оскільки відбувається кешування для чисел [-128; 127],
            тому порівняння обома способами дасть той самий результат.

         */

        //Task3
        Cat cat = new Cat("Tom", "Some bread");
        feed(cat);
        System.out.println("======================================================");
        feed(d1);
    }

    public static void feed(Animal a) {
        a.eat();
        if (a instanceof Dog) {
            System.out.println("It is a dog");
            Dog dog = (Dog) a;
            dog.bark();
        } else {
            System.out.println("It is not a dog");
        }
    }
}
