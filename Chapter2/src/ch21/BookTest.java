package ch21;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];  // 객체는 null로 초기화됨
        // 객체의 한 cell의 크기는 4byte(또는 8byte) <- 해당 겍체의 메모리 주소값

        // for (Book book : library) {
        //     System.out.println(book);
        // }

        // 객체 배열 사용 시 각 객체는 별도로 new로 생성해주어야 함
        library[0] = new Book("책1", "작가");
        library[1] = new Book("책2", "작가");
        library[2] = new Book("책3", "작가");
        library[3] = new Book("책4", "작가");
        library[4] = new Book("책5", "작가");

        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
