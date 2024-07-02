public class Context {
    private Strategy strategy;

    // Constructor for setting the strategy
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method for executing the strategy
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    // Setter for changing the strategy at runtime
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
