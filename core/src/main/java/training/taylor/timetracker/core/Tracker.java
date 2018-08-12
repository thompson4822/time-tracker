package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker implements ITracker {
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
    public final void remove(final TimeEntry entry) {
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
    public final TimeEntry get(final int index) {
        return entries.get(index);
    }
}
