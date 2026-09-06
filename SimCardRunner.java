class SimCardRunner{
    public static void main(String[] args){

        SimCard simCard1=new SimCard();
        SimCard simCard2=new SimCard();

        System.out.println(simCard1.number);
        System.out.println(simCard1.network);
        System.out.println(simCard1.price);
        System.out.println(simCard1.validity);
        System.out.println(simCard1.operator);
        System.out.println(simCard1.data);
        System.out.println(simCard1.balance);
        System.out.println(simCard1.type);
        System.out.println(simCard1.recharge);
        System.out.println(simCard1.color);

        simCard2.data=2.5;
        simCard2.balance=100;
        simCard2.type="Prepaid";
        simCard2.recharge=500.9;
        simCard2.color="White";
        System.out.println(simCard2.number);
        System.out.println(simCard2.network);
        System.out.println(simCard2.price);
        System.out.println(simCard2.validity);
        System.out.println(simCard2.operator);
        System.out.println(simCard2.data);
        System.out.println(simCard2.balance);
        System.out.println(simCard2.type);
        System.out.println(simCard2.recharge);
        System.out.println(simCard2.color);
    }
}