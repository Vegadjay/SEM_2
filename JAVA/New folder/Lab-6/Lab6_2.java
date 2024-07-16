
/**
 * Lab6_2
 */
class Book{
    private String author_name;

    Book(String author_name){
        this.author_name=author_name;
    }
    public void printDetails(){
        System.out.println(this.author_name);
    }

    // public String getAuthor_name() {
    //     return author_name;
    // }
}

class Book_Publication extends Book{

    private String title;

    Book_Publication(String title, String author_name){
        super(author_name);
        this.title=title;
    }
    public void printDetails(){
        super.printDetails();
        System.out.println(this.title);
    }

}

class Paper_Publication extends Book{
    private String title;

    Paper_Publication(String title, String author_name){
        super(author_name);
        this.title=title;
        
    }
    public void printDetails(){
        super.printDetails();
        System.out.println(this.title);
    }
}
public class Lab6_2 {
    public static void main(String[] args) {
        Book b1;
        String author_name, publicationType, title;
        if(args.length == 1){
            author_name = args[0];
             b1 = new Book(author_name);
             b1.printDetails();
        }

        else if(args.length == 3){
            author_name = args[0];
            publicationType = args[1];
            title = args[2];
            if(publicationType.equals("paper")){
                b1 = new Paper_Publication(author_name, title);
            }
            else{
                b1 = new Book_Publication(author_name, title);
            }
            b1.printDetails();
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
}