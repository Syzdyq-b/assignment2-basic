public class  Main {

    public static void main(String[] args) {

        Computer customComputer = new ComputerBuilder()
                .setCpu("AMD Ryzen 7")
                .setRam(16)
                .setStorage(512)
                .setGpu("RTX 4060")
                .setOperatingSystem("Windows 11")
                .build();
        System.out.println("Custom computer:");
        System.out.println(customComputer);

        System.out.println("\nAbstract Factory:");
        ComputerAssembler intelAssembler = new ComputerAssembler(new IntelFactory());
        ComputerAssembler amdAssembler = new ComputerAssembler(new AmdFactory());
        System.out.println("Intel set: " + intelAssembler.assemble());
        System.out.println("AMD set:   " + amdAssembler.assemble());

        System.out.println("\nValidation:");
        try {
            new ComputerAssembler(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
