public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double porcentage){
        double salarioAtualizado;
        double calculoPorcentagem;
        calculoPorcentagem = (porcentage/100)*grossSalary;
        salarioAtualizado = netSalary() + calculoPorcentagem;
        System.out.println("Updated data: " + name + ", $ " + String.format("%.2f" , salarioAtualizado));
    }

    @Override
    public String toString() {
        String message;

        return message = String.format(
                "Employee: "
                + name
                + ", $ %.2f "
                , netSalary()
        );
    }
}
