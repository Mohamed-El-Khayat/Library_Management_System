import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        JsonHandler jsonF = new JsonHandler("books.json") ;
        Repo repo = new Repo(jsonF) ;
        Budget budget = new Budget() ;
        Operations op = new Operations(jsonF, repo, budget);

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Welcome to the Library.");
        while (true) {
            System.out.println("===============================");
            System.out.println("enter the number of operation you need to do.");
            System.out.println("1- buy.");
            System.out.println("2- Add Book.");
            System.out.println("3- exit.");
            System.out.println("===============================");
            int q = sc.nextInt() ;
            sc.nextLine();
            System.out.println("===============================");
            if(q == 1){
                System.out.println("What is the book name you are searching for?");
                String book = sc.nextLine() ;
                op.buy(book);
            }
            else if(q == 2){
                System.out.println("enter book name.");
                String book = sc.nextLine() ;

                System.out.println("enter author name.");
                String author = sc.nextLine() ;

                System.out.println("enter price.");
                int price = sc.nextInt() ;
                sc.nextLine();
                System.out.println("enter number of copies.");
                int c = sc.nextInt() ;
                sc.nextLine();
                repo.Add(book, author, price, c);
            }
            else break ;
        }
    }
}