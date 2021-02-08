package enums;

public enum Hechizos{AMOJOLORA(5), WIJNALDUM(3), SUGUNTUN(7);
    private int danho;

    Hechizos(int danho){this.danho = danho;}

    public int getDanho() {
        return danho;
    }
}
