package AdapterDesignPattern.BirdExample;

public class Main {
  public static void main(String[] args) {
    Bird bird = new Sparrow();
    bird.makeSound();
    bird.fly();

    ToyDuck toyDuck = new PlasticToyDuck();
    toyDuck.squeak();

    ToyDuck birdAdapter = new BirdAdapter(bird);
    birdAdapter.squeak();

    // toy duck behaving like a bird
    System.out.println();
  }
}
