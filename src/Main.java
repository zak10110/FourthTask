import TaskOne_Cat.Cat;
import TaskTwo_Triangle.Triangle;
public class Main {
    public static void main(String[] args) {
        //1)
        Cat cat=new Cat(3.5f,"British shorthair","Marfa");
        System.out.println(cat);
        System.out.println("\n"+cat.say());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());

        //2)
        Triangle triangle=new Triangle(10,20,20);
        System.out.println("\nArea: "+triangle.getArea());
        triangle.setB(25.6);
        System.out.println("\nArea 2: "+triangle.getArea());



    }
}
