
public class FinancialForecasting {
    static double predict(double cur,double rate,int years){
        if(years==0) return cur;
        else return(predict(cur*(1+rate),rate,years-1));
    }
    public static void main(String[] args) {
        System.out.println("Assuming a capital of 50,000 with a rate of increasing of 12%, and with the time period of 5 years :");
        System.out.println(predict(50000, 0.12, 5));
        
    }
}
