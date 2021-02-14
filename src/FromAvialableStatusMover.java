public class FromAvialableStatusMover extends BookMover {
    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(Status.AVIALABLE)) {
            switch (requestedStatus) {
                case ARCHIVED:
                    book.setStatus(Status.ARCHIVED);
                    System.out.println(String.format("Переход выполнен в статус:" + " " + requestedStatus));
                    break;
                case BORROWED:
                    book.setStatus(Status.BORROWED);
                    System.out.println("Переход выполнен в статус:" + " " + requestedStatus);
                    break;
                case AVIALABLE:
                    System.out.println("Книга уже имеет такой статус");
                    break;
                default:
                    System.out.println("Перевод книги из статуса AVIALABLE в статус" + " " + requestedStatus + " " + "невозможен");
            }
        } else {
            System.out.println("Ошибка, это не мой статус");
        }
        System.out.println("Статус книги:" + " " + book.getStatus());
    }
}