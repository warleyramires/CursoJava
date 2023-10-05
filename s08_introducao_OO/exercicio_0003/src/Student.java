public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public void status(){
        double notaFinal;
        notaFinal = nota1 + nota2 +nota3;

        if(notaFinal >= 60){
            System.out.printf("FINAL GRADE = %.2f\n", notaFinal);
            System.out.println("PASS");
        }else{
            System.out.printf("FINAL GRADE = %.2f\n", notaFinal);
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - notaFinal) + " POINTS");
        }
    }

}
