package homework13.thread;

import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {

    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Race(Road road, Tunnel tunnel, Road road1, Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
