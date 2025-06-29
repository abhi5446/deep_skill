import java.util.ArrayList;

class Order{
    int orderId;
    String customerName;
    double totalPrice;
    Order(int x,String y,double z){
        orderId=x;
        customerName=y;
        totalPrice=z;
    }
}

public class SortingCustomerOrders {
    static void bubble(ArrayList<Order> ar){
        int n=ar.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ar.get(j).orderId>ar.get(j+1).orderId){
                    Order t=ar.get(j);
                    ar.set(j, ar.get(j+1));
                    ar.set(j+1,t);
                }
            }
        }
    }
    static void quick(ArrayList<Order> ar,int lo,int hi){
        if(lo<hi){
            int p=lo;
            int i=lo,j=hi;
            while(i<=j){
                while( i<=hi && ar.get(i).orderId<=ar.get(p).orderId) i++;
                while(ar.get(j).orderId>ar.get(p).orderId) j--;
                if(i<j){
                    Order t=ar.get(j);
                    ar.set(j, ar.get(i));
                    ar.set(i,t);
                }
            }
            Order t=ar.get(j);
            ar.set(j, ar.get(p));
            ar.set(p,t);
            quick(ar,lo,j-1);
            quick(ar,j+1,hi);
        }
    }
    static void display(ArrayList<Order> x){
        for(Order i:x){
            System.out.println("Id : "+i.orderId+" name : "+i.customerName+" price : "+i.totalPrice);
        }
    }
    public static void main(String[] args) {
        ArrayList<Order> x=new ArrayList<>();
        x.add(new Order(5, "abc", 1500.50));
        x.add(new Order(3, "def", 2500.25));
        x.add(new Order(2, "ghi", 2000.75));
        x.add(new Order(1, "jkl", 1000.00));
        x.add(new Order(4, "mno", 500.50));
        ArrayList<Order> y=new ArrayList<>();
        for(Order i : x){
            y.add(new Order(i.orderId, i.customerName, i.totalPrice));
        }
        System.out.println("Sorting using bubble sort ..");
        bubble(x);
        display(x);
        System.out.println("\nSorting using Quick sort ..");
        quick(y, 0, 4);
        display(y);

    }
    
}
