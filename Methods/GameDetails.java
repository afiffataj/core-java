class GameDetails {
    public static void main(String[] args) {

        System.out.println("The game details");

        String name = "Football";
        int players = 22;
        float duration = 90.5f;
        char level = 'B';

        GameDetails.display(name, players, duration, level);
    }

    static String display(String a, int b, float c, char d) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        return a;
    }
}