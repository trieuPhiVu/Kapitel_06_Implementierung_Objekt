public class Anteil extends Bruch {
    public static Bruch verteilt = new Bruch(0, 1);

    public Anteil() {
        setZaehler(0);
        setNenner(1);
    }

    public Anteil(int zaehler, int nenner) {
        setZaehler(zaehler);
        setNenner(nenner);
        verteilt = verteilt.addiere(new Bruch(zaehler, nenner));
    }

    public double getVerteilt() {
        return verteilt.dezimalwert();
    }

    public Bruch getRest() {
        return new Bruch(1, 1).subtrahiere(verteilt);
    }
}
