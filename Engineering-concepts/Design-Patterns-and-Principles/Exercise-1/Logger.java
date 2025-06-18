public class Logger {
    private static Logger instance;
    private Logger() {
        System.out.println("Only one logger is created");
    }
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logFirstOutput(String first) {
        System.out.println(first);
    }
    public void logSecondOutput(String second) {
        System.out.println(second);
    }
}

