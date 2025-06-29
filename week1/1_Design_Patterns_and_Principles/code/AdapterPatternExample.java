interface PaymentProcessor {
    void processPayment(double amt);    
}
class BillDeskGateway{
    void BillDeskTransfer(double amt){
        System.out.println("Transfered "+amt+" using BillDesk");
    }
}
class RazorPayGateway{
    void RazorPayTransfer(double amt){
        System.out.println("Transfered "+amt+" using RazorPay");
    }
}
class BillDeskAdapter implements PaymentProcessor{
    BillDeskGateway bdg;
    BillDeskAdapter(BillDeskGateway x){
        bdg=x;
    }
    public void processPayment(double amt){
        bdg.BillDeskTransfer(amt);
    }
}
class RazorPayAdapter implements PaymentProcessor{
    RazorPayGateway rpg;
    RazorPayAdapter(RazorPayGateway x){
        rpg=x;
    }
    public void processPayment(double amt){
        rpg.RazorPayTransfer(amt);
    }
}
public class AdapterPatternExample {
    public static void main(String[] args) {
        PaymentProcessor a=new BillDeskAdapter(new BillDeskGateway());
        a.processPayment(50000);
        PaymentProcessor b=new RazorPayAdapter(new RazorPayGateway());
        b.processPayment(75000); 
    }
}
