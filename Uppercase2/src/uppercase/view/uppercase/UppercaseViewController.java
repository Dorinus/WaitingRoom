package uppercase.view.uppercase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import uppercase.core.ViewHandler;
import uppercase.view.log.LogViewModel;

public class UppercaseViewController
{
  @FXML
  private Label errorLabel;
  @FXML
  private TextField requestField;
  @FXML
  private TextField replyField;

  private UppercaseViewModel viewModel;
  private LogViewModel logViewModel;
  private ViewHandler viewHandler;



  public void init(ViewHandler viewHandler,UppercaseViewModel uppercaseVM)
  {
    // replyField.setDisable(true);

    this.viewHandler = viewHandler;
    this.viewModel = uppercaseVM;

    errorLabel.textProperty().bind(viewModel.errorProperty());
    requestField.textProperty().bindBidirectional(viewModel.requestProperty());
    replyField.textProperty().bind(viewModel.replyProperty());
  }

  @FXML
  private void onSubmitButton(ActionEvent actionEvent)
  {
    viewModel.convert();
  }

  @FXML
  private void onShow(ActionEvent actionEvent)
  {
    viewHandler.openLogView("log");
  }


}
