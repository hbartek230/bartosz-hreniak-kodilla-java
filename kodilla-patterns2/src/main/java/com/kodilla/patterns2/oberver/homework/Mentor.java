package com.kodilla.patterns2.oberver.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(TaskQueue taskQueue) {
        updateCount++;
        System.out.println(mentorName + " :" + taskQueue.getUserTaskListName() + " has new task" + "\n" +
                "(total: " + updateCount + " tasks)");
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
