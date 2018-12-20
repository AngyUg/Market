package models;

import java.util.Objects;

public class Product {

    private long id;
    private long pointId;
    private double price;
    private double amount;
    private String name;
    private String description;

    public Product() {
    }

    public Product(long pointId, double price, double amount, String name, String description) {
        this.pointId = pointId;
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.description = description;
    }

    public Product(long id, long pointId, double price, double amount, String name, String description) {
        this.id = id;
        this.pointId = pointId;
        this.price = price;
        this.amount = amount;
        this.name = name;
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pointId=" + pointId +
                ", price=" + price +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                pointId == product.pointId &&
                Double.compare(product.price, price) == 0 &&
                amount == product.amount &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pointId, price, amount, name, description);
    }
}
