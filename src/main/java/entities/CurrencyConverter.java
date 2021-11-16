package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double conversaodollar(double dollar, double qtdedollar){
        return ((dollar * qtdedollar) + ((dollar * qtdedollar) * IOF));
    }
}
