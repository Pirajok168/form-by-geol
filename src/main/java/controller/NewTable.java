package controller;

import java.net.URL;
import java.util.*;

import draw.litho.LithoCards;
import draw.litho.providers.impl.*;
import draw.litho.util.EventTypes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class NewTable {

    public CheckBox sandMP;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea _1;

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
    private javafx.scene.canvas.Canvas canvas;

    @FXML
    private VBox container;

    @FXML
    private ScrollPane contentPane;

    @FXML
    private Pane firstList;

    @FXML
    private CheckBox sludge;

    @FXML
    private CheckBox workingOut;

    @FXML
    private Group groupCheckBox;

    //region Обработка литологических разреов

    LithoCards lithoCards = new LithoCards();

    /*
    LithoCardsRegEx lithoCardsRegEx = new LithoCardsRegEx.Builder()
            .Register(new Валун(), Pattern.compile("f\\.a.+"))
            .Register(new Галька(), Pattern.compile(""))
            .Build();
    */

    //region Перехват нажатий CheckBox
    @FXML
    void onWorkingOut(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Глина.class, workingOut.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSludge(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Глыба.class, sludge.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSand(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Дресва.class, sandMP.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSilt(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Ил.class, /*todo добавить кобмобокс для Ила, а то сейчас тригер работает по флагу песка*/ sandMP.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }
    //endregion

    //endregion
}
