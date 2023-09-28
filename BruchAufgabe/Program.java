public class Program {
    public static void main(String[] args) {
        // Bruch a = new Bruch(4, 6);
        // Bruch temp = a.addiere(new Bruch(6, 10));
        // temp.ausgeben();
        // System.out.println(temp.dezimalwert());

        //Aufgabe 4
        BruchMitSeriennummer bruch1 = new BruchMitSeriennummer(2, 3);
        BruchMitSeriennummer bruch2 = new BruchMitSeriennummer(2, 3);
        BruchMitSeriennummer bruch3 = new BruchMitSeriennummer(2, 3);
        System.out.println(bruch1.getSeriennummer());
        System.out.println(bruch2.getSeriennummer());
        System.out.println(bruch3.getSeriennummer());

        //Aufgabe 5
        int vermoegen = 200000;
        var a1 = new Anteil(1, 4);
        var a2 = new Anteil(1, 2);
        System.out.println("Anteil a1: " + a1.bruchToString());
        System.out.println("Betrag von a1" + vermoegen * a1.dezimalwert());
        System.out.println("Anteil a2: " + a2.bruchToString());
        System.out.println("Betrag von a2: " + vermoegen * a2.dezimalwert());
        System.out.println("Verteilt: " + Anteil.verteilt.bruchToString());
        System.out.println("Rest: " + a1.getRest().bruchToString());
        System.out.println("Restbetrag: "+vermoegen*a1.getRest().dezimalwert());
    }
}
