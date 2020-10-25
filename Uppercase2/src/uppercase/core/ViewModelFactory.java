package uppercase.core;

import uppercase.view.log.LogViewModel;
import uppercase.view.uppercase.UppercaseViewModel;

public class ViewModelFactory
{
 private ModelFactory modelFactory;
 private UppercaseViewModel uppercaseVM;
 private LogViewModel logViewModel;

  public ViewModelFactory(ModelFactory modelFactory)
  {
    this.modelFactory = modelFactory;
  }

  public UppercaseViewModel getUppercaseVM(){
    if(uppercaseVM == null) uppercaseVM = new UppercaseViewModel(modelFactory.getTextConverter());
    return uppercaseVM;
  }

  public LogViewModel getLogViewModel()
  {
    if(logViewModel==null) logViewModel = new LogViewModel(modelFactory.getTextConverter());
    return logViewModel;
  }
}
