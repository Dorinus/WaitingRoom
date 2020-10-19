public class Main
{
  public static void main(String[] args)
  {

    WaitingRoom waitingRoom = new WaitingRoom();

    Thread thread = new Thread(waitingRoom);
    thread.start();

    Patient patient1 = new Patient(1, waitingRoom);
    Patient patient3 = new Patient(3, waitingRoom);
    Patient patient13 = new Patient(13, waitingRoom);

  }
}
