// import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! 
// (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120


// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Введите число: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         int f = 1;
//         for (int i = 1; i<=n; i++){
//              sum+=i;            
//              f*=i;
//             }
//         System.out.println(sum);
//         System.out.println(f);
//         sc.close();

//     }
// }

// Вывести все простые числа от 1 до 1000

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите положительное число: ");
//         int input = scanner.nextInt();
//         scanner.close();
//         List<Integer> primes = new ArrayList<>();

//         for (int i = 2; i <= input; i++) {
//             boolean isPrimeNumber = true;

//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     isPrimeNumber = false;
//                     break;
//                 }
//             }

//             if (isPrimeNumber) {
//                 primes.add(i);
//             }
//         }
//         System.out.println("Простые числа: " + primes);
//     }
// }

// // Реализовать простой калькулятор (+ - / *)
// // Ввод числа ->
// // Ввод знака ->
// // Ввод числа ->


// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Введите первое число: ");
//         int numb_a = sc.nextInt();
//         System.out.println("Введите операцию + - / *: ");
//         char operation;
//         System.out.print("Введите второе число: ");
//         int numb_b = sc.nextInt();
//         operation = sc.next().charAt(0);
//         int res;
//         switch (operation) {
//             case '+':
//                 res = numb_a + numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '-':
//                 res = numb_a - numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '/':
//                 res = numb_a / numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;
//             case '*':
//                 res = numb_a * numb_b;
//                 System.out.printf("Результат: %d",res);
//                 break;

//         }
//         sc.close();
//     }
// }