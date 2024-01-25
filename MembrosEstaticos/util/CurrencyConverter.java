package MembrosEstaticos.util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double dollarToReal(double quote, double dollarBought) {
        return quote * dollarBought * (1.00 + IOF);
    }
}
