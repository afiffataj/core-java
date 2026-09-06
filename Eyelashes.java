class Eyelashes{
public static void main(String[] args){

int id = 101;
String name = "Volume Mascara";
String brand = "Maybelline";
int price = 499;
double weight = 12.5;
String color = "Black";
String type = "Liquid";
boolean waterproof = true;
String expiryDate = "12-12-2027";
String manufacturer = "Maybelline India";

Mascara.info(id, name, brand, price, weight, color, type,
                     waterproof, expiryDate, manufacturer);//explicit
					 
Mascara.info(102, "Lash Paradise", "L'Oreal", 650, 13.0,
                "Black", "Gel", false,"10-10-2028", "L'Oreal Paris");
	//implicit			
    }
}