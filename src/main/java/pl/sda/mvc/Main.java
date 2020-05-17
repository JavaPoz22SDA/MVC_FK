package pl.sda.mvc;

public class Main {

    public static void main(String[] args) {
        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTHY,Fatigue.SLEEPING,Nourishment.HUNGRY);

        GiantController giantController = new GiantController(giantModel,giantView);
        giantController.updateView();
    }

}
