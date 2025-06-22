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
class linear{
    ArrayList<Product> ar=new ArrayList<>();
    void add(Product p){
        ar.add(p);
    }
    boolean search(int id){
        for(Product i : ar){
            if (i.productId==id) return true;
        }
        return false;        
    }
}
class binary{
    ArrayList<Product> ar=new ArrayList<>();
    void add(Product p){
        int lo=0,hi=ar.size()-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (ar.get(mid).productId<p.productId) lo=mid+1;
            else hi=mid-1;
        }
        ar.add(lo,p);
    }
    boolean search(int id){
        int lo=0,hi=ar.size()-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (ar.get(mid).productId==id) return true;
            else if (ar.get(mid).productId<id) lo=mid+1;
            else hi=mid-1;
        }
        return false;
    }
}
public class E_Commerce {
    public static void main(String[] args) {
        Product x=new Product(1, "hammer", 10, 20.00);
        Product y=new Product(2, "nails", 20, 1.50);
        Product z=new Product(3, "screws", 30, 2.00);
        linear l = new linear();
        binary b = new binary();
        l.add(x);
        l.add(y);
        l.add(z);
        b.add(x);
        b.add(y);
        b.add(z);
        if(l.search(2)) System.out.println("The product with id 2 is found using linear search");
        else System.out.println("The product with id 2 is not found using linear search");
        if(b.search(2)) System.out.println("The product with id 2 is found using binary search");
        else System.out.println("The product with id 2 is not found using binary search");

    }
}
