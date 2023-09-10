package GB.Java.View;

import GB.Java.Controller.ToyStoreController;
import GB.Java.Model.Toy;

public class ToyStoreView {
    private ToyStoreController controller;

    public ToyStoreView() {
        controller = new ToyStoreController();
    }

    public void addNewToy(int id, String name, int chance) {
        Toy toy = new Toy(id, name, chance);
        controller.addToy(toy);
    }

    public void updateToyChance(int toyId, int chance) {
        controller.updateChance(toyId, chance);
    }

    public void organizeGiveaway() {
        controller.organizeGiveaway();
    }

    public Toy getPrizeToy() {
        return controller.getPrizeToy();
    }

    public void writePrizeToysToFile(String filename) {
        controller.writePrizeToysToFile(filename);
    }

    public void getListToy() {
        controller.getListToy();
    }
}