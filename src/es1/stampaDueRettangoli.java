package es1;

public class stampaDueRettangoli {
    public static void StampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1");
        r1.stampaRettangolo();
        System.out.println("Rettangolo 2");
        r2.stampaRettangolo();

        double sommaArea = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetro = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle due Aree: " + sommaArea);
        System.out.println("Somma dei due Perimetri: " + sommaPerimetro);
    }
}
