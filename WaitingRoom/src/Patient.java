import java.beans.PropertyChangeEvent;

public class Patient
{
  private int ticketNumber;
  private Subject subject;

  public Patient(int ticketNumber, Subject subject)
  {
    this.ticketNumber = ticketNumber;
    this.subject = subject;

    this.subject.addListener(this::reactToChange);
    System.out.println("Patient " + ticketNumber + " enters the room");
  }

  private void reactToChange(PropertyChangeEvent event)
  {
    System.out.println("Patient " + ticketNumber + " looks up");
    int newValue = (Integer) event.getNewValue();

    if (newValue == ticketNumber)
    {

      System.out.println("Patient " + ticketNumber + " goes to the doctor's room");
      //need to delete here
      subject.removeListener(this::reactToChange);

    }
    else
    {
      System.out.println("Patient " + ticketNumber + " goes back to looking at phone");
    }
  }


}
