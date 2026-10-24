class Characters {
    public static void main(String[] args) {

        System.out.println("The characters");

        char a = 'A';
        char b = 'B';

        Characters.display(a, b);
    }

    static char display(char a, char b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}