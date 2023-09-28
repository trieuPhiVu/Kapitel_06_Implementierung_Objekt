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
        while (r > 0) {
            m = n;
            n = r;
            r = m % r;
        }
        zaehler /= n;
        nenner /= n;
    }

    public void gekuerztausgeben() {
        kuerzen();
        ausgeben();
    }

    public boolean equals(Bruch x) {
        var a = new Bruch(zaehler, nenner);
        var b = new Bruch(x.zaehler, x.nenner);
        a.kuerzen();
        b.kuerzen();
        if ((a.zaehler == b.zaehler) && (b.zaehler == b.nenner)) {
            return true;
        }
        return false;
    }

    public Bruch addiere(Bruch b) {
        this.kuerzen();
        b.kuerzen();
        Bruch temp;
        if (this.nenner == b.nenner) {
            temp = new Bruch(this.zaehler + b.zaehler, this.nenner);
            temp.kuerzen();
            return temp;
        } else {
            temp = new Bruch(((this.zaehler * b.nenner) + (b.zaehler * this.nenner)), this.nenner * b.nenner);
            temp.kuerzen();
            return temp;
        }
    }

    public Bruch subtrahiere(Bruch b) {
        this.kuerzen();
        b.kuerzen();
        Bruch temp;
        if (this.nenner == b.nenner) {
            temp = new Bruch(this.zaehler - b.zaehler, this.nenner);
            temp.kuerzen();
            return temp;
        } else {
            temp = new Bruch(((this.zaehler * b.nenner) - (b.zaehler * this.nenner)), this.nenner * b.nenner);
            temp.kuerzen();
            return temp;
        }
    }

    public double dezimalwert() {
        return (double)zaehler / nenner;
    }
}