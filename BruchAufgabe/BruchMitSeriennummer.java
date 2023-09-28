public class BruchMitSeriennummer extends Bruch {
    private final int Seriennummer;
    public static int serienNummerErhoehung = 0;
    public int getSeriennummer() {
        return Seriennummer;
    }

    public BruchMitSeriennummer(int zaehler, int nenner) {
        super(zaehler, nenner);
        this.Seriennummer = ++serienNummerErhoehung;
    }
}
