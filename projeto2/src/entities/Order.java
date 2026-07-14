package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

    private static final SimpleDateFormat sdfMomento =
            new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private static final SimpleDateFormat sdfNascimento =
            new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    private Cliente cliente;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double soma = 0.0;

        for (OrderItem item : itens) {
            soma += item.subTotal();
        }

        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Momento do pedido: ");
        sb.append(sdfMomento.format(moment));

        sb.append("\nStatus do pedido: ");
        sb.append(status);

        sb.append("\nCliente: ");
        sb.append(cliente.getNome());
        sb.append("\nData Nasc: (");
        sb.append(sdfNascimento.format(cliente.getDataNascimento()));
        sb.append(") \n Email:  ");
        sb.append(cliente.getEmail());

        sb.append("\nItens do pedido:\n");

        for (OrderItem item : itens) {
            sb.append(item);
            sb.append("\n");
        }

        sb.append("Preço total: R$ ");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}