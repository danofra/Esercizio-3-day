package es2;

public class Calls {
    private String numberPhone;
    private double duration;

    public Calls(String numberPhone, double duration) {
        this.numberPhone = numberPhone;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "List calls {" +
                " numberPhone: ' " + numberPhone + " '" +
                ", duration: ' " + duration + " minutes '" +
                "}";
    }

}
