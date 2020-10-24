package temperature.mediator;

import java.beans.PropertyChangeListener;

public interface PropretyChangeSubject
{
  public void addListener(PropertyChangeListener listener);
  public void removeListener(PropertyChangeListener listener);
}
