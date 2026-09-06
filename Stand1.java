class Stand1{
 public static void main(String[] args){

int id = 101;
String name = "Casual Slipper";
String brand = "Puma";
int price = 799;
double size = 8.5;
String color = "Black";
String type = "Men";
String material = "Rubber";
boolean isAvailable = true;
String manufacturer = "Puma India";
String country = "India";

Slipper.info(id, name, brand, price, size, color, type,
                     material, isAvailable, manufacturer, country);
					 //explicit
					 
Slipper.info(102, "Sports Slipper", "Nike", 999, 9.0,
              "Blue", "Unisex", "Foam", true,"Nike India", "Vietnam");
			  //implicit
    }
}