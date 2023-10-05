public class CurrencyConverter {
//    public double valorDolar;
//    public double valorEmReais;

    public static double dolar(double dolar, double reais){
        return ((dolar * reais) + ((dolar * reais) * 0.06));
    }

}
