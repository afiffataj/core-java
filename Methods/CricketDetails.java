class CricketDetails {
    public static void main(String[] args) {

        System.out.println("The cricket details");

        String player = "Virat";
        int runs = 85;
        float average = 52.5f;
        char grade = 'A';

        CricketDetails.display(player, runs, average, grade);
    }

    static String display(String a, int b, float c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}