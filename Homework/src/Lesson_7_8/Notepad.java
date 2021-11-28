package Lesson_7_8;


import java.util.ArrayList;

public class Notepad {

    private String date;
    Notes notes = new Notes();

    public Notepad(String date) {
        this.date = date;
    }

    public void printDate() {
        System.out.println(date);
    }

    public void addNote(String note) {
        notes.setNote(note);
    }
    public void getNotes(){
        notes.getNotes();
    }

    public class Notes{

        ArrayList notes=new ArrayList();
        private int counter=0;

        public void setNote(String note) {
            notes.add(counter,"Note "+counter+": "+note);
            counter++;
        }

        public void getNotes(){
            for(int i=0; i<counter;i++){
                System.out.println(notes.get(i));
            }
        }
    }
    public static void main(String[] args) {
        String date ="13.11.2021";
        Notepad notepad1=new Notepad(date);
        notepad1.printDate();
        notepad1.addNote("Hello is ");
        notepad1.addNote("olleH");
        notepad1.getNotes();
    }
}

