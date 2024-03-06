package es1;

public class Rettangolo {
    private double altezza;
    private double base;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double calcolaArea() {
        return this.altezza * this.base;
    }

    public double calcolaPerimetro() {
        return 2 * (this.altezza + this.base);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + this.calcolaArea());
        System.out.println("Perimetro: " + this.calcolaPerimetro());
    }

    @Override
    public String toString() {
        return "Rettangolo {" +
                " altezza: " + altezza +
                ", base: " + base +
                '}';
    }

}
