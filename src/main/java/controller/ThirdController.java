package controller;

import View.Model;
import View.Single;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ThirdController {
    @FXML
    private TextArea _1;

    @FXML
    private TextArea _10;

    @FXML
    private TextArea _11;

    @FXML
    private TextArea _12;

    @FXML
    private TextArea _13;

    @FXML
    private TextArea _14;

    @FXML
    private TextArea _15;

    @FXML
    private TextArea _16;

    @FXML
    private TextArea _17;

    @FXML
    private TextArea _2;

    @FXML
    private TextArea _3;

    @FXML
    private TextArea _4;

    @FXML
    private TextArea _5;

    @FXML
    private TextArea _6;

    @FXML
    private TextArea _7;

    @FXML
    private TextArea _8;

    @FXML
    private TextArea _9;

    private Model model = Single.getInstance().getModelFirstList();


    public void setDataThirdController(TextArea _1, TextArea _10, TextArea _11, TextArea _12, TextArea _13, TextArea _14,
                           TextArea _15, TextArea _16, TextArea _17, TextArea _2, TextArea _3, TextArea _4, TextArea _5,
                           TextArea _6, TextArea _7, TextArea _8, TextArea _9) {
        model.setDataThirdController( _1.getText(),  _10.getText(),  _11.getText(),  _12.getText(),  _13.getText(),  _14.getText(),
                 _15.getText(),  _16.getText(),  _17.getText(),  _2.getText(),  _3.getText(),  _4.getText(),  _5.getText(),
                 _6.getText(),  _7.getText(),  _8.getText(),  _9.getText());
    }
}
