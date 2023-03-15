package behavioral.chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    void notifierManagaer(String message, int priority) {
        if (this.priority <= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifierManagaer(message, priority);
        }
    }
    
    public abstract void write(String message);

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }


}
