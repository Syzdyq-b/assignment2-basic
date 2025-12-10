import java.util.ArrayList;

public class Portal {
    private String portalName;
    private ArrayList<JobListing> jobs;
    private ArrayList<Freelancer> freelancers;

    public Portal(String portalName) {
        this.portalName = portalName;
        this.jobs = new ArrayList<>();
        this.freelancers = new ArrayList<>();
    }

    public void addJob(JobListing job) {
        jobs.add(job);
    }

    public void addFreelancer(Freelancer fl) {
        freelancers.add(fl);
    }

    public void printPortalInfo() {
        System.out.println("Portal name: " + portalName);
        System.out.println("Jobs available: " + jobs.size());
        System.out.println("Freelancers registered: " + freelancers.size());
        System.out.println("--------------------------------");
    }
}
