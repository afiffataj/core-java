class HotelRunner
{
    public static void main(String... args)
    {
        Hotel.order("Biryani",2,300,true);

        Hotel.order("Pizza",1,450,true);

        Hotel.order(null,0,-50,false);
    }
}