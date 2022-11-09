package reader;

public class ProductName {
    private String productName;
    private int minTimes;

    public ProductName(String productName, int minTimes) {
        this.productName = productName;
        this.minTimes = minTimes;
    }

    public String getProductName() {
        return productName;
    }

    public int getMinTimes() {
        return minTimes;
    }
}
