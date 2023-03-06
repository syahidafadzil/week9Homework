package com.example.mathcompetencysurvey;

public class Main { // create a public class main
    public static void main(String args[]) {
        SchoolList sl = new SchoolList(); // create an object for school list class

        // call the school list method
        School sc = new School(); // create a school object for school class (school object 1)
        // create an address object for school class (address object 1)
        Address addr = new Address("Jalan Suadamai", "Cheras", "43200", "Selangor");
        sc.setName("SK Bandar Tun Hussein ONN 2"); // set school name
        sl.addSchool(sc, addr);

        School sc2 = new School(); // create a school object for school class (object 2)
        // create an address object for school class (address object 2)
        Address adrr2 = new Address("Jalan Suadamai", "Cheras", "43200", "Selangor");
        sc2.setName("SMK Bandar Tun Hussein Onn 2"); // set school name
        sl.addSchool(sc2, addr2);

        School sc3 = new School(); // create a school object for school class (object 3)
        // create an address object for school class (address object 3)
        Address adrr3 = new Address("Jalan Suadamai", "Cheras", "43200", "Selangor");
        sc2.setName("Universiti Teknologi PETRONAS"); // set school name
        sl.addSchool(sc2, addr2);

        sl.display();

        Marks marks = new Marks(100);

        try {
            marks.setMark(-50, 0);
        }
        catch (Exception ex) {
            System.out.print("\nMarks must be positive");
            ex.printStackTrace();
        }

        // display marks
        float mark = marks.getMarks(5);
        System.out.println("Marks for student 1 is " + mark);
    }
}

