public class Book {
    String title;
    Status status = Status.AVIALABLE;

    public Book(String title) {
        this.title = title;
        //status = Status.AVIALABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return "Название книги: " + title + ", статус книги:" + status;
    }
}