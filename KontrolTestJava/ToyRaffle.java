package KontrolTestJava;

public class ToyRaffle {
  public static void main(String[] args) {
    ToyStore store = new ToyStore();

    Toy toy1 = new Toy(1, "Пупс игровой", 50, 30);
    Toy toy2 = new Toy(2, "Мягкая игрушка", 200, 40);
    Toy toy3 = new Toy(3, "Набор фокусника", 200, 90);
    Toy toy4 = new Toy(4, "Робот интерактивный", 10, 20);
    Toy toy5 = new Toy(5, "Кукла", 10, 10);
    Toy toy6 = new Toy(6, "Машинка", 200, 90);

    store.addToy(toy1);
    store.addToy(toy2);
    store.addToy(toy3);
    store.addToy(toy4);
    store.addToy(toy5);
    store.addToy(toy6);

    store.changeToyFrequency(1, 30);

    store.organizeRaffle();

    Toy prizeToy = store.getPrizeToy();
    if (prizeToy != null) {
      System.out.println("Выигрышная игрушка: " + prizeToy.getName());
    }
  }
}