package models;

import java.util.ArrayList;
import java.util.Objects;

public class PointOfSale {
    private  long id;
    private String name;
    private  long addressId;
    private ArrayList<Product> products;

    public PointOfSale(String name, long addressId, ArrayList<Product> products) {
        this.name = name;
        this.addressId = addressId;
        this.products = products;
    }

    public PointOfSale(long id, String name, long addressId, ArrayList<Product> products) {
        this.id = id;
        this.name = name;
        this.addressId = addressId;
        this.products = products;
    }

    public PointOfSale() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "PointOfSale{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressId=" + addressId +
                ", products=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointOfSale that = (PointOfSale) o;
        return id == that.id &&
                addressId == that.addressId &&
                Objects.equals(name, that.name) &&
                Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addressId, products);
    }
}
