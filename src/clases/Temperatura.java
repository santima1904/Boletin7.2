package clases;

/*
Ejercicio 3:  Diseña e implementa una clase Clases.Temperatura cuyos objetos activen a un objeto de tipo Clases.Timbre
cuando la temperatura alcance un determinado valor. El timbre tendrá que ser desactivado cuando suene
y en cualquier caso deberá realizar las operaciones que estimes convenientes. Modela el sistema como mejor consideres
(Realiza el estudio de interfaz).
 */
public class Temperatura {
   private double valor;

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        if (valor>=45){
            Timbre timbre1 = new Timbre();
            timbre1.activarTimbre();
        }
    }


}
