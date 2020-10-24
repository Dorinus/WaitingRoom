package external;

import java.beans.PropertyChangeListener;

public interface PropretyChangeSubject
{
  public void addlistener(PropertyChangeListener listener);
  public void removeListener(PropertyChangeListener listener);
}
