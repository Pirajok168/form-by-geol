import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class CellContoller extends ListCell<LeftTabs> {
    private Node node;

    @Override
    protected void updateItem(LeftTabs leftTabs, boolean b) {
        super.updateItem(leftTabs, b);
        if(leftTabs == null){
            setText(null);
            setGraphic(null);
        }else{
            String path = "";
            switch (leftTabs){
                case Result -> {
                    path="tabsPrev\\resultPrevItem.fxml";
                }
                case Documentation -> {
                    path="tabsPrev\\documentPrevItem.fxml";
                }
                default -> {
                    path="tabsPrev\\documentPrevItem.fxml";
                }
            }
            try {
                if (node==null){
                    node = FXMLLoader.load(getClass().getResource(path));
                }
                setGraphic(node);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

}
