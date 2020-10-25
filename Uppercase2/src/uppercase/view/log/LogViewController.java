package uppercase.view.log;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import uppercase.core.ViewHandler;

public class LogViewController
{
  @FXML
  private ListView<String> logList;
  private ViewHandler viewHandler;
  private LogViewModel viewModel;


  public void init(ViewHandler viewHandler, LogViewModel viewModel){

    this.viewHandler = viewHandler;
    this.viewModel =viewModel;

    logList.setItems(viewModel.getLogs());
    viewModel.loadlogs();
  }

  @FXML
  private void onBack(ActionEvent actionEvent)
  {
    viewHandler.openToUpperCase();
  }
}
