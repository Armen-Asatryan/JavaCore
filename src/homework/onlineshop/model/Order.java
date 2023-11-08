package homework.onlineshop.model;

import homework.onlineshop.model.enums.OrderStatus;
import homework.onlineshop.model.enums.PaymentMethod;

import java.util.Date;
import java.util.Objects;

public class Order {
    private String id;
    private String user;
    private String product;
    private Date date;
    private String price;
    private OrderStatus orderStatus;
    private String qty;
    private PaymentMethod paymentMethod;

    public Order(String id, String user, String product, Date date, String price, OrderStatus orderStatus, String qty, PaymentMethod paymentMethod) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.date = date;
        this.price = price;
        this.orderStatus = orderStatus;
        this.qty = qty;
        this.paymentMethod = paymentMethod;
    }

    public Order() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(user, order.user) && Objects.equals(product, order.product) && Objects.equals(date, order.date) && Objects.equals(price, order.price) && orderStatus == order.orderStatus && Objects.equals(qty, order.qty) && paymentMethod == order.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, product, date, price, orderStatus, qty, paymentMethod);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", product='" + product + '\'' +
                ", date=" + date +
                ", price='" + price + '\'' +
                ", orderStatus=" + orderStatus +
                ", qty='" + qty + '\'' +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
