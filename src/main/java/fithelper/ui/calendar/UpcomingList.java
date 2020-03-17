package fithelper.ui.calendar;

import fithelper.model.entry.Entry;
import fithelper.ui.UiPart;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;


/**
 * A section which displays upcoming tasks.
 */
public class UpcomingList extends UiPart<AnchorPane> {
    private static final String FXML = "upcomingList.fxml";

    @FXML
    private StackPane upcomingList;

    public UpcomingList(ObservableList<Entry> foodList, ObservableList<Entry> sportsList) {
        super(FXML);
        getList(foodList, sportsList);
    }

    /**
     * Updates the upcoming tasks.
     */
    public void getList(ObservableList<Entry> foodList, ObservableList<Entry> sportsList) {
        upcomingList.getChildren().clear();
        findList(foodList);
        findList(sportsList);
    }

    /**
     * Finds the upcoming tasks.
     */
    public void findList(ObservableList<Entry> entries) {
        /*for (Entry entry: Entries) {
            if (currentDateTime.isAfter(entry.getDateTime())) {
                if (entry.getType().toString().equals("food")) {
                    FoodCard foodCard = new FoodCard(entry);
                    upcomingList.getChildren().add(foodCard.getRoot());
                } else {
                    SportCard sportCard= new SportCard(entry);
                    upcomingList.getChildren().add(sportCard.getRoot());
                }
                index++;
            }
        }*/
    }
}