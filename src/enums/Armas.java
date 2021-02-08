package enums;

public enum Armas {DAGA(3), MAZO(7), LANZA(5);
private int danho;

Armas(int danho){this.danho = danho;}

    public int getDanho() {
        return danho;
    }
}
