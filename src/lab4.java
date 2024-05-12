import java.util.Scanner;
public class lab4 {
    //Завдання 4. Створити прототип гри «лотерея». Суть полягає у відгадуванні
    //правильної послідовності трьох випадково згенерованих цілих чисел з проміжку [1;3].
    //Обмежити користувача 2-двома спробами.
    public static void main(String[] args) {
        //Генерація трьох випадкових цифр
        int randomNumb1 = (int) (Math.random() * 3) + 1;
            //System.out.println(randomNumb1);
        int randomNumb2 = (int) (Math.random() * 3) + 1;
            //System.out.println(randomNumb2);
        int randomNumb3 = (int) (Math.random() * 3) + 1;
            //System.out.println(randomNumb3);
        int i = 2; //Максимальна к-сть спроб вгадати послідовність трьох цілих чисел від 1 до 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Відгадайте послідовність трьох цілих чисел від 1 до 3: ");

        while (i>0){
            System.out.println("Спроба " + (3 - i));
            System.out.print("Введіть перше число: ");
            int Numb1 = scanner.nextInt();
            System.out.print("Введіть друге число: ");
            int Numb2 = scanner.nextInt();
            System.out.print("Введіть третє число: ");
            int Numb3 = scanner.nextInt();

            //Перевірка чи вгадана гравцем послідовність трьох цілих чисел від 1 до 3
            if(Numb1 == randomNumb1 && Numb2 == randomNumb2 && Numb3 == randomNumb3) {
                System.out.println("Вітаємо! Ви відгадали правильну послідовність чисел!");
                return;}
            else{
                    System.out.println("На жаль, ви не відгадали. Спробуйте ще раз.");
                    i--;
            }
        }
        //Вивід у консоль тексту якщо гравець не вгадав послідовність трьох цілих чисел від 1 до 3
        System.out.println("Ви використали всі спроби. Правильна послідовність чисел була: " +
                randomNumb1 + ", " + randomNumb2 + ", " + randomNumb3);
    }
}

