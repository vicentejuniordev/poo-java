public class Book {
    String title;
    String author;
    int numberOfPages;

    void summary(){
        System.out.println("\nBook: " +title+ " by " + author + " with " + numberOfPages + " pages");
    }
}
