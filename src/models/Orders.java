package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Orders {
    private long id;
    private  long userId;
    private long pointId;
    private double sum;
    private Date date;
    private ArrayList<Product> products;

    public Orders(long userId, long pointId, double sum, Date date) {
        this.userId = userId;
        this.pointId = pointId;
        this.sum = sum;
        this.date = date;
    }

    public Orders() { }

    public Orders(long id, long userId, long pointId, double sum, Date date) {
        this.id = id;
        this.userId = userId;
        this.pointId = pointId;
        this.sum = sum;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userId=" + userId +
                ", pointId=" + pointId +
                ", sum=" + sum +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return id == orders.id &&
                userId == orders.userId &&
                pointId == orders.pointId &&
                Double.compare(orders.sum, sum) == 0 &&
                Objects.equals(date, orders.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, pointId, sum, date);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
