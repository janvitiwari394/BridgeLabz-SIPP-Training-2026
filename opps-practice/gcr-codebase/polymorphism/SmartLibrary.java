class LibraryMember {
    String memberName, memberId;

    LibraryMember(String name, String id) {
        memberName = name;
        memberId = id;
    }

    double calculateFine(int days) {
        return 0;
    }

    void display() {
        System.out.println(memberName + " - " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int days) {
        return days * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String n, String id) {
        super(n, id);
    }

    double calculateFine(int days) {
        return days * 5;
    }
}

public class SmartLibrary {
    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Rahul", "S101"),
                new FacultyMember("Amit", "F201"),
                new GuestMember("Priya", "G301")
        };

        String searchId = "F201";

        for (LibraryMember m : members) {
            m.display();
            System.out.println("Fine = " + m.calculateFine(5));

            if (m.memberId.equals(searchId))
                System.out.println("Member Found: " + m.memberName);

            System.out.println();
        }
    }
}