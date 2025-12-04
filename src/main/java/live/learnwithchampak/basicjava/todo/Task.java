package live.learnwithchampak.basicjava.todo;

import java.io.Serializable;

public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private boolean completed;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return id + ". " + title + " [" + (completed ? "DONE" : "PENDING") + "]";
    }
}
