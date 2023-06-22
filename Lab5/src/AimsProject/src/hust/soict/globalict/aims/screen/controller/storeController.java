package AimsProject.src.hust.soict.globalict.aims.screen.controller;

import AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import AimsProject.src.hust.soict.globalict.aims.media.Media;
import AimsProject.src.hust.soict.globalict.aims.screen.controller.addBookController;
import AimsProject.src.hust.soict.globalict.aims.store.Store;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class storeController implements Initializable {
    private Store store = new Store();
    private Scene cartScene;
    private Cart cart;

    @FXML
    private BorderPane root;

    @FXML
    private GridPane itemGrid;

    @FXML
    private MenuItem itemAddBook;

    @FXML
    private MenuItem itemAddCD;

    @FXML
    private MenuItem itemAddDVD;


    @Override
    public void initialize(URL location, ResourceBundle resource) {
        Platform.runLater(() -> {
            ArrayList<Media> itemsInStore = this.store.getItemsInStore();

            int col = 0;
            int row = 1;
            try {
                for (Media media : itemsInStore) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("view/storeitem.fxml"));
                    VBox box = fxmlLoader.load();
                    storeItemController storeItemController = fxmlLoader.getController();
                    storeItemController.setMedia(media);
                    storeItemController.setCart(cart);
                    if (col == 3) {
                        col = 0;
                        ++row;
                    }
                    itemGrid.add(box, col++, row);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    @FXML
    void btnViewCartClicked(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(cartScene);
    }
    @FXML
    void itemAddBookClicked(ActionEvent event) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/addbook.fxml"));
        Scene addBookScene = new Scene(fxmlLoader.load(), 1024, 768);

        addBookController addBook = fxmlLoader.getController();
        addBook.setStore(this.store);
        addBook.setStoreScene(root.getScene());
        stage.setScene(addBookScene);

    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setCartScene(Scene cartScreen) {
        this.cartScene = cartScreen;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}