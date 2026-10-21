class CharacterDemo {
    public static void main(String[] args) {

        System.out.println("Are the characters available");

        char character = 'X';
        char character1 = 'Y';

        CharacterDemo.areTheCharactersAvailable(character, character1);
    }

    static void areTheCharactersAvailable(char a, char b) {
        System.out.println(a);
        System.out.println(b);
    }
}