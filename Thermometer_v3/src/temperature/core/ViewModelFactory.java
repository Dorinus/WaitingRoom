package temperature.core;

import temperature.view.TemperatureViewModel;

public class ViewModelFactory
{
private TemperatureViewModel tempVM;
private ModelFactory modelFactory;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory = modelFactory;
  }

  public TemperatureViewModel getTempVM()
  {
    if(tempVM==null) tempVM = new TemperatureViewModel(modelFactory.getTemperatureModel());
    return tempVM;
  }
}
