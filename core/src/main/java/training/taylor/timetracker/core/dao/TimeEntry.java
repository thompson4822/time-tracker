package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry implements ITimeEntry {
    private String description;
    private float rate;
    private int time;

    @Override
    public final String getDescription() {
        return description;
    }

    @Override
    public final void setDescription(final String value) {
        this.description = value;
    }

    @Override
    public final float getRate() {
        return rate;
    }

    @Override
    public final void setRate(final float value) {
        this.rate = value;
    }

    @Override
    public final int getTime() {
        return time;
    }

    @Override
    public final void setTime(final int value) {
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
