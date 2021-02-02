public class Circulo implements Figura{
    private double radio;
    private double area;

    public Circulo(){
        this.radio = 0;
    }
    public double getRadio(){
        return this.radio;
    }
        public void setRadio(int radio){
        this.radio = radio;
    }

    @Override
    public void getArea() {
        area = 2*PI*radio;
    }
}

