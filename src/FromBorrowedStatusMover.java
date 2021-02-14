public class FromBorrowedStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.BORROWED)) {
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
                    book.setStatus(Status.OVERDUED);
                    System.out.println("Переход выполнен в статус:" + " " + requestedStatus);
                    break;
                case BORROWED:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                // Статус BORROWED переходит на каждый из статусов,
                // но default нужен если мы захотим расширить нашу программу (добавятся новые статусы)
                default:
                    System.out.println("Перевод книги из статуса ARCHIVED в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }
        System.out.println("Статус книги:" + " " + book.getStatus());
    }
}