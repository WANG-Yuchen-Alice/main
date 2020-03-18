package fithelper.model.profile;

import static fithelper.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

import fithelper.model.weight.Bmi;
import fithelper.model.weight.Weight;
import fithelper.model.weight.WeightValue;

/**
 * Represents the user profile in the FitHelper.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Profile {

    private final Name name;
    private final Gender gender;
    private final Age age;
    private final Address address;
    private final Height height;
    private final TargetWeight targetWeight;
    private final WeightValue currentWeight;
    private final Bmi currentBmi;

    /**
     * Construct an empty profile.
     */
    public Profile() {
        this.name = null;
        this.age = null;
        this.gender = null;
        this.address = null;
        this.height = null;
        this.targetWeight = null;
        this.currentWeight = null;
        this.currentBmi = null;
    }

    /**
     * Construct a profile without current weight and bmi.
     * Every other field must be present and not null.
     */
    public Profile(Name name, Gender gender, Age age, Address address, Height height, TargetWeight targetWeight) {
        requireAllNonNull(name, age, gender, address, height, targetWeight);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.height = height;
        this.targetWeight = targetWeight;
        this.currentWeight = null;
        this.currentBmi = null;
    }

    /**
     * Construct a profile with current weight.
     * Every field must be present and not null.
     */
    public Profile(Name name, Gender gender, Age age, Address address, Height height,
                   TargetWeight targetWeight, Weight weight) {
        requireAllNonNull(name, age, gender, address, height, targetWeight);
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.height = height;
        this.targetWeight = targetWeight;
        this.currentWeight = weight.getWeightValue();
        this.currentBmi = weight.getBmi();
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public TargetWeight getTargetWeight() {
        return targetWeight;
    }

    public Height getHeight() {
        return height;
    }

    public WeightValue getCurrentWeight() {
        return currentWeight;
    }

    public Bmi getCurrentBmi() {
        return currentBmi;
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, gender, age, address, height, targetWeight, currentWeight, currentBmi);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Name: ")
                .append(this.name == null ? "NA" : getName())
                .append(" Gender: ")
                .append(this.gender == null ? "NA" : getGender())
                .append(" Age: ")
                .append(this.age == null ? "NA" : getAge())
                .append(" Address: ")
                .append(this.age == null ? "NA" : getAddress())
                .append(" Height:")
                .append(this.height == null ? "NA" : getHeight())
                .append(" Target Weight: ")
                .append(this.targetWeight == null ? "NA" : getTargetWeight().toString())
                .append(" Current Weight: ")
                .append(this.currentWeight == null ? "NA" : getCurrentWeight())
                .append(" Current BMI: ")
                .append(this.currentBmi == null ? "NA" : getCurrentBmi());
        return builder.toString();
    }

}
