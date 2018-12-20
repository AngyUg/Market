import dao.DaoAddress;
import dao.DaoPoint;
import dao.DaoProduct;
import models.Address;
import models.PointOfSale;
import models.Product;

public class Main {
    public static void main(String[] args) {
        PointOfSale point = new PointOfSale();
        Product product = new Product();
        Address address = new Address();

//        //add product
//        product.setName("Yo-yo");
//        product.setPrice(225.00);
//        product.setAmount(1.00);
//        product.setDescription("Toys");
//        product.setPointId(1);
//        DaoProduct.addProduct(product);

//        //add address
//        address.setCountry("Ukraine");
//        address.setRegion("Kiyvsky");
//        address.setCity("Kyiv");
//        address.setDistrict("Pechersky");
//        address.setStreet("Lesy");
//        address.setHouseNumb("15");
//        address.setIndex("01445");
//        DaoAddress.addAddress(address);

//        //add point of sale
//        point.setAddressId(7);
//        point.setName("Fozzy");
//        DaoPoint.addPoint(point);

        for (Product product1:DaoProduct.getProductsList()){
            System.out.println(product1.toString());
        }

    }
}
