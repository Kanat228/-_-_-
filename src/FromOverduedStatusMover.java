public class FromOverduedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.OVERDUED)) {
            switch (requestedStatus) {
                case AVIALABLE:
                    book.setStatus(Status.AVIALABLE);
                    System.out.println("Переход выполнен в статус:" + " " + requestedStatus);
                    break;
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    System.out.println("Переход выполнен в статус:" + " " + requestedStatus);
                    break;
                case OVERDUED:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }
        System.out.println("Статус книги:" + " " + book.getStatus());
    }
}