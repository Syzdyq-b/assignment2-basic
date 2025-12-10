public class Main {
    public static void main(String[] args) {

        JobListing job1 = new JobListing("Java Developer", 300000, "Backend development");
        JobListing job2 = new JobListing("Web Designer", 200000, "Figma + UI/UX");

        Freelancer f1 = new Freelancer("Beknur", "Java", 4.9);
        Freelancer f2 = new Freelancer("Aknur", "UI/UX", 4.7);

        Portal portal = new Portal("Freelance.kz");

        portal.addJob(job1);
        portal.addJob(job2);

        portal.addFreelancer(f1);
        portal.addFreelancer(f2);

        portal.printPortalInfo();

        job1.printInfo();
        job2.printInfo();

        f1.printInfo();
        f2.printInfo();

        System.out.println("Comparison:");
        System.out.println("Is Java Developer job payment higher? " + (job1.getPayment() > job2.getPayment()));
        System.out.println("Does Beknur have a higher rating? " + (f1.getRating() > f2.getRating()));
    }
}
