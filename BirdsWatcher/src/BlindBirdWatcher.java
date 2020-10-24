import java.beans.PropertyChangeEvent;

public class BlindBirdWatcher
{
  public BlindBirdWatcher(PropretyChangeSubject subject)
  {
    subject.addListener("SING",this::reactToSinging);
  }

  private void reactToSinging(PropertyChangeEvent event)
  {
    System.out.println("Blind man:    I cannot see but its singing so beautiful");
  }
}
