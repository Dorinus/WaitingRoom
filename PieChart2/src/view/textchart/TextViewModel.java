package view.textchart;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.DataModel;

public class TextViewModel
{
  private StringProperty x;
  private StringProperty y;
  private StringProperty z;
  private StringProperty updateTimeStamp;
  private DataModel model;

  public TextViewModel(DataModel model)
  {
    this.model = model;

    x = new SimpleStringProperty();
    y = new SimpleStringProperty();
    z = new SimpleStringProperty();
    updateTimeStamp = new SimpleStringProperty();
  }

  public void save()
  {
    model.saveData(new double[]{
        Double.parseDouble(x.getValue()),
        Double.parseDouble(y.getValue()),
        Double.parseDouble(z.getValue())
    });
  }

  public void update()
  {
    double[] dataValues = model.getDataValues();
    x.setValue(Double.toString(dataValues[0]));
    y.setValue(Double.toString(dataValues[1]));
    z.setValue(Double.toString(dataValues[2]));

    updateTimeStamp.setValue(model.getLastUpdateTimeStamp());
  }


  public StringProperty xProperty()
  {
    return x;
  }


  public StringProperty yProperty()
  {
    return y;
  }


  public StringProperty zProperty()
  {
    return z;
  }


  public StringProperty updateTimeStampProperty()
  {
    return updateTimeStamp;
  }
}
