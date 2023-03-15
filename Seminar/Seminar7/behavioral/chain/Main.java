package behavioral.chain;

public class Main {
    public static void main(String[] args) {
        LoggerNotifier loggerNotifier = new LoggerNotifier(Priority.ROUTINE);
        EmailNotifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        SmsNotifier smsNotifier = new SmsNotifier(Priority.ASAP);

        loggerNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        loggerNotifier.notifierManagaer("Ok!", Priority.ROUTINE);
        loggerNotifier.notifierManagaer("Oops!", Priority.IMPORTANT);
        loggerNotifier.notifierManagaer("Warning", Priority.ASAP);
        }
}
