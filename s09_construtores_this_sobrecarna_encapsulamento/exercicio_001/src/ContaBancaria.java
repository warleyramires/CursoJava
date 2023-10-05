import java.lang.reflect.Method;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double valorDeposito;

    private double valorTotal = 0.00;


    public ContaBancaria(){
        valorDeposito = 0.00;
    }

    public ContaBancaria(int numeroConta, String nomeTitular, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.valorDeposito = valorDeposito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

//    public void setNumeroConta(int numeroConta) {
//        this.numeroConta = numeroConta;
//    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorDeposito() {

        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
        setValorTotal(getValorDeposito());
    }


    public void setSaque(double valorSaque){
        valorTotal -= valorSaque;
        valorTotal -= 5;
    }

    public double getValorTotal() {

        return valorTotal;
    }
    public void setValorTotal(double valorDeposito){
        this.valorTotal += valorDeposito;
    }

    @Override
    public String toString() {
        return "Account: " + getNumeroConta()
                + ", Holder: " + getNomeTitular()
                + ", Balance: $ " + String.format("%.2f", getValorTotal());
    }
}
