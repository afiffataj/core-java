class LaptopShop {
    public static void main(String[] args) {

        System.out.println("Is Laptop Shop Open");
        LaptopShop.isLaptopShopOpen();

        System.out.println("Is Owner Available");
        LaptopShop.isOwnerAvailable();

        System.out.println("Laptop Grade");
        char grade = LaptopShop.getLaptopGrade();
        System.out.println(grade);

        System.out.println("Are All Laptops Available");
        boolean available = LaptopShop.areAllLaptopsAvailable();
        System.out.println(available);

        System.out.println("Laptop Brand");
        LaptopShop.getLaptopBrand("Dell");

        System.out.println("Laptop Prices");
        LaptopShop.getLaptopPrice(45000, 65000);

        System.out.println("Laptop Colors");
        LaptopShop.getLaptopColors("Silver", "Black", "Grey");

        System.out.println("Laptop Screen Size");
        float size = LaptopShop.getLaptopScreenSize(15.6f);
        System.out.println(size);

        System.out.println("Laptop Weight");
        double weight = LaptopShop.getLaptopWeight(1.5, 2.0);
        System.out.println(weight);

        System.out.println("Laptop RAM");
        int ram = LaptopShop.getLaptopRAM(8, 16, 32);
        System.out.println(ram);
    }

    static void isLaptopShopOpen() {
        System.out.println("Yes, Laptop Shop is Open");
    }

    static void isOwnerAvailable() {
        System.out.println("Yes, Owner is Available");
    }

    static char getLaptopGrade() {
        return 'A';
    }

    static boolean areAllLaptopsAvailable() {
        return false;
    }

    static void getLaptopBrand(String brand) {
        System.out.println(brand);
    }

    static void getLaptopPrice(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void getLaptopColors(String a, String b, String c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    static float getLaptopScreenSize(float size) {
        return size;
    }

    static double getLaptopWeight(double a, double b) {
        System.out.println(a);
        return b;
    }

    static int getLaptopRAM(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        return c;
    }
}