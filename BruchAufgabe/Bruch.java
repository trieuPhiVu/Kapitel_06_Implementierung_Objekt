import java.text.BreakIterator;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch() {
        this.zaehler = 0;
        this.nenner = 1;
    }

    public Bruch(int zaehler) {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public int getZaehler() {
        return this.zaehler;
    }

    public int getNenner() {
        return this.nenner;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public void ausgeben() {
        System.out.println(this.zaehler + "/" + this.nenner);
    }

    public String bruchToString() {
        return this.zaehler + "/" + this.nenner;
    }

    public void kuerzen() {
        var m = Math.abs(this.zaehler);
        var n = Math.abs(this.nenner);
        var r = m % n;
        
    }
}