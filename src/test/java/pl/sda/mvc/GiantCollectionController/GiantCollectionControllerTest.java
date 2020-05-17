package pl.sda.mvc.GiantCollectionController;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiantCollectionControllerTest {

    private List<GiantModel> giantModel;
    private GiantView giantView;
    private GiantCollectionController giantCollectionController;

    @BeforeEach
    public void setUp(){
        System.out.println("Przed");
        giantModel = (List<GiantModel>) Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        giantCollectionController = new GiantCollectionController(giantModel, giantView);
    }
}