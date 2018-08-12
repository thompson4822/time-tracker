package training.taylor.timetracker.core.dao;

/**
 * Created by steve at OverByte on 8/12/18.
 */
public interface ITimeEntry {
    /**
     * What is the description?
     * @return description
     */
    String getDescription();

    /**
     * Set the description to the given value.
     * @param value to set the description to
     */
    void setDescription(String value);

    /**
     * What is the rate?
     * @return rate
     */
    float getRate();

    /**
     * Set the rate to the given value.
     * @param value the rate
     */
    void setRate(float value);

    /**
     * What is the time?
     * @return the time
     */
    int getTime();

    /**
     * Set the time to the given value.
     * @param value the time
     */
    void setTime(int value);
}
