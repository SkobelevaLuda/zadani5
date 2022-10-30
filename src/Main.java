public class Main {
    public static void main(String[] args) {

        // Задание 1

        System.out.println(" Задание 1 ");

        int age = 16;
        if (age >= 18) {
            System.out.println(" Поздавляем с совершеннолетием! ");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
            if (age < 18) {
                System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
            }

            // Задание 2.
            System.out.println("Задание 2");
            if (age >= 7 && age < 18) {
                System.out.println(" Ребенок ходит в школу ");
            }
            if (age >= 18 && age < 24) {
                System.out.println(" Человек уже закончил школу и может отправляться в университет ");
            }
            if (age >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу ");
            }
            // Задание 3
            System.out.println(" Задание 3 ");

            int numberPeople = 58;
            if (numberPeople < 60) {
                System.out.println(" Сидячие места есть ");
            }
            if (numberPeople >= 60 && numberPeople < 102) {
                System.out.println(" Стоячие места есть ");
            }
            if (numberPeople >= 102) {
                System.out.println(" Мест нет! ");
            }

        }
    }
}