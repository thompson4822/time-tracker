package training.taylor.timetracker.core;

import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by steve at OverByte on 8/12/18.
 */
public interface ITracker {
    /**
     * Remove the given time entry from known entries.
     * @param entry time entry to remove.
     */
    void remove(TimeEntry entry);

    /**
     * What is the time entry at the given index?
     * @param index index into the time entries list
     * @return time entry.
     */
    TimeEntry get(int index);
}
