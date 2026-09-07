class Book {
    private String BookName;
    private String Author;
    private int price;
    private int copies;
    public Book(String BookName , String Author , int price , int copies){
        this.BookName=BookName;
        this.Author=Author;
        this.price=price;
        this.copies=copies;
    }
    public String GBookName(){
        return BookName;
    }
    public String GAuthor(){
        return Author;
    }

    public int Gprice(){
        return price;
    }
    public int Gcopies(){
        return copies;
    }
    public void SBookName(String x){
        this.BookName=x;
    }
    public void SAuthor(String x){
        this.Author=x;
    }
    public void Sprice(int x){
        this.price=x;
    }
    public void Scopies(int x){
        this.copies = x;
    }
    public void editCopy(int v){
        this.copies+= v ;
    }
}
