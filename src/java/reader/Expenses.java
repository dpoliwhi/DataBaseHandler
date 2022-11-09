package reader;

public class Expenses {
    private String minExpenses;
    private String maxExpenses;

    public Expenses(String minExpenses, String maxExpenses) {
        this.minExpenses = minExpenses;
        this.maxExpenses = maxExpenses;
    }

    public String getMinExpenses() {
        return minExpenses;
    }

    public String getMaxExpenses() {
        return maxExpenses;
    }
}
