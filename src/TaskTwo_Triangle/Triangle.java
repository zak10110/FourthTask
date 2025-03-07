package TaskTwo_Triangle;

//2) Описать класс «Triangle». В качестве свойств возьмите длины сторон треугольника.
//Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.
public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  double getArea(){
        double p=(this.a + this.b + this.c) /2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
}
