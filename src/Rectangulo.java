public class Rectangulo implements Figura{
private double base;
private double altura;
private double area;

public Rectangulo(){
    this.base = 0;
    this.altura = 0;
}
    public double getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base = base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    @Override
    public void getArea() {
        area = base*altura;
    }
}
