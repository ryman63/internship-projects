import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    private static final double[] DISCOUNTS = {0, 0.05, 0.10, 0.20, 0.25};
    private static final int PRICE = 400;

    public static double calculateBasketCost(List<Integer> books) {
        Map<Integer, Integer> bookCountMap = new HashMap<>();
        for (int book : books) {
            bookCountMap.put(book, bookCountMap.getOrDefault(book, 0) + 1);
        }

        List<Integer> bookCounts = new ArrayList<>(bookCountMap.values());
        Collections.sort(bookCounts, Collections.reverseOrder());

        double totalCost = 0;
        while (!bookCounts.isEmpty()) {
            int differentBooks = bookCounts.size();
            double maxDiscount = 0;
            for (int i = 0; i < differentBooks; i++) {
                maxDiscount = Math.max(maxDiscount, DISCOUNTS[Math.min(i + 1, 5)]);
            }
            totalCost += (differentBooks * PRICE * (1 - maxDiscount));
            for (int i = 0; i < differentBooks; i++) {
                int count = bookCounts.get(i) - 1;
                if (count == 0) {
                    bookCounts.remove(i);
                    differentBooks--;
                    i--;
                } else {
                    bookCounts.set(i, count);
                }
            }
        }
        return totalCost;
    }
}