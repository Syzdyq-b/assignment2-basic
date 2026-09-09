public class Main {

    public static void main(String[] args) {

        Computer customComputer = new ComputerBuilder()
                .setCpu("AMD Ryzen 7")
                .setRam(16)
                .setStorage(512)
                .setGpu("RTX 4060")
                .build();

        System.out.println("Custom computer:");
        System.out.println(customComputer);


        ComputerDirector director = new ComputerDirector();

        Computer gamingComputer = director.buildGamingcomputer();

        System.out.println("\nGaming computer:");
        System.out.println(gamingComputer);
    }
}