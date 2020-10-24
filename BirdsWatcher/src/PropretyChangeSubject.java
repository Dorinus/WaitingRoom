import java.beans.PropertyChangeListener;

public interface PropretyChangeSubject
{
  void addListener(PropertyChangeListener listener);
  void addListener(String event,PropertyChangeListener listener);

  void removeListener(PropertyChangeListener listener);
  void removeListener(String event,PropertyChangeListener listener);
}
