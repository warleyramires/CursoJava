package Entities;

public class Juridica extends Pessoa{

    private Integer numeroFuncionarios;

    public Juridica(){

    }
    public Juridica(String nome, Double rendaAnual, Integer numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcImposto() {
        if(numeroFuncionarios >= 10){
            return getRendaAnual() * 0.14;
        }else{
            return getRendaAnual() * 0.16;
        }
    }
}
