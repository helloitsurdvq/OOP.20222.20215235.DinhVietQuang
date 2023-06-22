package AimsProject.src.hust.soict.globalict.aims.screen.controller;

import AimsProject.src.hust.soict.globalict.aims.media.Book;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class addBookController extends addItemController {
    @FXML
    private TextField inputAuthors;

    @Override
    public void btnSubmitClicked(MouseEvent event) {
        try{
            String id = inputId.getText();
            String title = inputTitle.getText();
            String category = inputCategory.getText();
            String cost = inputCost.getText();
            String authors = inputAuthors.getText();
            List<String> authorList = new ArrayList<>();
            authorList.add(authors);
            Book newBook = new Book(Integer.parseInt(id), title,
                    category, Float.parseFloat(cost), authorList);
            store.addMedia(newBook);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}