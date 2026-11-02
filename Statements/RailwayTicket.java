class RailwayTicket {
    public static void main(String[] args) {

        System.out.println("Railway Ticket Categories");

        int ticket = 2;

        switch (ticket) {
            case 1:
                System.out.println("General Ticket");
                break;

            case 2:
                System.out.println("Sleeper Class");
                break;

            case 3:
                System.out.println("AC 3-Tier");
                break;

            case 4:
                System.out.println("AC 2-Tier");
                break;

            default:
                System.out.println("Invalid Ticket");
        }
    }
}