package ch21;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];  // 객체는 null로 초기화됨
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("책1", "작가");
        library[1] = new Book("책2", "작가");
        library[2] = new Book("책3", "작가");
        library[3] = new Book("책4", "작가");
        library[4] = new Book("책5", "작가");

        // arraycopy로 객체 배열을 복사할 경우 해당 객체의 주소값들을 복사하는것이기 때문에 두개의 배열이 같은 주소의 객체를 바라보게 됨
        // == shallow copy
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        library[0].setAuthor("다른작가");
        library[0].setTitle("다른책");

        System.out.println("=== library ===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=== copy library ===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
