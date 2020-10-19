import java.beans.PropertyChangeListener;

public interface Subject
{
  public void addListener(PropertyChangeListener listener);
  public void removeListener(PropertyChangeListener listener);
}
