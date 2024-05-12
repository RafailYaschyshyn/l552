public class lab2 {
    //Завдання 2. Створити програму визначення та виводу у консоль площі та периметру
    // прямокутного трикутника, якщо довжина катетів складає 3 та 4.
    public static void main(String[] args) {
        // Задані довжини катетів
        double katet1 = 3;
        double katet2 = 4;
        double hypotenuse = Math.sqrt((katet1*katet1)+(katet2*katet2)); // Знаходимо гіпотенузу за теоремою Піфагора
        double S = (katet1*katet2) / 2;  // Знаходимо площу трикутника
        double P = katet1+katet2+hypotenuse; // Знаходимо периметр трикутника
        // Виводимо результати
        System.out.println("Довжина катета а: " + katet1);
        System.out.println("Довжина катета b: " + katet2);
        System.out.println("Довжина гіпотенузи c: " + hypotenuse);
        System.out.println("Площа прямокутного трикутника: " + S);
        System.out.println("Периметр прямокутного трикутника: " + P);
    }
}
