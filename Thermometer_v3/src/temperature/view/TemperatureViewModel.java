package temperature.view;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import temperature.mediator.TemperatureModel;
import temperature.model.Temperature;

public class TemperatureViewModel
{

  private StringProperty thermometerId, outputLabel, filterField, filterLabel;
  private DoubleProperty temperature;




  private TemperatureModel temperatureModel;

  public TemperatureViewModel(TemperatureModel temperatureModel)
  {
    this.temperatureModel = temperatureModel;

    thermometerId = new SimpleStringProperty();
    outputLabel =new SimpleStringProperty();
    filterField   = new SimpleStringProperty();
    temperature = new SimpleDoubleProperty();
    filterLabel  = new SimpleStringProperty();
  }


  public StringProperty outputLabelProperty()
  {
    return outputLabel;
  }

  public DoubleProperty temperatureProperty()
  {
    return temperature;
  }


  public StringProperty filterFieldProperty()
  {
    return filterField;
  }

  public StringProperty thermometerIdProperty()
  {
    return thermometerId;
  }

  public void reset()
  {
    // empty
  }

  public void update()
  {
    Temperature t = temperatureModel.getLastInsertedTemperature(thermometerId.toString());
    if (t != null)
    {
      outputLabel.set(t.toString());
    }
    else
    {
      outputLabel.set("No data");
    }
  }

  public void filter()
  {
    if(filterField.get() == null) return;
    String oldValue = filterLabel.get();
    if (oldValue.equals("All"))
    {
      oldValue = null;
    }
    String id = filterField.get().toString();
    if (thermometerId.toString().isEmpty())
    {
      thermometerId = null;
      filterLabel.set("All");
    }
    else
    {
      filterLabel.set(thermometerId.toString());
    }
    filterField.set(null);
    update();
  }
}
