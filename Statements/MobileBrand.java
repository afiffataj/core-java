class MobileBrand {
    public static void main(String[] args) {

        System.out.println("Mobile Brand Selection");

        int brand = 3;

        switch (brand) {
            case 1:
                System.out.println("Samsung");
                break;

            case 2:
                System.out.println("Apple");
                break;

            case 3:
                System.out.println("Vivo");
                break;

            case 4:
                System.out.println("Oppo");
                break;

            case 5:
                System.out.println("OnePlus");
                break;

            default:
                System.out.println("Brand is not available");
        }
    }
}