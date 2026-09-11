public class ComputerDirector {

    public Computer buildGamingcomputer(){
        return new ComputerBuilder()
                .setCpu("intel i7")
                .setRam(32)
                .setStorage(1000)
                .setGpu("RTX 4070")
                .setOperatingSystem("Windows 11")
                .build();

    }
    public Computer buildofficcomputer(){
        return new ComputerBuilder()
                .setCpu("intel i5")
                .setRam(16)
                .setStorage(512)
                .setGpu("integrated graphics")
                .setOperatingSystem("Windows 11")
                .build();
    }
}
