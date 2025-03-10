package TaskThree_Vector3d;
//3) Описать класс «Vector3d» (т. е., он должен описывать вектор в трехмерной, декартовой системе координат).
// В качестве свойств этого класса возьмите
//координаты вектора. Для этого класса реализовать методы сложения, скалярного и
//векторного произведения векторов. Создайте несколько объектов этого класса и протестируйте их.

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    //Сложение векторов
    public Vector3d addition(Vector3d vector3d){
        double x=this.x+vector3d.getX();
        double y=this.y+vector3d.getY();
        double z=this.z+vector3d.getZ();
        return new Vector3d(x,y,z);
    }
    //Вычитание векторов
    public Vector3d subtraction(Vector3d vector3d){
        double x=this.x-vector3d.getX();
        double y=this.y-vector3d.getY();
        double z=this.z-vector3d.getZ();
        return new Vector3d(x,y,z);
    }

    //Векторное произведение
    public Vector3d crossProduct(Vector3d vector3d){
        double x=(this.y*vector3d.getZ())-(this.z*vector3d.getY());
        double y=(this.z*vector3d.getX())-(this.x*vector3d.getZ());
        double z=(this.x*vector3d.getY())-(this.y*vector3d.getX());
        return new Vector3d(x,y,z);
    }
    //Скалярное произведение
    public double dotProduct(Vector3d vector3d){
        return (this.x*vector3d.getX())+(this.y*vector3d.getY())+(this.z*vector3d.getZ());
    }

    @Override
    public String toString(){
        return "X: "+this.x+"\nY: "+this.y+"\nZ: "+this.z;
    }


}
