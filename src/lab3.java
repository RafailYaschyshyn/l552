import java.util.Random;
public class lab3 {
    //Завдання 3. Створити програму визначення та виводу у консоль значення
    // з кількістю цифр у випадково згенерованому числі з проміжку [0; 101).
    public static void main(String[] args) {
        // Створюємо об'єкт для генерації випадкових чисел
        Random random = new Random();
        // Генеруємо випадкове число у межах [0, 100)
        int randomNumber = random.nextInt(101);
        // Виводимо згенероване число
        System.out.println("Згенероване випадкове число: " + randomNumber);
        // Визначаємо кількість цифр у числі
        int digitCount = 1;
        int count = randomNumber;
        while (count >= 10) {
            count /= 10;
            digitCount++;
        }
        // Виводимо кількість цифр у числі
        System.out.println("Кількість цифр у числі: " + digitCount);
    }
}
