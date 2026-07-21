package application;

import entities.conta;
import entities.contaEmpresarial;
import entities.contaPoupanca;

public class programa {
    public static void main(String[] args) 
    {
        conta acc = new conta(1001, "Alex", 0);
        contaEmpresarial bacc = new contaEmpresarial(1002, "Maria", 0, 500.0);

        // UPCASTING

        conta acc1 = bacc;
        conta acc2 = new contaEmpresarial(1003, "Bob" , 0, 200.00);
        conta acc3 = new contaPoupanca(1004, "Anna", 0, 0.01);

        // DOWNCASTING

        contaEmpresarial acc4 = (contaEmpresarial)acc2;
        acc4.emprestimo(100.0);


        if(acc3 instanceof contaEmpresarial)
        {
            contaEmpresarial acc5 = (contaEmpresarial)acc3;
            acc5.emprestimo(200.0);
            System.out.println("Emprestimo realizado");
        }

        if(acc3 instanceof contaPoupanca)
        {
            contaPoupanca acc5 = (contaPoupanca)acc3;
            acc5.atualizarSaldo();
            System.out.println("Saldo atualizado.");
        }
    }
}
