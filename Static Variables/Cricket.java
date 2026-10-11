class Cricket {
    static String country = "India";
    static String format = "ODI";
    static int totalPlayers = 11;
    static int overs = 50;
    static String tournament = "World Cup";

    public static void main(String[] args) {
        String playerName = "Virat";
        int jerseyNo = 18;
        double battingAverage = 58.2d;
        long matchNo = 5678901234l;
        String role = "Batsman";

        System.out.println(Cricket.country);
        System.out.println(Cricket.format);
        System.out.println(Cricket.totalPlayers);
        System.out.println(Cricket.overs);
        System.out.println(Cricket.tournament);
        System.out.println(playerName);
        System.out.println(jerseyNo);
        System.out.println(battingAverage);
        System.out.println(matchNo);
        System.out.println(role);
    }
}
