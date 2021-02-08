package clases;
/*
Ejercicio 1:  Diseñe e implemente una clase Cerrojo con combinación que tiene los siguientes requisitos (Realice el estudio de interfaz):
Tiene una combinación, que es una secuencia de tres números y está oculta.
La combinación puede cambiarse, pero sólo por alguien que conoce la combinación actual.
El cerrojo se puede abrir proporcionando la combinación.
Deshabilite la copia de cerrojos con combinación.
 */

import java.util.Scanner;

public class Ejercicio1 {
    Scanner teclado = new Scanner(System.in);
    /*
    Diseña Cerrojo para crear un cerrojo con una combinacion.
 *
 * Estudio de Interfaz
 * Clase Cerrojo
 * combinacion: básica, entera, consultable y modificable
 * abierto: básica, booleana, consultable y modificable
 *
 * Restricciones: -	combiancion numero positivo de 3 cifras.
 *
 * Interfaz
 * public Clases.Ejercicio1();
 * int getCombinacion();
 * void setCombinacion(int horas);
 * int getAbierta();
 * void setAbierta(int minutos);
 *
 * Metodos añadidos
 * Un método para abrir el cerrojo
     */

    //Atributos
    private int combinacion;
    private boolean abierto;

    //Metodos
    public Ejercicio1(){
        abierto = false;
        combinacion = 0;
    }
    public int getCombinacion(){
        return this.combinacion;
    }
    public void setCombinacion(int combinacion){
        System.out.println("Introduzca la combinacion");
        int respuesta = teclado.nextInt();
        if (respuesta==combinacion){
            this.combinacion = combinacion;
        }else{
            System.out.println("No es correcta");
        }
    }

    public boolean getAbierto(){
        return this.abierto;
    }
    public void setAbierto(int combinacion){
        this.combinacion = combinacion;
    }
    /*
    Entradas: entero combinacion
    Salidas: ninguna
    Precondiciones: combinacion positiva y de tres cifras
    Postcondiciones: si la combinacion es la indicada  se abre el cerrojo
     */
    public void abrirCerrojo(int combinacion){
        if (combinacion>99&&combinacion<=999) {
            if (combinacion == 213) {
                abierto = true;
            }
        }
    }
}
