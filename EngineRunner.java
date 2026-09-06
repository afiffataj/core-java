class EngineRunner{
    public static void main(String[] args){

        Engine engine1=new Engine();
        Engine engine2=new Engine();

        System.out.println(engine1.cylinders);
        System.out.println(engine1.fuel);
        System.out.println(engine1.price);
        System.out.println(engine1.capacity);
        System.out.println(engine1.brand);
        System.out.println(engine1.power);
        System.out.println(engine1.mileage);
        System.out.println(engine1.type);
        System.out.println(engine1.weight);
        System.out.println(engine1.color);

        engine2.power=120.5;
        engine2.mileage=20;
        engine2.type="Diesel";
        engine2.weight=500.9;
        engine2.color="Black";
        System.out.println(engine2.cylinders);
        System.out.println(engine2.fuel);
        System.out.println(engine2.price);
        System.out.println(engine2.capacity);
        System.out.println(engine2.brand);
        System.out.println(engine2.power);
        System.out.println(engine2.mileage);
        System.out.println(engine2.type);
        System.out.println(engine2.weight);
        System.out.println(engine2.color);
    }
}