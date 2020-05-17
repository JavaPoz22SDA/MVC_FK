package pl.sda.mvc.GiantCollectionController;

import pl.sda.mvc.GiantController.Fatigue;
import pl.sda.mvc.GiantController.Health;
import pl.sda.mvc.GiantController.Nourishment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GiantView giantView = new GiantView();

        GiantModel solider = new GiantModel(Health.DEAD,Fatigue.SLEEPING,Nourishment.HUNGRY);
        GiantModel solider2 = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.SATURATED);

        List<GiantModel> listSolider = new ArrayList<>();
        listSolider.add(solider);
        listSolider.add(solider2);

        GiantCollectionController giantCollectionController = new GiantCollectionController(listSolider, giantView);
        giantCollectionController.updateView();
        giantCollectionController.setNourishment(Nourishment.HUNGRY,1);
        giantCollectionController.updateView();

    }
}
