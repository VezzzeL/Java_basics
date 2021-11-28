package Lesson_7_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Catalog {
    Random random=new Random();
    BooksLibrary booksLibrary=new BooksLibrary();
    public void giveBook(String visitorName, int id){
        booksLibrary.bookToGive(visitorName,id);
    }
    public void returnBook(){
        booksLibrary.bookToReturn();
    }

    public void showBooksMobility(){
        booksLibrary.showMeHistory();
    }

    private class BooksLibrary{
        String[] books={"Echo labyrinths","Sunshine","Chronicles of Semestria"};
        ArrayList booksMobility=new ArrayList();
        ArrayList givenBooks=new ArrayList();
        ArrayList booksOwned=new ArrayList(List.of(books));

        private void bookToGive(String visitorName, int id){
            int i=random.nextInt(booksOwned.size());
            Object tempBook=booksOwned.get(i);
            givenBooks.add(tempBook);
            booksMobility.add(visitorName+" "+id+" received "+tempBook);
            booksOwned.remove(tempBook);
        }
        private void bookToReturn(){
            int i=random.nextInt(givenBooks.size());
            Object tempBook=givenBooks.get(i);
            booksOwned.add(tempBook);
            booksMobility.add(tempBook+" had been returned");
            givenBooks.remove(tempBook);
        }
        private void showMeHistory(){
            for(int i=0;i<booksMobility.size();i++){
                System.out.println(booksMobility.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Catalog catalog=new Catalog();
        catalog.giveBook("Pedro",322);
        catalog.giveBook("Sofia",299);
        catalog.returnBook();
        catalog.showBooksMobility();
    }
}
