class BrickRunner{
    public static void main(String[] args){

        Brick brick1=new Brick();
        Brick brick2=new Brick();

        System.out.println(brick1.length);
        System.out.println(brick1.material);
        System.out.println(brick1.price);
        System.out.println(brick1.width);
        System.out.println(brick1.brand);
        System.out.println(brick1.weight);
        System.out.println(brick1.quantity);
        System.out.println(brick1.type);
        System.out.println(brick1.height);
        System.out.println(brick1.color);

        brick2.weight=500.9;
        brick2.quantity=4;
        brick2.type="Building";
        brick2.height=7.5;
        brick2.color="Red";
        System.out.println(brick2.length);
        System.out.println(brick2.material);
        System.out.println(brick2.price);
        System.out.println(brick2.width);
        System.out.println(brick2.brand);
        System.out.println(brick2.weight);
        System.out.println(brick2.quantity);
        System.out.println(brick2.type);
        System.out.println(brick2.height);
        System.out.println(brick2.color);
    }
}