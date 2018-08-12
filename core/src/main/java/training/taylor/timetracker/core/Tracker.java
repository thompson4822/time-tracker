package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

/**
 * Track all of the time entries in the application.
 */
@Component
public final class Tracker implements ITracker {

    /**
     * What is the provider/repository for time entries?
     */
    @Autowired
    private List<TimeEntry> entries;

    /**
     * Add the given time entry to the known entries.
     * @param entry time entry to add.
     */
    void add(final TimeEntry entry) {
        entries.add(entry);
    }

    @Override
    public void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * What is the size of the known entries?
     * @return size of known entries.
     */
    int size() {
        return entries.size();
    }

    @Override
    public TimeEntry get(final int index) {
        return entries.get(index);
    }
}
