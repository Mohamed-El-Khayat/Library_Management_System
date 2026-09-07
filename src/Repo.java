import java.util.ArrayList;
import java.util.List;
public class Repo {
    private List<Book> books = new ArrayList<Book>();
    private JsonHandler jack ;

    public Repo(JsonHandler j){
        jack = j ;
        books =  jack.read() ;
        if(books == null) books = new ArrayList<>();
    }

    public void Add(String name, String Author, int price, int copies){
        Book b = new Book(name, Author,price, copies);
        if(search(name) == -1){
            books.add(b) ;
        }
        else
            incrementCopy(name, copies);
        jack.write(books);

    }

    public void decrementCopy(String s){
        int i = search(s) ;
        if(i == -1)
            return  ;
        books.get(i).editCopy(-1);
        jack.write(books) ;

    }

    public void incrementCopy(String s, int v){
        int i = search(s) ;
        if(i == -1)
            return ;
        books.get(i).editCopy(v);
        jack.write(books) ;

    }

    public int search(String s){
        for(int i = 0 ; i< books.size() ;i++){
            String x = books.get(i).GBookName() ;
            if(x.equals(s))
                return i ;
        }
        return -1 ;
    }

    public Boolean enough_copies(String s){
        int i = search(s) ;
        if(i == -1)
            return false ;
        int c = books.get(i).Gcopies();
        return c > 0 ;
    }
    public int getPrice(String s){
        int i = search(s) ;
        if(search(s)== -1)
            return -1 ;

        return books.get(i).Gprice() ;
    }
}