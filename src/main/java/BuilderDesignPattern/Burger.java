package BuilderDesignPattern;

public class Burger {
  private String size;
  private boolean egg;
  private boolean extraCheese;
  private boolean mayonese;
  private boolean onion;
  private boolean lettuce;


//  Step 1 Make a contructor which take BurgerBuilder as a parameter
  // here we initiliase all the variable that we got from builder class to our burger class fields
  // this constructor is private so that User will not be able to call directly but BurgerBuilder will be able to use it
  private Burger(BurgerBuilder burgerBuilder){
    // Initilase all fields and you can also add validations; like without bread you cannot create burger so that kind of validation
    this.size = burgerBuilder.size;
    this.egg = burgerBuilder.egg;
    this.extraCheese = burgerBuilder.extraCheese;
    this.mayonese = burgerBuilder.mayonese;
    this.onion = burgerBuilder.onion;
    this.lettuce = burgerBuilder.lettuce;
  }

  // Step 2 : Make a burgerBuilder class with the same fields and its setter will return BurgerBuilder
  // step 3 : Make a build Method in this class which return Burger and calls Burger constructor by passing current[this]
  // in constructor
  public static class BurgerBuilder{

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;


    public BurgerBuilder size(String size) {
      this.size = size;
      return this;
    }

    public BurgerBuilder egg(boolean egg) {
      this.egg = egg;
      return this;
    }

    public BurgerBuilder extraCheese(boolean extraCheese) {
      this.extraCheese = extraCheese;
      return this;
    }

    public BurgerBuilder mayonese(boolean mayonese) {
      this.mayonese = mayonese;
      return this;
    }

    public BurgerBuilder onion(boolean onion) {
      this.onion = onion;
      return this;
    }

    public BurgerBuilder lettuce(boolean lettuce) {
      this.lettuce = lettuce;
      return this;
    }

    // cause ultimately we need burger class
    public Burger build(){
      return new Burger(this);
    }
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public boolean isEgg() {
    return egg;
  }

  public void setEgg(boolean egg) {
    this.egg = egg;
  }

  public boolean isExtraCheese() {
    return extraCheese;
  }

  public void setExtraCheese(boolean extraCheese) {
    this.extraCheese = extraCheese;
  }

  public boolean isMayonese() {
    return mayonese;
  }

  public void setMayonese(boolean mayonese) {
    this.mayonese = mayonese;
  }

  public boolean isOnion() {
    return onion;
  }

  public void setOnion(boolean onion) {
    this.onion = onion;
  }

  public boolean isLettuce() {
    return lettuce;
  }

  public void setLettuce(boolean lettuce) {
    this.lettuce = lettuce;
  }


  @Override
  public String toString() {
    return "Burger{" +
        "size='" + size + '\'' +
        ", egg=" + egg +
        ", extraCheese=" + extraCheese +
        ", mayonese=" + mayonese +
        ", onion=" + onion +
        ", lettuce=" + lettuce +
        '}';
  }
}
