package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {
	Professor prof = new Professor("Dr. Black");
    Student student1 = new Student("Amy");
    Student student2 = new Student("Billie");

    prof.teach();
    student1.listen();
    student1.takeNotes();
    }
}
