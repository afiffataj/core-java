class PalaceRunner{
    public static void main(String[] args){

        Palace palace1=new Palace();
        Palace palace2=new Palace();

        System.out.println(palace1.rooms);
        System.out.println(palace1.name);
        System.out.println(palace1.price);
        System.out.println(palace1.floors);
        System.out.println(palace1.location);
        System.out.println(palace1.area);
        System.out.println(palace1.doors);
        System.out.println(palace1.type);
        System.out.println(palace1.height);
        System.out.println(palace1.color);

        palace2.area=5000.9;
        palace2.doors=20;
        palace2.type="Royal";
        palace2.height=100.5;
        palace2.color="White";
        System.out.println(palace2.rooms);
        System.out.println(palace2.name);
        System.out.println(palace2.price);
        System.out.println(palace2.floors);
        System.out.println(palace2.location);
        System.out.println(palace2.area);
        System.out.println(palace2.doors);
        System.out.println(palace2.type);
        System.out.println(palace2.height);
        System.out.println(palace2.color);
    }
}