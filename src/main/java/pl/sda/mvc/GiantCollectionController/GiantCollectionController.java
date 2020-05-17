package pl.sda.mvc.GiantCollectionController;


import pl.sda.mvc.GiantController.Fatigue;
import pl.sda.mvc.GiantController.Health;
import pl.sda.mvc.GiantController.Nourishment;

import java.util.ArrayList;
import java.util.List;

public class GiantCollectionController {
    private List<GiantModel> giantModel;
    private GiantView giantView;

    public GiantCollectionController(List<GiantModel> giantModel, GiantView giantView) {
        this.giantModel = new ArrayList<>();
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }

    public Health getHealth(int index) {
        return this.giantModel.get(index).getHealth();
    }

    public void setHealth(Health health, int index) {
        this.giantModel.get(index).setHealth(health);
    }

    public Fatigue getFatigue(int index) {
        return this.giantModel.get(index).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int index) {
        this.giantModel.get(index).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int index) {
        return this.giantModel.get(index).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int index) {
        this.giantModel.get(index).setNourishment(nourishment);
    }
}
