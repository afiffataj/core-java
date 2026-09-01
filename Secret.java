class Secret{
 public static void main(String[] args){

int id = 101;
String name = "Godrej Locker";
String type = "Digital";
int price = 25000;
double weight = 75.5;
String color = "Gray";
String material = "Steel";
boolean isAvailable = true;
String brand = "Godrej";
String location = "Bengaluru";
int capacity = 50;
String password = "LOCK123";

Locker.info(id, name, type, price, weight, color, material,
                    isAvailable, brand, location, capacity, password);

Locker.info(102, "Home Locker", "Electronic", 30000, 80.0,
              "Black", "Iron", true, "Yale","Mysuru", 60, "SAFE456");
    }
}