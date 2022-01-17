package com.webspring.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "orderNumber")
    private int orderNumber;

    @Column(name = "orderDate")
    private Date orderDate;

    @Column(name = "requiredDate")
    private Date requiredDate;

    @Column(name = "shippedDate")
    private Date shippedDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comments")
    private String comments;

    public Order() {
    }

    public Order(Date orderDate, Date requiredDate, Date shippeddate, String status, String comments) {
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippeddate;
        this.status = status;
        this.comments = comments;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int id) {
        this.orderNumber = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippeddate) {
        this.shippedDate = shippeddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderNumber +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", shippeddate=" + shippedDate +
                ", status='" + status + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
