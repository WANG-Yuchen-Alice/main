package fithelper.logic.commands;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static fithelper.logic.commands.CommandTestUtil.DESC_FOOD;
import static fithelper.logic.commands.CommandTestUtil.VALID_CALORIE_FOOD;
import static fithelper.logic.commands.CommandTestUtil.VALID_LOCATION_FOOD;
import static fithelper.logic.commands.CommandTestUtil.VALID_NAME_FOOD;
import static fithelper.logic.commands.CommandTestUtil.VALID_TIME_FOOD;

import org.junit.jupiter.api.Test;

import fithelper.logic.commands.EditCommand.EditEntryDescriptor;
import fithelper.testutil.EditEntryDescriptorBuilder;

public class EditEntryDescriptorTest {

    @Test
    public void equals() {
        // same values -> returns true
        EditEntryDescriptor descriptorWithSameValues = new EditEntryDescriptor(DESC_FOOD);
        assertTrue(DESC_FOOD.equals(descriptorWithSameValues));

        // same object -> returns true
        assertTrue(DESC_FOOD.equals(DESC_FOOD));

        // null -> returns false
        assertFalse(DESC_FOOD.equals(null));

        // different types -> returns false
        assertFalse(DESC_FOOD.equals(5));

        // different values -> returns false
        assertFalse(DESC_FOOD.equals(DESC_FOOD));

        // different name -> returns false
        EditEntryDescriptor editedFOOD = new EditEntryDescriptorBuilder(DESC_FOOD).withName(VALID_NAME_FOOD).build();
        assertFalse(DESC_FOOD.equals(editedFOOD));

        // different location -> returns false
        editedFOOD = new EditEntryDescriptorBuilder(DESC_FOOD).withLocation(VALID_LOCATION_FOOD).build();
        assertFalse(DESC_FOOD.equals(editedFOOD));

        // different time -> returns false
        editedFOOD = new EditEntryDescriptorBuilder(DESC_FOOD).withTime(VALID_TIME_FOOD).build();
        assertFalse(DESC_FOOD.equals(editedFOOD));

        // different calorie -> returns false
        editedFOOD = new EditEntryDescriptorBuilder(DESC_FOOD).withCalorie(VALID_CALORIE_FOOD).build();
        assertFalse(DESC_FOOD.equals(editedFOOD));
    }
}