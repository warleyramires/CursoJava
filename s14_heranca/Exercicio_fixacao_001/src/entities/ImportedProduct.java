package entities;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(){

    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFree(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalPrice(){
        return getPrice() + getCustomFee();
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f",totalPrice()) + " (CustomsFee: $ " + String.format("%.2f",getCustomFee())+ ")";
    }
}
