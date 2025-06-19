class Logger {
    private static Logger obj=null;
    private Logger(){}
    public synchronized static Logger get(){
        if(obj==null) obj=new Logger();
        return obj;
    }
    public void ad(){
        System.out.println("Address of the object is :"+obj);
    }
    public static void main(String[] args) {
        Logger x=Logger.get();
        Logger y=Logger.get();
        x.ad();
        y.ad();
    }
}
