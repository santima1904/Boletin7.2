package clases;

import interfaces.Personajes;
import enums.Armas;
import enums.Hechizos;

public class PersonajesImp implements Personajes {

    //Atributos
    private String nombre;
    private String raza;
    private String profesion;
    private int vida;
    private int fuerza;
    private int destreza;
    private int inteligencia;
    private Armas arma;
    private Hechizos hechizo;


    //Metodos


    public PersonajesImp(String nombre, String raza, String profesion, int vida, int fuerza, int destreza, int inteligencia, Armas arma, Hechizos hechizo) {
        this.nombre = nombre;
        this.raza = raza;
        this.profesion = profesion;
        this.vida = vida;
        this.fuerza = fuerza;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.arma = arma;
        this.hechizo = hechizo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public Hechizos getHechizo() {
        return hechizo;
    }

    public void setHechizo(Hechizos hechizo) {
        this.hechizo = hechizo;
    }

    @Override
    public void intercambiarArmaA(PersonajesImp a) {
        PersonajesImp auxiliar = new PersonajesImp("Pepe", "elfo", "carpintero", 25, 6, 9, 7, Armas.DAGA, Hechizos.SUGUNTUN);
       auxiliar.arma = this.arma;
        this.arma = a.arma;
        a.arma = auxiliar.arma;
    }

    @Override
    public void lanzarHechizoA(PersonajesImp a) {
        if (a.getVida()>0){
            a.vida = a.vida - this.hechizo.getDanho();
            System.out.println("Has hecho : "+this.hechizo.getDanho()+" de danho");
            if (a.vida<=0){
                System.out.println("Ha muerto");
            }else{
                System.out.println("Vida de "+a.getNombre()+" : "+a.getVida());
            }
        }else{
            System.out.println("Está muerto");
        }

    }

    @Override
    public void atacarA(PersonajesImp a) {
        if (a.getVida()>0){
            a.vida = a.vida - this.arma.getDanho();
            System.out.println("Has hecho : "+this.arma.getDanho()+" de danho");
            if (a.vida<=0){
                System.out.println("Ha muerto");
            }else{
                System.out.println("Vida de "+a.getNombre()+" : "+a.getVida());
            }
        }else{
            System.out.println("Está muerto");
        }

    }
}
