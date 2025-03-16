import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRecursionRemoval {
    public static void removeLR(char nonTerminal, List<String> rules) {
        List<String> alpha = new ArrayList<>(); // Rules starting with non-terminal
        List<String> beta = new ArrayList<>();  // Rules not starting with non-terminal

        // Separate rules into alpha and beta
        for (String rule : rules) {
            if (rule.length() > 0 && rule.charAt(0) == nonTerminal) {
                alpha.add(rule.substring(1));
            } else {
                beta.add(rule);
            }
        }

        // If no left recursion found
        if (alpha.isEmpty()) {
            System.out.println(nonTerminal + " -> " + String.join(" | ", rules));
            return;
        }

        // Print the new non-left-recursive grammar
        System.out.print(nonTerminal + " -> ");
        for (int i = 0; i < beta.size(); i++) {
            System.out.print(beta.get(i) + nonTerminal + "'");
            if (i < beta.size() - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        System.out.print(nonTerminal + "' -> ");
        for (int i = 0; i < alpha.size(); i++) {
            System.out.print(alpha.get(i) + nonTerminal + "'");
            if (i < alpha.size() - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" | ε");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get non-terminal from user
        System.out.print("Enter the non-terminal symbol: ");
        char nonTerminal = scanner.nextLine().charAt(0);

        // Get number of production rules
        System.out.print("Enter number of production rules: ");
        int numRules = Integer.parseInt(scanner.nextLine());

        List<String> rules = new ArrayList<>();

        // Get each production rule
        System.out.println("Enter each production rule (right side only):");
        for (int i = 0; i < numRules; i++) {
            System.out.print(nonTerminal + " -> ");
            rules.add(scanner.nextLine());
        }

        // Process the rules
        removeLR(nonTerminal, rules);

        scanner.close();
    }
}