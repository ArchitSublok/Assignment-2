package UCampus;

public class FoodItem {
    int itemId;
    String itemName;
    double price;

    static String cafeteriaName = "UCampus Cafeteria";
    static double serviceCharge = 10.0;    
    static int totalFoodItems = 0;

    public void addFoodItem(int id, String name, double price){
        this.itemId=id;
        this.itemName=name;
        this.price=price;
        totalFoodItems++;
    }

    public double calculateFinalPrice(){
        
        return this.price + (this.price * serviceCharge/100);
    }

   public void displayItemDetails(){
    System.out.println("Item ID:" + this.itemId);
    System.out.println("Item Name" + this.itemName);
    System.out.println("Orginal Price" + this.price);
    System.out.println("Final Price" + this.calculateFinalPrice());
   } 

   public static void changeServiceCharge(double newCharge){
        serviceCharge=newCharge;
   }

   public static void displayCafeteriaDetails(){
        System.out.println("Cafeeria Name:" + cafeteriaName);
        System.out.println("Service Charge" + serviceCharge);
        System.out.println("Total Food Items" + totalFoodItems);
   }

   public static void main(String [] args){

    FoodItem item1=new FoodItem();
    FoodItem item2=new FoodItem();
    FoodItem item3=new FoodItem();


    item1.addFoodItem(101, "Veg Sandwich", 80); 
        item2.addFoodItem(102, "Cold Coffee", 120); 
        item3.addFoodItem(103, "Paneer Wrap", 150); 

        FoodItem.displayCafeteriaDetails(); 
        
        item1.displayItemDetails(); 
        item2.displayItemDetails(); 
        item3.displayItemDetails(); 

        FoodItem.changeServiceCharge(15); 
        System.out.println("After Updating Service Charge"); 
        
        item1.displayItemDetails(); 
        item2.displayItemDetails(); 
        item3.displayItemDetails(); 


   }
}
