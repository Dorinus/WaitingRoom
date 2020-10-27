package core;

import view.piechart.PieChartController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.textchart.TextController;

import java.io.IOException;

public class ViewHandler {

    private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception{
        openView("PieChart");
        openView("Text");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;


        if("PieChart".equals(viewToOpen)) {
            String location = "../view/" + viewToOpen.toLowerCase() + "/" + viewToOpen + "View.fxml";
            loader.setLocation(getClass().getResource(location));
            root = loader.load();

            PieChartController view = loader.getController();
            view.init(viewModelFactory.getPieChartViewModel());
            stage.setTitle("Pie Chart");

            Stage localStage = new Stage();
            scene = new Scene(root);
            localStage.setScene(scene);
            localStage.show();
        } else if ("Text".equals(viewToOpen)) {

            String location1 = "../view/textchart/TextView.fxml";
            loader.setLocation(getClass().getResource(location1));
            root = loader.load();

            TextController textController = loader.getController();
            textController.init(viewModelFactory.getTextViewModel());
            stage.setTitle("Text");

            Stage localStage = new Stage();
            scene = new Scene(root);
            localStage.setScene(scene);
            localStage.show();
        }




//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }
}
