package controller;

import java.net.URL;
import java.util.ResourceBundle;

import draw.DecoratorWorkingOut;
import draw.DrawCut;
import draw.CanvasTable;
import draw.DecoratorSludge;
import draw.litho.LithoCards;
import draw.litho.providers.impl.Лед;
import draw.litho.providers.impl.Отработки;
import draw.litho.providers.impl.ПесокСреднейЗернистости;
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

    @FXML
    void onSludge(ActionEvent event) {
        if (sludge.isSelected()) {
            canvasTable = new DecoratorSludge(canvasTable, graphicsContext, canvas.getWidth(), canvas.getHeight());
            canvasTable.draw();

        } else {
            System.out.println("uncheck");
            clearCanvas();
        }
    }

    @FXML
    void onWorkingOut(ActionEvent event) {
        if (workingOut.isSelected()) {
            var r = new LithoCards();

            //r.Add(new Отработки());
           // r.Add(new Лед(10));
           r.Add(new ПесокСреднейЗернистости());

            r.Draw(canvas);

            canvasTable = new DecoratorWorkingOut(canvasTable, graphicsContext, canvas.getWidth(), canvas.getHeight());
            canvasTable.draw();
        } else {
            System.out.println("uncheck");
            clearCanvas();
        }
    }

    private void clearCanvas() {
        canvasTable.clear();
        for (int i = 0; i < list.size(); i++) {
            CheckBox checkBox = (CheckBox) list.get(i);
            String id = "";
            if (checkBox.isSelected()) {
                id = checkBox.getId();
            }

            switch (id) {
                case "sludge" -> {
                    canvasTable = new DecoratorSludge(canvasTable, graphicsContext, canvas.getWidth(), canvas.getHeight());
                    canvasTable.draw();
                }
                case "workingOut" -> {
                    canvasTable = new DecoratorWorkingOut(canvasTable, graphicsContext, canvas.getWidth(), canvas.getHeight());
                    canvasTable.draw();
                }
                default -> {
                    System.out.println("Nothing");
                }
            }
        }
    }

    @FXML
    void initialize() {
        graphicsContext = canvas.getGraphicsContext2D();
        canvasTable = new CanvasTable();
        list = groupCheckBox.getChildren();

    }

}
