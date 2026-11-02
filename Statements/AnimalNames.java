class AnimalNames {
    public static void main(String[] args) {

        System.out.println("Animal Names");

        int animal = 2;

        switch (animal) {
            case 1:
                System.out.println("Lion");
                break;

            case 2:
                System.out.println("Tiger");
                break;

            case 3:
                System.out.println("Elephant");
                break;

            case 4:
                System.out.println("Monkey");
                break;

            case 5:
                System.out.println("Rabbit");
                break;

            default:
                System.out.println("Animal is not available");
        }
    }
}