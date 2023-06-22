package AimsProject.src.hust.soict.globalict.aims.screen;

import AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import AimsProject.src.hust.soict.globalict.aims.media.Book;
import AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.globalict.aims.screen.controller.*;
import AimsProject.src.hust.soict.globalict.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Initialize media item
        DigitalVideoDisc dvd1= new DigitalVideoDisc(1,"Canyfia", "Animation",
                19.95f,87 , "Tom Lord");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Authentic", "Science Fiction",
                24.95f, 87, "Mione Chris");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);

        List<String> authors1 = new ArrayList<String>();
        authors1.add("Yann Martel");
        Book book1 = new Book(4, "Life Of Pi", "Action and adventure",
                25.5f, authors1);
        List<String> authors2 = new ArrayList<>();
        authors2.add(". Beyond the End of the World");
        authors2.add("Meagan Sooner");
        Book book2 = new Book(5, "Beyond the End of the World", "Young Adult",
                15.8f, authors2);
        Store store = new Store();
        Cart cart = new Cart();
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(book1);
        store.addMedia(book2);

        FXMLLoader fxmlStoreLoader = new FXMLLoader(App.class.getResource("view/store.fxml"));
        FXMLLoader fxmlCartLoader = new FXMLLoader(App.class.getResource("view/cart.fxml"));

        Scene storeScene = new Scene(fxmlStoreLoader.load(), 1028, 768);
        Scene cartScene = new Scene(fxmlCartLoader.load(), 1028, 768);

        storeController storeController = fxmlStoreLoader.getController();
        storeController.setStore(store);
        storeController.setCartScene(cartScene);
        storeController.setCart(cart);

        cartController cartController = fxmlCartLoader.getController();
        cartController.setCart(cart);

        stage.setScene(storeScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}