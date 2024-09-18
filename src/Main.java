import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import abit.Abiturient;

public class Main {
    public static void main(String[] args) {
        ArrayList<Abiturient> abitList = getAbitList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Виберіть дію, яку ви хочете зробити:\n" +
                "1: вивести абітурієнтів за вказаним ім'ям\n" +
                "2: Вивести список абітурієнтів, середній бал яких вище вказаного\n" +
                "3: Вивести n студентів з найвищим балом");
        int index = sc.nextInt();

        if (index < 1 || index > 3) {
            System.out.println("Невірний вибір дії.");
            System.exit(0);
        }
        if (index == 1) {
            System.out.println("Введіть ім'я: ");
            String name = sc.next();
            for (Abiturient ab : abitList) {
                if (ab.SearchToName(name)) {
                    System.out.println(ab);
                }
            }
        } else if (index == 2) {
            System.out.println("Введіть мінімальний середній бал: ");
            double avgRate = sc.nextDouble();
            for (Abiturient ab : abitList) {
                if (ab.SearchToRateUp(avgRate)) {
                    System.out.println(ab);
                }
            }
        } else if (index == 3) {
            System.out.println("Введіть кількість абітурієнтів, яких потрібно відобразити (по балам): ");
            int num = sc.nextInt();

            ArrayList<Abiturient> topAbitList = getTopAbiturients(abitList, num);

            for (Abiturient ab : topAbitList) {
                System.out.println(ab);
            }
        }

        sc.close();
    }

    public static ArrayList<Abiturient> getTopAbiturients(ArrayList<Abiturient> abitList, int num) {
        ArrayList<Abiturient> newAbitList = new ArrayList<>(abitList);

        Collections.sort(newAbitList, Comparator.comparingDouble(Abiturient::getEverygRate).reversed());

        ArrayList<Abiturient> topAbitList = new ArrayList<>();
        for (int i = 0; i < num && i < newAbitList.size(); i++) {
            topAbitList.add(newAbitList.get(i));
        }
        return topAbitList;
    }

    public static ArrayList<Abiturient> getAbitList() {
        ArrayList<Abiturient> abitList = new ArrayList<>();

        abitList.add(new Abiturient(9, "Fedorov", "Fedor", "Fedorovich", "606 Willow St", "890-234-5678", 0.80));
        abitList.add(new Abiturient(10, "Alekseev", "Alexey", "Alexeevich", "707 Spruce St", "567-789-0123", 0.60));
        abitList.add(new Abiturient(7, "Vasiliev", "Vasily", "Vasilievich", "404 Elm St", "654-321-8765", 1.00));
        abitList.add(new Abiturient(8, "Mikhailov", "Mikhail", "Mikhailovich", "505 Ash St", "789-123-4567", 0.70));
        abitList.add(new Abiturient(5, "Kuznetsov", "Konstantin", "Konstantinovich", "202 Birch St", "432-987-6543", 0.55));
        abitList.add(new Abiturient(6, "Popov", "Pavel", "Pavlovich", "303 Cedar St", "213-546-8790", 0.90));
        abitList.add(new Abiturient(3, "Sidorov", "Sidr", "Sidorovich", "789 Pine St", "567-890-1234", 0.65));
        abitList.add(new Abiturient(4, "Smirnov", "Sergey", "Sergeevich", "101 Maple St", "321-654-9870", 0.95));
        abitList.add(new Abiturient(1, "Ivanov", "Ivan", "Ivanovich", "123 Main St", "123-456-7890", 0.85));
        abitList.add(new Abiturient(2, "Petrov", "Petr", "Petrovich", "456 Oak St", "987-654-3210", 0.75));

        return abitList;
    }
}
