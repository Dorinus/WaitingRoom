package view.textchart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextController
{
  @FXML private Label updateTimeStamp;
  @FXML private  TextField xTextField;
  @FXML private  TextField yTextField;
  @FXML private  TextField zTextField;
  private TextViewModel viewModel;

  public void init(TextViewModel viewModel){
    this.viewModel = viewModel;
    updateTimeStamp.textProperty().bind(viewModel.updateTimeStampProperty());
    xTextField.textProperty().bindBidirectional(viewModel.xProperty());
    yTextField.textProperty().bindBidirectional(viewModel.yProperty());
    zTextField.textProperty().bindBidirectional(viewModel.zProperty());


}


  @FXML private void onUpdateButton(ActionEvent actionEvent)
  {
    viewModel.update();
  }

  @FXML private void onSaveButton(ActionEvent actionEvent)
  {
    viewModel.save();
  }
}
