package Task1;

public class Main {
    public static void main(String[] args) {
        Task meatTask = new Task("Meeting in cafe",1800);
        meatTask.setActive(true);
        meatTask.setReapeted(false);
        meatTask.setStartTime(1800);
        System.out.println("Title: " + meatTask.getTitle());
        System.out.println("Time: " + meatTask.getTime());
        System.out.println(meatTask.nextTimeAfter(606));
        System.out.println(meatTask.nextTimeAfter(2000));
        System.out.println();

        Task runTask = new Task("Morning running", 800,2400,2400);
        runTask.setActive(false);
        runTask.setReapeted(true);
        System.out.println("Title: "+runTask.getTitle());
        System.out.println("Start time: "+runTask.getStartTime());
        System.out.println("End time: "+runTask.getEndTime());
        System.out.println("Interval: "+runTask.getRepeatInterval());
        System.out.println(runTask.nextTimeAfter(600));
        System.out.println(runTask.nextTimeAfter(3000));
        System.out.println();

        Task runTask2 = new Task("Morning running", 20,50,5);
        runTask2.setActive(true);
        runTask2.setReapeted(true);
        System.out.println("Title: "+runTask2.getTitle());
        System.out.println("Start time: "+runTask2.getStartTime());
        System.out.println("End time: "+runTask2.getEndTime());
        System.out.println("Interval: "+runTask2.getRepeatInterval());
        System.out.println(runTask2.nextTimeAfter(33));
        System.out.println();
    }
}