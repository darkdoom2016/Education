package Task1;

public class Task {

    private String title;
    private int time;
    private int startTime;
    private int endTime;
    private int repeatInterval;
    private boolean isActive;
    private boolean isReapeted;

    public Task(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public Task(String title, int start, int end, int interval) {
        this.title = title;
        this.startTime = start;
        this.endTime = end;
        this.repeatInterval = interval;
    }

    int nextTimeAfter(int current) {
        int fistPoint = 0;
        int secondPoint = this.startTime;
        if(this.isActive) {
            if (this.isReapeted) {
                while (true) {
                    if (fistPoint < current && current < secondPoint) return secondPoint;
                    fistPoint = fistPoint + this.repeatInterval;
                    secondPoint = secondPoint + this.repeatInterval;
                }
            } else if (secondPoint < current) return -1;
        }else System.out.println("Don't active!");
        return secondPoint;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getRepeatInterval() {
        if (isReapeted) {
            return repeatInterval;
        } else return 0;
    }

    public void setRepeatInterval(int repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean setActive(boolean active) {
        isActive = active;
        return active;
    }

    public boolean isReapeted() {
        return isReapeted;
    }

    public void setReapeted(boolean reapeted) {
        isReapeted = reapeted;
    }


}

