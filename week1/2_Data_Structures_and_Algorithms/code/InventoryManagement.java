import java.util.*;

class Product{
    int productId;
    String productName;
    int quantity;
    double price;
    
    Product(int x,String y,int a,double b){
        productId=x;
        productName=y;
        quantity=a;
        price=b;
    }
}
class Inventory {
    private Map<Integer,Product> x = new HashMap<>();
    void add(Product p){
        if(x.containsKey(p.productId)){
            System.out.println("The product "+p.productName+" already exists try updating");
        }
        else{
            x.put(p.productId, p);
            System.out.println("Product "+p.productName+" Successfully added!");
        }
    }
    void update(Product p){
        Product q=x.get(p.productId);
        if(q==null){
            System.out.println("The product "+p.productName+" does not exist try adding it");
        }
        else{
            q.productName=p.productName;
            q.quantity=p.quantity;
            q.price=p.price;
        }
    }
    void delete(int id){
        if(x.remove(id)!=null) System.out.println("Product  Removed");
        else System.out.println("The product  does not exist");
    }
    void display(){
        if(x.isEmpty()){
            System.out.println("Inventory Empty");
        }
        else{
            for(Product i : x.values())
                System.out.println(i.productId+" "+i.productName+" "+i.quantity+" "+i.quantity);
        }
    }
}
public class InventoryManagement {
    public static void main(String[] args) {
        Inventory i=new Inventory();
        Product a=new Product(1, "hammer", 10, 20.00);
        Product b=new Product(2, "nails", 20, 1.50);
        Product c=new Product(3, "screws", 30, 2.00);
        Product d=new Product(3, "screws", 40, 2.00);
        i.add(a);
        i.add(b);
        i.add(c);
        i.update(d);
        i.delete(2);
        i.display();
    }    
}