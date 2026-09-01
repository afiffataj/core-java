class King{
    public static void main(String[] args){

int id = 101;
String name = "Simba";
String type = "African Lion";
int age = 8;
double weight = 190.5;
String color = "Golden";
String gender = "Male";
String forest = "Gir Forest";
boolean isWild = true;

Lion.info(id, name, type, age, weight, color, gender, forest, isWild);
//explicit
Lion.info(102, "Leo", "Asiatic Lion", 6, 175.0,
             "Brown", "Male", "Gir National Park", true);//implicit
}
}