import TaskOne_Cat.Cat;
public class Main {
    public static void main(String[] args) {
        //1)
        Cat cat=new Cat(3.5f,"British shorthair","Marfa");
        System.out.println(cat);
        System.out.println("\n"+cat.say());
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
    }
}
