package controller;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;
import java.util.regex.Pattern;

import draw.DrawCut;
import draw.CanvasTable;
import draw.litho.LithoCards;
import draw.litho.LithoCardsCore;
import draw.litho.LithoCardsRegEx;
import draw.litho.providers.ILithoPatternProvider;
import draw.litho.providers.impl.*;
import draw.litho.util.EventTypes;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
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

    private ObservableList<Node> list;
    private GraphicsContext graphicsContext;
    private DrawCut canvasTable;

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
        lithoCards.UpdateAndDraw(canvas, Отработки.class, workingOut.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSludge(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Лед.class, sludge.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSand(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, ПесокСЗ.class, sandMP.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }

    @FXML
    void onSilt(ActionEvent event) {
        lithoCards.UpdateAndDraw(canvas, Ил.class, /*todo добавить кобмобокс для Ила, а то сейчас тригер работает по флагу песка*/ sandMP.isSelected() ? EventTypes.Add : EventTypes.Remove);
    }
    //endregion

    //endregion

    @FXML
    void initialize() {
        graphicsContext = canvas.getGraphicsContext2D();
        canvasTable = new CanvasTable();
        list = groupCheckBox.getChildren();

    }

}
