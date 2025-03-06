package TaskOne_Cat;

//1) Описать класс «Cat» (в качестве образца можно взять домашнего питомца).
//Наделить его свойствами и методами. Создать несколько экземпляров объектов
//этого класса. Использовать эти объекты.

public class Cat {
    private float weight;
    private String breed;
    private String name;

    public Cat(float weight,String breed,String name){
        this.weight=weight;
        this.breed=breed;
        this.name=name;
    }

    public double getWeight(){
        return this.weight;
    }
    public String getBreed(){
        return this.breed;
    }
    public String getName(){
        return  this.name;
    }

    public void setWeight(float weight){
        this.weight=weight;
    }

    public String say(){
        return "Meo";
    }
    public String eat(){
        return "Cat is Eating";
    }
    public String sleep(){
        return "Cat is Sleeping";
    }
    @Override
    public String toString(){
        return "Name: "+getName()+"\nBreed: "+getBreed()+"\nWeight: "+getWeight();
    }

}
