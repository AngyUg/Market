
import dao.DaoPointOfSale;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import models.PointOfSale;
import services.MenuButton;


public class Main extends Application {
    public static void main(String[] args) {
       // Product product = new Product();
       // Address address = new Address();

        //add product
//        product.setName("Yo-yo");
//        product.setPrice(225.00);
//        product.setAmount(1.00);
//        product.setDescription("Toys");
//        product.setPointId(1);
//        DaoProduct.addProduct(product);

        //add address
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
//        DaoPointOfSale.addPoint(point);
//
//        for (Product product1:DaoProduct.getProductsList()){
//            System.out.println(product1.toString());
//        }
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        primaryStage.setMaximized(true);

        PointOfSale point = new PointOfSale();
               point=  DaoPointOfSale.getPointById(1);
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root);
        boolean add = scene.getStylesheets().add("application.css");
        System.out.println("Is added applications.css "+add);
        primaryStage.setTitle(point.getName());
        primaryStage.setScene(MenuButton.productsInfo(point));
        primaryStage.show();


    }
}
