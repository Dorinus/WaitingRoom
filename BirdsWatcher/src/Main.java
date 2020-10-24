public class Main
{
  public static void main(String[] args)
  {
    Bird bird = new Bird();

    BirdWatcher birdWatcher = new BirdWatcher(bird);
    BlindBirdWatcher blindBirdWatcher = new BlindBirdWatcher(bird);

    bird.sing();
    bird.wings();

    bird.wings();
  }
}
