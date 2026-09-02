class CementRunner{
    public static void main(String[] args){

        Cement cement1=new Cement();
        Cement cement2=new Cement();

        System.out.println(cement1.quantity);
        System.out.println(cement1.brand);
        System.out.println(cement1.price);
        System.out.println(cement1.bags);
        System.out.println(cement1.type);
        System.out.println(cement1.weight);
        System.out.println(cement1.stock);
        System.out.println(cement1.quality);
        System.out.println(cement1.strength);
        System.out.println(cement1.color);

        cement2.weight=50.5;
        cement2.stock=100;
        cement2.quality="High";
        cement2.strength=53.5;
        cement2.color="Grey";
        System.out.println(cement2.quantity);
        System.out.println(cement2.brand);
        System.out.println(cement2.price);
        System.out.println(cement2.bags);
        System.out.println(cement2.type);
        System.out.println(cement2.weight);
        System.out.println(cement2.stock);
        System.out.println(cement2.quality);
        System.out.println(cement2.strength);
        System.out.println(cement2.color);
    }
}