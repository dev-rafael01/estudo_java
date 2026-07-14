package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Produto;
import entities.enums.OrderStatus;

public class Programa {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente:");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de nascimento (dd/MM/yyyy): ");
        Date dataNascimento = sdf.parse(sc.nextLine());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println();
        System.out.println("Entre com os dados do pedido:");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(
                sc.nextLine().toUpperCase()
        );

        Order order = new Order(new Date(), status, cliente);

        System.out.println();
        System.out.print("Quantos itens para esse pedido? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println();
            System.out.println("Entre com os dados do item #" + i + ":");

            sc.nextLine();

            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();

            System.out.print("Preço do produto: ");
            double produtoPreco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nomeProduto, produtoPreco);

            OrderItem orderItem =
                    new OrderItem(quantidade, produtoPreco, produto);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO");
        System.out.println(order);

        sc.close();
    }
}