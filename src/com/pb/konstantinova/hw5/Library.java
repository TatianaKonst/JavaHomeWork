package com.pb.konstantinova.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] books = {new Book("Самый богатый человек в Вавилоне", "Джорж Сэмюэль Клейсон", 2021)
                , new Book("Хочу и буду. Принять себя, полюбить жизнь и стать счастливым", "Лабковский Михаил", 2020)
                , new Book("Мертвые души", "Гоголь Николай", 1842)};

        Reader[] readers = {new Reader("Куделя А.И.", "1987-05-15","0684445533")
                , new Reader("Плыска И.И.", "1995-07-18", "0503251644", "Менеджмент")
                , new Reader("Константинова Т.Г.", "1988-02-23","0637216671")};

        readers[1].setFaculty("Психология");
        readers[0].setPhone("0954561233");
        print(books);
        print(readers);

        //тест методов методов takeBook
        readers[0].takeBook(books.length);
        readers[1].takeBook(getName(books));
        readers[2].takeBook(books);

        //тест методов returnBook
        readers[0].takeBook(books.length);
        readers[1].takeBook(getName(books));
        readers[2].takeBook(books);

    }
    private static String[] getName(Book... books){
        String[] result = new String[books.length];
        for (int i=0;i< books.length;i++) result[i]=books[i].getName();
        return result;
    }

    private static void print(Book... books){
        System.out.println("Перечень книг:");
        for (Book book:books) System.out.println(book.getName() + "(" + book.getAuthor() + " " + book.getYear() + " г.)");
    }
    private static void print(Reader... readers){
        System.out.println("Информация о пользователе:");
        for (Reader reader:readers) System.out.println("Читательский билет: "+ reader.getTicketLibrary()
                + ", ФИО: " + reader.getFullName()
                + ", контактный номер: " + reader.getPhone()
                + ", дата рождения: " + reader.getDateBirth()
                + ", факультет: " + reader.getFaculty());
    }
}
