public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.logFirstOutput("This is a first logger");
        logger2.logSecondOutput("This is a second logger");
        if (logger1 == logger2) {
            System.out.println("Yes! first and second are the same instance.");
        } else {
            System.out.println("Oops! first and second are different.");
        }
    }
}

