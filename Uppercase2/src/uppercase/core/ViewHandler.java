package uppercase.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uppercase.view.log.LogViewController;
import uppercase.view.uppercase.UppercaseViewController;

import java.io.IOException;

public class ViewHandler
{
  private ViewModelFactory vmf;
  private Scene uppercaseScene, logScene;
  private Stage stage;

  public ViewHandler(ViewModelFactory vmf)
  {
    this.vmf = vmf;
  }

  public void  start(){
    stage = new Stage();
    openToUpperCase();
  }

  public  void openToUpperCase(){

    if (uppercaseScene==null)
    {
      try
      {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("../view/uppercase/UppercaseView.fxml"));
        Parent root = loader.load();

        UppercaseViewController ctrl = loader.getController();
        ctrl.init(this,vmf.getUppercaseVM());

        stage.setTitle("Upper Case");
        uppercaseScene  = new Scene(root);


      } catch (IOException e){
        e.printStackTrace();
      }
    }

    stage.setScene(uppercaseScene);
    stage.show();

  }

  public void openLogView(String arg)
  {
    vmf.getUppercaseVM().clear();
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("../view/log/LogView.fxml"));
      Parent root = loader.load();

      LogViewController ctrl = loader.getController();
      ctrl.init(this,vmf.getLogViewModel());

      stage.setTitle(arg);
      logScene  = new Scene(root);


    } catch (IOException e){
      e.printStackTrace();
    }

    stage.setScene(logScene);
    stage.show();
  }
}
