package entities;

import java.util.Date;
import entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date momento;
    private OrderStatus status;

    public Order()
    {

    }

    public Order(Integer id, Date momento, OrderStatus status)
    {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer  novoId)
    {
        this.id = novoId;
    }
    public Date getMomento()
    {
        return momento;
    }
    public void setMomento(Date Novomomento)
    {
        this.momento = Novomomento;
    }
    public OrderStatus getStatus()
    {
        return status;
    }
public void setStatus(OrderStatus novoStatus)
{
    this.status = novoStatus;
}

public String toString()
{
    return "Order [id=" + id + ", Momento=" + momento + ", Status=" + status + "]";
}

    


    
}
