public class Main {
    public static void main(String[] args) {
        // Define strategies with lambda expressions
        Strategy add = (a, b) -> a + b;
        Strategy subtract = (a, b) -> a - b;
        Strategy multiply = (a, b) -> a * b;

        // Use context to execute different strategies
        Context context = new Context(add);
        System.out.println("Addition: " + context.executeStrategy(5, 3));

        context.setStrategy(subtract);
        System.out.println("Subtraktion: " + context.executeStrategy(5, 3));

        context.setStrategy(multiply);
        System.out.println("Multiplikation: " + context.executeStrategy(5, 3));
    }
}

// Advantages of using lambda expressions for the Strategy Pattern:
// - Readability: Strategies are defined close to where they are used, making code easier to understand.
// - Flexibility: Adding new strategies is straightforward and does not require new classes.

// Disadvantages:
// - Limited Reusability: Complex strategies may require separate classes.
// - Debugging Complexity: Lambda expressions can make debugging more challenging.
// - Readability Challenges: In complex scenarios, lambda expressions might reduce readability if they become too lengthy or nested.