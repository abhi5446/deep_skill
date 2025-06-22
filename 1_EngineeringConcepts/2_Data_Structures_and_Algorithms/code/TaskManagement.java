class Task{
    int taskId;
    String taskName,status;
    Task nxt;
    Task(int id,String name,String st){
        taskId=id;
        taskName=name;
        status=st;
        nxt=null;
    }
}
public class TaskManagement {
    static Task f=null,l=null;

    static void add(Task t){
        if(f==null && l==null){
            f=t;
            l=t;
        }
        else{
            l.nxt=t;
            l=t;
        }
    }
    static Task search(int id){
        Task x=f;
        while(x!=null){
            if(x.taskId==id) return x;
            x=x.nxt;
        }
        return null;
    }
    static void traverse(){
        Task x=f;
        while(x!=null){
            System.out.println("ID : "+x.taskId+" name : "+x.taskName+" status : "+x.status);
            x=x.nxt;
        }
    }
    static void delete(int id){
        if(f==null) return;
        Task x=f; 
        if(x.taskId==id){
            if(x==l){
                f=null;
                l=null;
            }
            else{
                f=f.nxt;
            }
        }
        Task y=x.nxt;
        while(y!=null){
            if(y.taskId==id){
                x.nxt=y.nxt;
                if(y==l){
                    l=x;
                }
                System.out.println("Task "+y.taskName+"is deleted");
            }
            y=y.nxt;
        }
    }
    public static void main(String[] args) {
        add(new Task(1, "sysmgr", "running"));
        add(new Task(5, "awcc", "suspended"));
        add(new Task(2, "chrome", "running"));
        add(new Task(9, "teams", "stopped"));
        Task a=search(9);
        System.out.println("Searching task with id 9");
        if(a!=null){
            System.out.println("Task found ");
            System.out.println("ID : "+a.taskId+" name : "+a.taskName+" status : "+a.status);
        }
        else System.out.println("Task not found");
        System.out.println();
        delete(5);
        System.out.println("\nTraversing the linked list");
        traverse();
    }    
}
