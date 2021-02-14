public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
        BookMover fromAvialableStatusMover = new FromAvialableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();

        fromAvialableStatusMover.moveToStatus(book, Status.ARCHIVED);
        fromArchievedStatusMover.moveToStatus(book, Status.AVIALABLE);
        fromAvialableStatusMover.moveToStatus(book, Status.BORROWED);
        fromBorrowedStatusMover.moveToStatus(book, Status.OVERDUED);
        fromOverduedStatusMover.moveToStatus(book, Status.AVIALABLE);
    }
}