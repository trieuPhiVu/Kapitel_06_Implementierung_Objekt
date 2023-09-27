
public class Girokonto extends Konto {
    private double limit;

    public Girokonto(String Kontonummer, double Kontostand, double limit) {
        super(Kontonummer, Kontostand);
        this.limit = limit;
    }

    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    @Override
    public double auszahlen(double betrag) {
        double rest = Kontostand - betrag;
        if (Math.abs(rest) >= this.limit) {
            System.out.println("Fehler: Kreditlimit überschritten");
            return Kontostand;
        }
        else {
            return Kontostand-=betrag;
        }
    }
}
