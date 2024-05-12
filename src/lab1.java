public class lab1 {
    //Завдання 1. Створити програму, яка виводитиме у консоль випадкове натуральне число з проміжку [-20; 20].
    public static void main(String[] args) {
        //Генерація випадкового натуральна числа з проміжку [-20; 20]
        int RandomNumber = (int) (Math.random() * 41) - 20;
        //Вивід числа у консоль
        System.out.println("Натуральне число з проміжку [-20; 20]: "+RandomNumber);

    }
}
