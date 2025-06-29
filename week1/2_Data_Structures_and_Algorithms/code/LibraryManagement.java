import java.util.ArrayList;

class Book{
    int bookId;
    String title,author;
    Book(int id,String t,String a){
        bookId=id;
        title=t;
        author=a;
    }
}
public class LibraryManagement {
    static ArrayList<Book> ar1=new ArrayList<>();
    static ArrayList<Book> ar2=new ArrayList<>();
    static void ladd(Book b){
        ar1.add(b);
    }
    static void badd(Book b){
        int lo=0,hi=ar2.size()-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if ((ar2.get(mid).author).compareTo(b.author)<0) lo=mid+1;
            else hi=mid-1;
        }
        ar2.add(lo,b);
    }
    static Book lsearch(String aut){
        for(Book i:ar1){
            if(i.author.equals(aut)){
                return i;
            }
        }
        return null;
    }
    static Book bsearch(String aut){
        int lo=0,hi=ar2.size()-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if (ar2.get(mid).author.equals(aut)) return ar2.get(mid);
            else if (ar2.get(mid).author.compareTo(aut)<0) lo=mid+1;
            else hi=mid-1;
        }
        return null;
    }
    public static void main(String[] args) {
        ladd(new Book(1, "HP goblet of fire", "JK Rowling"));
        ladd(new Book(2, "Eragon", "C paoline"));
        ladd(new Book(3, "Digital Fortress", "Dan brown"));
        ladd(new Book(5, "Sword of Summer", "R Riordan"));
        badd(new Book(1, "HP goblet of fire", "JK Rowling"));
        badd(new Book(2, "Eragon", "C paoline"));
        badd(new Book(3, "Digital Fortress", "Dan brown"));
        badd(new Book(5, "Sword of Summer", "R Riordan"));
        System.out.println("Searching for book with author JK Rowling using linear search");
        Book k=lsearch("JK Rowling");
        if(k!=null){
            System.out.println("Book found ");
            System.out.println("ID : "+k.bookId+" name : "+k.title+" author : "+k.author);
        }
        else System.out.println("Task not found");
        System.out.println("\nSearching for book with author R Riordan using binary search");
        Book l=bsearch("R Riordan");
        if(l!=null){
            System.out.println("Book found ");
            System.out.println("ID : "+l.bookId+" name : "+l.title+" author : "+l.author);
        }
        else System.out.println("Task not found");
    }
}
