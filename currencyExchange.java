import java.math.BigDecimal;
import java.util.*;

public class currencyExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fxRates = scanner.nextLine();
        String selectedCurrency = scanner.next();
        String targetCurrency = scanner.next();

        BigDecimal maxAmount = calculateMaxAmount(fxRates, selectedCurrency, targetCurrency);
        System.out.println(maxAmount);
        scanner.close();
    }

    public static BigDecimal calculateMaxAmount(String fxRates, String selectedCurrency, String targetCurrency) {
        Map<String, Map<String, BigDecimal>> exchangeRates = new HashMap<>();

        String[] rates = fxRates.split(";");
        for (String rate : rates) {
            String[] currencies = rate.split(",");
            String fromCurrency = currencies[0];
            String toCurrency = currencies[1];
            BigDecimal rateValue = new BigDecimal(currencies[2]);

            exchangeRates.putIfAbsent(fromCurrency, new HashMap<>());
            exchangeRates.get(fromCurrency).put(toCurrency, rateValue);
        }

        BigDecimal maxAmount = bfs(selectedCurrency, targetCurrency, exchangeRates);
        return maxAmount.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.valueOf(-1.0) : maxAmount;
    }

    public static BigDecimal bfs(String startCurrency, String targetCurrency, Map<String, Map<String, BigDecimal>> exchangeRates) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(startCurrency, BigDecimal.ONE));

        Set<String> visited = new HashSet<>();

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            String currentCurrency = current.currency;
            BigDecimal amount = current.amount;

            if (currentCurrency.equals(targetCurrency)) {
                return amount;
            }

            visited.add(currentCurrency);

            Map<String, BigDecimal> rates = exchangeRates.get(currentCurrency);
            if (rates != null) {
                for (String nextCurrency : rates.keySet()) {
                    if (!visited.contains(nextCurrency)) {
                        BigDecimal rate = rates.get(nextCurrency);
                        BigDecimal nextAmount = amount.multiply(rate);
                        queue.offer(new Pair(nextCurrency, nextAmount));
                    }
                }
            }
        }
        return BigDecimal.ZERO;
    }

    static class Pair {
        String currency;
        BigDecimal amount;

        public Pair(String currency, BigDecimal amount) {
            this.currency = currency;
            this.amount = amount;
        }
    }
}
