class ByteValues {
    public static void main(String[] args) {

        System.out.println("The byte values");

        byte a = 10;
        byte b = 20;

        ByteValues.display(a, b);
    }

    static byte display(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
        return a;
    }
}