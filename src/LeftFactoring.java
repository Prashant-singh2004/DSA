import java.util.*;

public class LeftFactoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Non-terminal: ");
        char nt = sc.nextLine().charAt(0);

        System.out.print("No. of rules: ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Rules:");
        List<String> rules = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rules.add(sc.nextLine());
        }

        removeLF(nt, rules);
        sc.close();
    }

    public static void removeLF(char nt, List<String> rules) {
        String prefix = rules.get(0);

        // Find common prefix
        for (String rule : rules) {
            while (!rule.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        // No common prefix
        if (prefix.isEmpty()) {
            System.out.print(nt + " -> " + String.join(" | ", rules));
            System.out.println();
            return;
        }

        // Create factored production
        System.out.println(nt + " -> " + prefix + nt + "'");

        // Create remainders
        List<String> remainders = new ArrayList<>();
        for (String rule : rules) {
            String r = rule.substring(prefix.length());
            remainders.add(r.isEmpty() ? "ε" : r);
        }

        System.out.println(nt + "' -> " + String.join(" | ", remainders));
    }
}