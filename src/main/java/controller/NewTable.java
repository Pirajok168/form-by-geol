package controller;

import java.net.URL;
import java.util.*;

import draw.DecoratorWorkingOut;
import draw.DrawCut;
import draw.CanvasTable;
import draw.DecoratorSludge;
import draw.litho.LithoCards;
import draw.litho.providers.impl.*;
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
    Set<LithoTypes> SelectedLithoTypes = new HashSet<>();

    //region Описание событий
    enum eventTypes {
        Add,
        Remove
    }

    enum LithoTypes {
        Отработки,
        Лед,
        ПесокСЗ,
        Ил,
        Гравий,
        Галька,
        Валун
        //расширять прим "ил"
    }
    //endregion

    //region Обновление выделенных типов
    void UpdateLithoTypesSelection(LithoTypes lithoType, eventTypes eventType) {
        switch (eventType) {
            case Add -> SelectedLithoTypes.add(lithoType);
            case Remove -> SelectedLithoTypes.remove(lithoType);
        }

        lithoCards.Clear(canvas);
        for (LithoTypes activeType : SelectedLithoTypes) {
            switch (activeType) {
                case Лед -> lithoCards.Add(new Лед());
                case ПесокСЗ -> lithoCards.Add(new ПесокСЗ(10));
                case Отработки -> lithoCards.Add(new Отработки());
                case Ил -> lithoCards.Add(new Ил());
                case Галька -> lithoCards.Add(new Галька());
                case Гравий -> lithoCards.Add(new Гравий());
                case Валун -> lithoCards.Add(new Валун());
                //расширять применение енума из сета: кейс ил -> добавить ил
            }
        }

        lithoCards.Draw(canvas);
    }
    //endregion

    //region Перехват нажатий CheckBox
    @FXML
    void onWorkingOut(ActionEvent event) {
        UpdateLithoTypesSelection(LithoTypes.Отработки, workingOut.isSelected() ? eventTypes.Add : eventTypes.Remove);
    }

    @FXML
    void onSludge(ActionEvent event) {
        UpdateLithoTypesSelection(LithoTypes.Лед, sludge.isSelected() ? eventTypes.Add : eventTypes.Remove);
    }

    @FXML
    void onSand(ActionEvent event) {
        UpdateLithoTypesSelection(LithoTypes.ПесокСЗ, sandMP.isSelected() ? eventTypes.Add : eventTypes.Remove);
    }

    @FXML
    void onSilt(ActionEvent event) {
        UpdateLithoTypesSelection(LithoTypes.Ил, /*todo добавить кобмобокс для Ила, а то сейчас тригер работает по флагу песка*/ sandMP.isSelected() ? eventTypes.Add : eventTypes.Remove);
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
