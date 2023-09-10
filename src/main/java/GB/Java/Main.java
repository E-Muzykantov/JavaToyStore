package GB.Java;

import GB.Java.View.ToyStoreView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToyStoreView view = new ToyStoreView();
        view.addNewToy(1, "Чебурашка", 1);
        view.addNewToy(2, "Плюшевый мишка", 2);
        view.addNewToy(3, "Машинка", 3);
        view.updateToyChance(1, 60);
        view.updateToyChance(2, 30);
        view.updateToyChance(3, 10);

        System.out.print("Добро пожаловать на розыгрыш игрушек!" +
                         "\n" + "Сегодня разыгрываются: ");
        view.getListToy();
        view.organizeGiveaway();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите любой символ, чтобы получить призовую игрушку:");
        scanner1.nextLine();
        System.out.println("Вы получили призовую игрушку: " + view.getPrizeToy().getName());

        view.writePrizeToysToFile("Toys.txt");
        System.out.println("Оставшиеся игрушки записаны в файл");
    }
}