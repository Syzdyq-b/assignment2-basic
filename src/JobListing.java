public class JobListing {
    private String title;
    private double payment;
    private String description;

    public JobListing(String title, double payment, String description) {
        this.title = title;
        this.payment = payment;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public double getPayment() {
        return payment;
    }

    public String getDescription() {
        return description;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void printInfo() {
        System.out.println("Job title: " + title);
        System.out.println("Payment: " + payment);
        System.out.println("Description: " + description);
        System.out.println("--------------------------------");
    }
}
