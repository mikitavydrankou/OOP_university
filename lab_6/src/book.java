public class book {
    private String title;
    private String author;
    private int numberOfPages;

    public book(String title, String author, int numberOfPages) {

        if (title == null) {
            this.title = "";
        } else {
            this.title = title;
        }

        if (author == null) {
            this.author = "";
        } else {
            this.author = author;
        }

        if(numberOfPages < 0){
            this.numberOfPages = 1;
        }
        else {
            this.numberOfPages = numberOfPages;
        }



    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString(){
        return "Book: " + title + "Author: " + author + "Num of pages: " + numberOfPages;
    }

    public boolean equals(Object other){
        if(other instanceof book temp){
            return this.title.equals(temp.title) && this.author.equals(temp.author) && this.numberOfPages == temp.numberOfPages;
        }
        else{
            return false;
        }
    }
}
