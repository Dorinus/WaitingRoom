import java.beans.PropertyChangeEvent;

public class BirdWatcher
{
  public BirdWatcher(PropretyChangeSubject subject)
  {
    subject.addListener("SING", this::reactToSinging);
    subject.addListener("WINGS", this::reactToWings);
  }

  private void reactToWings(PropertyChangeEvent event)
  {
    System.out.println("Wow how beautiful it looks when singing");
  }

  private void reactToSinging(PropertyChangeEvent event)
  {

    System.out.println("Wow how beautiful it looks when it flashes it's wings");
  }
}
