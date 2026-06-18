package exercicios;

public class logicaEx02 {

String nome;
double n1, n2, n3;


public double notaFinal ()
{
    return  n1 + n2 + n3;
   
}


public void estudante()
{
    if(notaFinal() >= 60.0)
    {
        System.out.println("Voce esta aprovado");
    }else{
        System.out.println("Voce esta reprovado");
        System.out.printf("Falta %2.f\n Pontos " + pontosFaltando());
    }
}

public double pontosFaltando()
{
    if(notaFinal() >= 60.0){
        return 0.0;
    }else{
        return 60.0 - notaFinal();
    }
}


public String toString()
{
    return  nome  + " Sua Nota final é:  " + String.format("%.2f", notaFinal());
}



}

