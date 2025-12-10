public class Freelancer {
    private String name;
    private String skill;
    private double rating;

    public Freelancer(String name, String skill, double rating) {
        this.name = name;
        this.skill = skill;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void printInfo() {
        System.out.println("Freelancer name: " + name);
        System.out.println("Skill: " + skill);
        System.out.println("Rating: " + rating);
        System.out.println("--------------------------------");
    }
}
