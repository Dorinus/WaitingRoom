import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WaitingRoom implements Subject, Runnable
{
  private PropertyChangeSupport support;

  public WaitingRoom()
  {
    this.support = new PropertyChangeSupport(this);
  }

  @Override public void addListener(PropertyChangeListener listener)
  {
    support.addPropertyChangeListener(listener);
  }

  @Override public void removeListener(PropertyChangeListener listener)
  {
    support.removePropertyChangeListener(listener);

  }

  @Override public void run()
  {

    int counter = 0;

    while (true)
    {
      try
      {
        System.out.println("Diing! Number on the door: " + counter);
        support.firePropertyChange(null, null, counter);
        counter++;
        Thread.sleep(1000);
        System.out.println();

      }
      catch (InterruptedException e)
      {
        e.printStackTrace();
      }

    }
  }
}
