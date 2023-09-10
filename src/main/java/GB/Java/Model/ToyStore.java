package GB.Java.Model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {


    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateChance(int toyId, int chance) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setChance(chance);
                break;
            }
        }
    }

    public void organizeGiveaway() {
        Random random = new Random();
        int[] overallChance = new int[toys.size()];
        int sum = 0;
        for (int i = 0; i < toys.size(); i++) {
            sum += toys.get(i).getChance();
            overallChance[i] = sum;
        }
        int totalChance = sum;
        while (!toys.isEmpty()) {
            int randomNumber = random.nextInt(totalChance);
            int index = 0;
            while (index < overallChance.length && overallChance[index] <= randomNumber) {
                index++;
            }
            Toy prizeToy = toys.get(index);
            toys.remove(index);
            sum -= prizeToy.getChance();
            totalChance = sum;
            prizeToys.add(prizeToy);
        }
    }

    public Toy getPrizeToy() {
        Toy prizeToy = null;
        try {
            prizeToy = prizeToys.get(0);
            prizeToys.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: список призовых игрушек пуст.");
        }
        return prizeToy;
    }


    public void writePrizeToysToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (Toy toy : prizeToys) {
                writer.write(toy.getId() + "," + toy.getName() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка: запись призовых игрушек в файл: " + e.getMessage());
        }
    }

    public void getListToy() {
        System.out.println(toys);
    }
}