package service;

import model.Student;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class StudentService {

    private String reportsPath = "C:\\Users\\cbadea\\OneDrive - ENDAVA\\Desktop\\pao presentation 2023\\lab6\\StudentService\\src\\reporting";
    private List<Student> studentList = new ArrayList<>();

    public StudentService() {
        Student student1 = new Student("Bob", "Bob", "123",7.77);
        Student student2 = new Student("Ana", "Ana", "123",7.78);
        Student student3 = new Student("Dob3", "Dob", "123",7.79);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
    }

    public void addStudent(Student newStudent){
        studentList.add(newStudent);
        System.out.println("Added a new student");
    }

    public void listStudents(){
        studentList.sort(Comparator.comparing(Student::getNume));
        System.out.println(studentList);
    }

    public Student getStudentByName(String name){
        return studentList
                .stream()
                .filter(s->s.getNume().equalsIgnoreCase(name))
                .findFirst().orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public void generateReport(){

        Path path = Paths.get(reportsPath);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        String time = simpleDateFormat.format(new Date());
        Path reportPath = path.resolve("report" + time +".csv");
        try {
            Files.createFile(reportPath);
            Files.writeString(reportPath, generateContent(), APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateContent(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("NUME");
        stringBuilder.append(",");
        stringBuilder.append("PRENUME");
        stringBuilder.append(",");
        stringBuilder.append("GRUPA");
        stringBuilder.append(",");
        stringBuilder.append("MEDIE");
        stringBuilder.append("\n");

        studentList.forEach(student -> {
            stringBuilder.append(student.getNume());
            stringBuilder.append(",");
            stringBuilder.append(student.getPrenume());
            stringBuilder.append(",");
            stringBuilder.append(student.getGrupa());
            stringBuilder.append(",");
            stringBuilder.append(student.getMedie());
            stringBuilder.append("\n");
        });

        return stringBuilder.toString();
    }

}
