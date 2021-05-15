package homework_22;

public class Credit {
    private int id;
    private long sum;
    private int period;
    private double percentage;
    private static int counter;
    private static long totalSum;

    public Credit(int id, long sum, int period, double percentage) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.percentage = percentage;
        counter++;
        totalSum += sum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public double getSum() {
        return sum;
    }

    public int getPeriod() {
        return period;
    }

    public double getPercentage() {
        return percentage;
    }

    public static int getCounter() {
        return counter;
    }

    public static long getTotalSum() {
        return totalSum;
    }

    public static double getAverageSum() {
        return (double) totalSum / counter;
    }

    public static void displayInfo() {
        System.out.println("counter: " + getCounter());
        System.out.println("total sum: " + getTotalSum());
        System.out.println("average: " + getAverageSum());
    }
}
