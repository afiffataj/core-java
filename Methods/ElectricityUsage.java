class ElectricityUsage {
    public static void main(String[] args) {

        System.out.println("Electricity usage for 1 appliance");
        int fan = 50;
        ElectricityUsage.usageFor1Appliance(fan);

        System.out.println("Electricity usage for 2 appliances");
        int light = 20;
        int tv = 100;
        ElectricityUsage.usageFor2Appliances(light, tv);

        System.out.println("Electricity usage for 3 appliances");
        int laptop = 60;
        int fridge = 150;
        int washingMachine = 500;
        ElectricityUsage.usageFor3Appliances(
            laptop, fridge, washingMachine
        );

        System.out.println("Electricity usage for 4 appliances");
        int ac = 1500;
        int heater = 2000;
        int ironBox = 1000;
        int microwave = 1200;
        ElectricityUsage.usageFor4Appliances(
            ac, heater, ironBox, microwave
        );

        System.out.println("Electricity usage for 5 appliances");
        int oven = 1800;
        int geyser = 2000;
        int mixer = 500;
        int computer = 200;
        int waterPump = 750;
        ElectricityUsage.usageFor5Appliances(
            oven, geyser, mixer, computer, waterPump
        );
    }

    static void usageFor1Appliance(int a) {
        System.out.println("Fan power = " + a + " watts");
    }

    static void usageFor2Appliances(int b, int c) {
        System.out.println("Light power = " + b + " watts");
        System.out.println("TV power = " + c + " watts");
    }

    static void usageFor3Appliances(int d, int e, int f) {
        System.out.println("Laptop power = " + d + " watts");
        System.out.println("Fridge power = " + e + " watts");
        System.out.println("Washing machine power = " + f + " watts");
    }

    static void usageFor4Appliances(int g, int h, int i, int j) {
        System.out.println("AC power = " + g + " watts");
        System.out.println("Heater power = " + h + " watts");
        System.out.println("Iron box power = " + i + " watts");
        System.out.println("Microwave power = " + j + " watts");
    }

    static void usageFor5Appliances(
        int k, int l, int m, int n, int o) {

        System.out.println("Oven power = " + k + " watts");
        System.out.println("Geyser power = " + l + " watts");
        System.out.println("Mixer power = " + m + " watts");
        System.out.println("Computer power = " + n + " watts");
        System.out.println("Water pump power = " + o + " watts");
    }
}