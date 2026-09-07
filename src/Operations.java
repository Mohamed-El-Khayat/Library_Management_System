public class Operations {
    JsonHandler js;
    Repo rep ;
    Budget budget ;
    public Operations(JsonHandler j, Repo r,Budget b ){
        js = j ;
        rep = r ;
        budget = b ;
    }

    public void buy(String bookName){
        int price = rep.getPrice(bookName) ;
        if(price == -1 || !rep.enough_copies(bookName)){
            System.out.println("Sorry, this book doesn't exist for now.") ;
            return  ;
        }
        System.out.println("It costs:" + price) ;
        System.out.println("Here is your book,"+ bookName + "have a nice reading.") ;
        budget.moneyIn(price) ;
        rep.decrementCopy(bookName);
    }
}
