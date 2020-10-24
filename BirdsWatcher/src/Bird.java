import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Bird implements PropretyChangeSubject
{

  private PropertyChangeSupport support = new PropertyChangeSupport(this);



  public void sing(){
    System.out.println("Chip chirip");
    support.firePropertyChange("SING", null , null);
  }

  public void wings(){
    System.out.println("Bird flashes the wings");
    support.firePropertyChange("WINGS", null , null);
  }


  @Override public void addListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void addListener(String event, PropertyChangeListener listener)
  {
    if(event.equals("") || event == null) addListener(listener);
    else support.addPropertyChangeListener(event,listener);
  }

  @Override public void removeListener(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);
  }

  @Override public void removeListener(String event, PropertyChangeListener listener)
  {
    if(event.equals("")|| event == null) removeListener(listener);
    else support.removePropertyChangeListener(event,listener);
  }


}
