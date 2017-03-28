package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ondřej Soukup on 28.03.2017.
 */
public class Order {
    private int id, invoiceId;
    private Date orderDate, deliveryDate;
    private double amount;
    private boolean deliveryStatus;

    public Order(int id, Date orderDate, double amount, boolean deliveryStatus, Date deliveryDate, int invoiceId){
        this.id = id;
        this.orderDate = orderDate;
        this.amount = amount;
        this.deliveryStatus = deliveryStatus;
        this.deliveryDate = deliveryDate;
        this.invoiceId = invoiceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
