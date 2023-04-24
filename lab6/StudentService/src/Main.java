import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        studentService.generateReport();
        studentService.listStudents();

        Student newStudent = new Student("Dragan","Mihaita","192.168.10.192/26",10);

        studentService.addStudent(newStudent);
        studentService.generateReport();
        System.out.println(studentService.getStudentByName("Dragan"));
    }
}
