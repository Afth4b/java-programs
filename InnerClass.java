public class InnerClass {

    public class CPU {
        float price;
        Processor processor;
        RAM ram;

        CPU(float price) {
            this.price = price;

        
            this.processor = new Processor(8, "Intel");
            this.ram = new RAM(16, "Corsair");
        }

        public class Processor {
            int noOfCores;
            String manufacturer;

            Processor(int noOfCores, String manufacturer) {
                this.noOfCores = noOfCores;
                this.manufacturer = manufacturer;
            }
        }

        public class RAM {
            int memory;
            String manufacturer;

            RAM(int memory, String manufacturer) {
                this.memory = memory;
                this.manufacturer = manufacturer;
            }
        }

        
        void displayInfo() {
            System.out.println("CPU Price: " + price);
            System.out.println("Processor Cores: " + processor.noOfCores);
            System.out.println("Processor Manufacturer: " + processor.manufacturer);
            System.out.println("RAM Memory: " + ram.memory + " GB");
            System.out.println("RAM Manufacturer: " + ram.manufacturer);
        }
    }

    public static void main(String[] args) {

        
        InnerClass outer = new InnerClass();
        CPU cpu = outer.new CPU(50000);

        
        cpu.displayInfo();
    }
}