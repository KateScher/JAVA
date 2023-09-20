package Homeworks;

import java.util.*;

// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена
// с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 

public class Homework_5 {

  // Метод sortedPrint() сортирует и распечатывает данные по абонентам
  static void sortedPrint(Map<String, ArrayList<Integer>> map) {

    // Получаем набор всех ключей abon
    Set<String> keySet = map.keySet();

    // Находим минимальное и максимальное значение
    int maxCount = 0;
    int minCount = 1_000_000;

    for (var item : map.entrySet()) {
      if (maxCount < item.getValue().size())
        maxCount = item.getValue().size();
      if (minCount > item.getValue().size())
        minCount = item.getValue().size();

    }
    // Формируем стек, начиная с минимального количества номеров
    Stack<String> st = new Stack<>();
    int num = minCount;
    while (num <= maxCount) {
      // System.out.println(map);
      for (var item : map.entrySet()) {
        if (item.getValue().size() == num) {
          st.push(item.getKey());
        }
      }
      num += 1;
    }
    // Распечатываем пары в порядке ключей, находящихся в стеке
    String name;
    for (int i = 0; i < keySet.size(); i++) {
      name = st.pop();
      for (var item : map.entrySet()) {
        if (name == item.getKey()) {
          System.out.printf("%8s: ", item.getKey());
          System.out.println(item.getValue());
        }
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // Создание списка абонентов
    Map<String, ArrayList<Integer>> abon = new HashMap<>() {
      {
        put("Morozova", new ArrayList<Integer>() {
          {
            add(6547892);
            add(9654782);
            add(6425318);
            add(1236547);
            add(9514728);
          }
        });
        put("Pupkin", new ArrayList<Integer>() {
          {
            add(6523124);
            add(6547824);
            add(3214698);
          }
        });
        put("Pitkin", new ArrayList<Integer>() {
          {
            add(4921756);
          }
        });
        put("Vetrov", new ArrayList<Integer>() {
          {
            add(3215874);
            add(6542312);

          }
        });
        put("Petechkin", new ArrayList<Integer>() {
          {
            add(3215478);
            add(1376566);
            add(9965471);
            add(9952241);
          }
        });
      }
    };
    System.out.println();
    // Печатаем исходный набор данных
    System.out.println("Исходные данные: ");
    sortedPrint(abon);
  }

}