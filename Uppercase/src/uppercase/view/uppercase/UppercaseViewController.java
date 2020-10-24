package uppercase.view.uppercase;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UppercaseViewController
{
  @FXML
  private Label errorLabel;
  @FXML
  private TextField requestField;
  @FXML
  private TextField replyField;
  private UppercaseViewModel viewModel;



  public void init(UppercaseViewModel uppercaseVM)
  {
    // replyField.setDisable(true);
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
}
