import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 6
        Carta cartaActual;
        int eleccion=0;
        double contadorSumaTotal= 0;
        Scanner teclado = new Scanner(System.in);

        while(eleccion!=2) {
            eleccion=3;
            while (eleccion != 1 && eleccion != 2) {
                System.out.println("Que desea hacer");
                System.out.println("1-Nueva carta");
                System.out.println("2-Plantarse");
                eleccion = teclado.nextInt();
                if (eleccion != 1 && eleccion != 2) {
                    System.out.println("Eleccion no valida");
                }
            }
            switch (eleccion) {
                case 1:
                    System.out.println("Nueva carta: ");
                    cartaActual = new Carta();
                    System.out.print(cartaActual.getValor()+" ");
                    System.out.print(cartaActual.getPalo());
                    System.out.println(" ");
                    cartaActual.consultarTotal();
                    contadorSumaTotal = cartaActual.getSumaTotal();
                    if (cartaActual.getSumaTotal()>7.5){
                        System.out.println("Has perdido");
                        eleccion=2;
                    }
                    break;

                case 2:
                    System.out.println("Total: "+contadorSumaTotal);

                    System.out.println("Hubiera salido...");
                    cartaActual = new Carta();
                    System.out.print(cartaActual.getValor()+" ");
                    System.out.print(cartaActual.getPalo());



                    break;

            }
            System.out.println(" ");
            System.out.println("-----------");
        }

        /*
        Rectangulo rectangulo1 = new Rectangulo();
        Circulo circulo1 = new Circulo();

        rectangulo1.setAltura(6);
        rectangulo1.setBase(5);

        circulo1.setRadio(4);
        */
        /*
        Ejercicio1 intento = new Ejercicio1();

        System.out.println(intento.getAbierto());
        intento.abrirCerrojo(2);
        System.out.println(intento.getAbierto());
         */


    }
}
