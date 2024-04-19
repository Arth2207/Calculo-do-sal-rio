import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiro = 7.5;
        double segundo = 9;
        double terceiro = 12;
        double quarto = 14;
        double valorinss = 0;
        
        System.out.println("digite o número de horas trablhadas no mês");
        float horasTrabalhadas = scanner.nextInt();
        System.out.println("Digite o valor do salario hora");
        float salarioHora = scanner.nextFloat();

        double salarioBruto = horasTrabalhadas * salarioHora;

        if(salarioBruto <= 1045){
            valorinss = salarioBruto * (primeiro / 100);
        } else if (salarioBruto >=1045.01 && salarioBruto <= 2089.60) {
            valorinss = salarioBruto * (segundo/100);
        } else if (salarioBruto >= 2089.61 && salarioBruto <= 3134.40) {
             valorinss = salarioBruto * (terceiro/100);
        } else {
             valorinss = salarioBruto * (quarto/100);
        }
       double salarioLiquido = salarioBruto - valorinss;
        System.out.println(salarioBruto);
        System.out.println(salarioLiquido);
    }
}