package ch23;

import ch21.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();  // generic: 어떤 객체를 넣을지 지정해줌(굳이 안해도 되긴 함)

        library.add(new Book("책제목1", "작가"));
        library.add(new Book("책제목2", "작가"));
        library.add(new Book("책제목3", "작가"));
        library.add(new Book("책제목4", "작가"));
        library.add(new Book("책제목5", "작가"));

        for(int i=0; i<library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
