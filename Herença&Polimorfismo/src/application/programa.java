package application;

import entities.conta;
import entities.contaEmpresarial;
import entities.contaPoupanca;

public class programa {
    public static void main(String[] args) 
    {
        conta acc1 = new conta(1001, "Alex", 1000.0);

        acc1.saque(200.0);
        System.out.println(acc1.getSaldo());


        conta acc2 =  new  contaPoupanca(1002, "Maria", 1000.0, 0.01);
        acc2.saque(200.0);
        System.out.println(acc2.getSaldo());

        conta acc3 = new contaEmpresarial(1003, "Bob", 1000.0 , 500.0);
        acc3.saque(200.0);
        System.out.println(acc3.getSaldo());
    }
}
