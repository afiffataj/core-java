class SteelRunner{
    public static void main(String[] args){

        Steel steel1=new Steel();
        Steel steel2=new Steel();

        System.out.println(steel1.quantity);
        System.out.println(steel1.type);
        System.out.println(steel1.price);
        System.out.println(steel1.length);
        System.out.println(steel1.brand);
        System.out.println(steel1.weight);
        System.out.println(steel1.size);
        System.out.println(steel1.quality);
        System.out.println(steel1.thickness);
        System.out.println(steel1.color);

        steel2.weight=500.9;
        steel2.size=10;
        steel2.quality="High";
        steel2.thickness=2.5;
        steel2.color="Silver";
        System.out.println(steel2.quantity);
        System.out.println(steel2.type);
        System.out.println(steel2.price);
        System.out.println(steel2.length);
        System.out.println(steel2.brand);
        System.out.println(steel2.weight);
        System.out.println(steel2.size);
        System.out.println(steel2.quality);
        System.out.println(steel2.thickness);
        System.out.println(steel2.color);
    }
}