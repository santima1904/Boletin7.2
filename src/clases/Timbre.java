package clases;

public class Timbre {
    //Atributos
    private boolean activado;

    public Timbre() {
        this.activado = false;
    }

    public boolean getActivado() {
        return activado;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }

    public void activarTimbre(){
        activado=true;
        System.out.println("PI PI PI PI PI PI PI");
    }

    public void apagarTimbre(){
        activado=false;
        System.out.println("Clases.Timbre desactivado");
    }
}
