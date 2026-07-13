import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> list = attendance.get(subject);

        if (!list.contains(student))
            list.add(student);
        else
            System.out.println(student + " already marked in " + subject);
    }

    static void display() {

        for (String subject : attendance.keySet()) {

            System.out.println(subject + " :");

            ArrayList<String> students = attendance.get(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total = " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Ankush");
        markAttendance("Java", "Riya");
        markAttendance("Java", "Ankush");

        markAttendance("Python", "Aman");

        display();
    }
}