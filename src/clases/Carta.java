package clases;

import java.util.Random;
import enums.Palo;
import enums.Valor;

public class Carta {
    /*
   Diseña Carta para generar una carta aleatoria
*
* Estudio de Interfaz
* Clase Carta
* palo: enum
* valor: enum
* sumaTotal: statica, decimal, modificable
*
*
*
* Interfaz
* public Clases.Carta();
* getters and setters
* toString
*
* Metodos añadidos
* Metodo para ver la suma total
    */

    //Atributos
    private Palo palo;
    private Valor valor;
    private static double sumaTotal;

    //Metodos
    public Carta() {
       Random numeroRandom = new Random();
       int randomPalo = numeroRandom.nextInt(3)+1;

       int randomValor = numeroRandom.nextInt(9)+1;

       switch (randomPalo){
           case 1 -> palo = Palo.OROS;
           case 2 -> palo = Palo.COPAS;
           case 3 -> palo = Palo.ESPADAS;
           case 4 -> palo = Palo.BASTOS;
       }

        switch (randomValor){
            case 1 -> valor = Valor.UNO;
            case 2 -> valor = Valor.DOS;
            case 3 -> valor = Valor.TRES;
            case 4 -> valor = Valor.CUATRO;
            case 5 -> valor = Valor.CINCO;
            case 6 -> valor = Valor.SEIS;
            case 7 -> valor = Valor.SIETE;
            case 8 -> valor = Valor.SOTA;
            case 9 -> valor = Valor.CABALLO;
            case 10 -> valor = Valor.REY;
        }

        sumaTotal += valor.getValorJuego();
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public double getSumaTotal() {
        return sumaTotal;
    }

    public void setSumaTotal(double sumaTotal) {
        this.sumaTotal = sumaTotal;
    }

    @Override
    public String toString() {
        return "Clases.Carta{" +
                "palo=" + palo +
                ", valor=" + valor +
                ", sumaTotal=" + sumaTotal +
                '}';
    }

    public void consultarTotal(){
        System.out.println("Total: "+getSumaTotal());;
    }
}

