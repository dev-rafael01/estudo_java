package exercicios;
import java.util.Locale;
import java.util.Scanner;
import exercicios.logicaEx09;

/*quantos funcionários serão registrados

funcionário #1
id, nome, salário

digite o id do funcionário que terá aumento de salário

digite a porcentagem

lista de funcionários*/

public class Exercicio09 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios serão registrados: ");
        int numero = sc.nextInt();

        logicaEx09[] funcionarios = new logicaEx09[numero];

        for(int i = 0; i < numero; i ++)
        {
            System.out.println();
            System.out.println("funcionario #" + (i + 1));

            System.out.print("ID do funcionario ");
            int id = sc.nextInt();

            System.out.print("Nome funcionario: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salario funcionario: ");
            double salario = sc.nextDouble();

              funcionarios[i] = new logicaEx09(id, nome, salario);
        }

        System.out.println("Digite o id do funcionario que tera um aumento: ");
        int idFuncioanrioAumento = sc.nextInt();

        for(int i = 0; i < funcionarios.length; i ++)
        {
           if(funcionarios[i].getId() == idFuncioanrioAumento)
           {
            System.out.println("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();

            funcionarios[i].aumentarSalario(porcentagem);

            break;
           }
        }
        
       System.out.println();
       System.out.println("lista de funcionarios ");

       for(int i = 0; i < funcionarios.length; i ++)
       {
        System.out.println(funcionarios[i]);
       }
     
     
    sc.close();

    }
    
}
