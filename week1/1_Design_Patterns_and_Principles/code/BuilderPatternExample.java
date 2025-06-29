class Computer{
    String CPU;
    int RAM;
    int Storage;
    String GPU;
    String Screen;

    private Computer (Builder b){
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.Storage = b.Storage;
        this.GPU = b.GPU;
        this.Screen = b.Screen;
    }

    void specs(){
        System.out.println("CPU : "+CPU);
        System.out.println("RAM : "+RAM+" GB");
        System.out.println("Storage : "+Storage+" GB");
        System.out.println("GPU : "+GPU);
        System.out.println("Screen : "+Screen);
    }

    static class Builder {
        private String CPU;
        private int RAM;
        private int Storage;
        private String GPU;
        private String Screen;
        
        Builder setCPU(String x){
            this.CPU = x;
            return this;
        }
        Builder setRAM(int x){
            this.RAM = x;
            return this;
        }
        Builder setStorage(int x){
            this.Storage = x;
            return this;
        }
        Builder setGPU(String x){
            this.GPU = x;
            return this;
        }
        Builder setScreen(String x){
            this.Screen = x;
            return this;
        }        
        public Computer build(){
            return new Computer(this);
        }        
    }
}
public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer x = new Computer.Builder()
        .setCPU("12600k")
        .setRAM(16)
        .setStorage(512)
        .setGPU("RTX 3060")
        .setScreen("1080p")
        .build();
        x.specs();
    }    
}
