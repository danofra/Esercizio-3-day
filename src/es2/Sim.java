package es2;

import java.util.Arrays;

public class Sim {
    private String numberPhone;
    private int creditCardNumber;
    private Calls[] calls;

    public Sim() {
        this.numberPhone = "3334156982";
        this.creditCardNumber = 0;
        this.calls = new Calls[5];
    }

    public void setCalls(Calls[] calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "{" +
                " numberPhone: ' " + this.numberPhone + " '" +
                ", creditCardNumber: ' " + this.creditCardNumber + " '" +
                ", calls: ' " + Arrays.toString(calls) + " '" +
                "}";
    }

}
