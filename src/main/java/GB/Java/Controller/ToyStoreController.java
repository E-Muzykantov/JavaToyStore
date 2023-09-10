package GB.Java.Controller;

import GB.Java.Model.Toy;
import GB.Java.Model.ToyStore;

public class ToyStoreController {
    private ToyStore toyStore;

    public ToyStoreController() {
        toyStore = new ToyStore();
    }

    public void addToy(Toy toy) {
        toyStore.addToy(toy);
    }

    public void updateChance(int toyId, int chance) {
        toyStore.updateChance(toyId, chance);
    }

    public void organizeGiveaway() {
        toyStore.organizeGiveaway();
    }

    public Toy getPrizeToy() {
        return toyStore.getPrizeToy();
    }

    public void writePrizeToysToFile(String filename) {
        toyStore.writePrizeToysToFile(filename);
    }

    public void getListToy() {
        toyStore.getListToy();
    }
}