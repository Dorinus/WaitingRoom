package temperature;

import javafx.application.Application;
import javafx.stage.Stage;
import temperature.core.ModelFactory;
import temperature.core.ViewHandler;
import temperature.core.ViewModelFactory;

public class TemperatureApp extends Application
{

  @Override public void start(Stage stage) throws Exception
  {
    ModelFactory mf = new ModelFactory();
    ViewModelFactory vmf = new ViewModelFactory(mf);
    ViewHandler vh = new ViewHandler(vmf);



    vh.start();
  }
}
