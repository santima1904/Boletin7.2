public class Main {
    public static void main(String[] args) {
        /*
        Rectangulo rectangulo1 = new Rectangulo();
        Circulo circulo1 = new Circulo();

        rectangulo1.setAltura(6);
        rectangulo1.setBase(5);

        circulo1.setRadio(4);
        */
        Ejercicio1 intento = new Ejercicio1();
        System.out.println(intento.getAbierto());
        intento.abrirCerrojo(2);
        System.out.println(intento.getAbierto());

    }
}
