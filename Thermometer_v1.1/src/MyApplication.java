import external.Thermometer;
import javafx.application.Application;
import javafx.stage.Stage;
import temperature.mediator.TemperatureModel;
import temperature.mediator.TemperatureModelManager;
import temperature.view.ViewHandler;

public class MyApplication extends Application
{
  public void start(Stage primaryStage)
  {
    // Model
    TemperatureModel model = new TemperatureModelManager();

    // View
    ViewHandler view = new ViewHandler(model);
    view.start(primaryStage);


    Thread thermometer1 = new Thread(new Thermometer(model,"t1",15,1));
    Thread thermometer2 = new Thread(new Thermometer(model,"t2",15,7));
    thermometer1.start();
    thermometer2.start();
  }
}
