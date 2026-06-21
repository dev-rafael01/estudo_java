package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;


public class Programa {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      

        System.out.println("Qual nome do produto");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Qual o valor do produto ?");
        System.out.print("Preço ");
        double preco = sc.nextDouble();

        System.out.println("Qual a quantidade do produto ? ");
        System.out.print("Quantidade ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);

        produto.setNome("Computador");
        System.out.println("nome do produto atualizado: " + produto.getNome());
        produto.setPreco(1200.00);
        System.out.println("novo preço do produto: " + produto.getPreco());
        System.out.println("Dados do Produto " + produto);

        System.out.println();
        System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque.");
        quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Produtos atualizados " + produto);

        System.out.println();
        System.out.println("insina a quantidade a serem removidas do estoque. ");
        int remover = sc.nextInt();
        produto.removerProduto(remover);

        System.out.println();
        System.out.println("Produtos atualizados " + produto);


        sc.close();



    }

    
    
}
