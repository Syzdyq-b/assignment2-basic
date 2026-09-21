public class IntelFactory implements ComponentFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Gpu createGpu() {
        return new IntelGpu();
    }
}
