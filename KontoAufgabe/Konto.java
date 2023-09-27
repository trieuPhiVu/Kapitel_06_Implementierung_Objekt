public class Konto {
    protected String Kontonummer;
    protected double Kontostand;

    public String getKontonummer() {
        return this.Kontonummer;
    }

    public double getKontostand() {
        return this.Kontostand;
    }

    public Konto(String Kontonummer, double Kontostand) {
        this.Kontonummer = Kontonummer;
        this.Kontostand = Kontostand;
    }

    public double einzahlen(double betrag) {
        return Kontostand += betrag;
    }

    public double auszahlen(double betrag) {
        return Kontostand -= betrag;
    }
}