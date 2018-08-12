package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description;
    private float rate;
    private int time;

    /**
     * What is the description?
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description to the given value
     * @param value to set the description to
     */
    public void setDescription(final String value) {
        this.description = value;
    }

    /**
     * What is the rate?
     * @return rate
     */
    public float getRate() {
        return rate;
    }

    /**
     * Set the rate to the given value
     * @param value the rate
     */
    public void setRate(final float value) {
        this.rate = value;
    }

    /**
     * What is the time?
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * Set the time to the given value
     * @param value the time
     */
    public void setTime(final int value) {
        this.time = value;
    }

    /**
     * What is the string representation of this instance?
     * @return string representing the description, rate, and time
     */
    @Override
    public String toString() {
        return "TimeEntry{" +
                "description='" + description + '\'' +
                ", rate=" + rate +
                ", time=" + time +
                '}';
    }
}
