package es1;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Rettangolo 1: ");
        Rettangolo r1 = new Rettangolo(40, 20);
        System.out.println(r1);
        System.out.printf("Rettangolo 2: ");
        Rettangolo r2 = new Rettangolo(30, 40);
        System.out.println(r2);
        stampaDueRettangoli.StampaDueRettangoli(r1, r2);
    }
}
