package Entities;

public class Fisica extends Pessoa{
    private Double gastoSaude;

    public Fisica(){

    }

    public Fisica(String nome, Double rendaAnual, Double gastoSaude){
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double calcImposto() {
        double valorAPagar = 0;
        if(getRendaAnual()<20000){
            valorAPagar = getRendaAnual() * 0.15;
        }else{
            valorAPagar = getRendaAnual() * 0.25;
        }

        return valorAPagar = valorAPagar - (getGastoSaude() * 0.5);

    }
}
