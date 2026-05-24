public class Main5 {

    public static void main(String[] args) {

        // Create Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Dr. Silva");
        lecturer.setCourseTeaching("Object Oriented Programming");

        // Create Course object
        Course course = new Course();
        course.setCourseName("Java Programming");
        course.setCourseCode("CS101");
        course.setLecturer(lecturer);

        // Create Student object
        Student student = new Student();
        student.setStudentName("Madusha");
        student.setDegreeName("BICT Honours");
        student.setCourseFollowing("Java Programming");

        // Display details
        System.out.println("Course Name: "
                + course.getCourseName());

        System.out.println("Course Code: "
                + course.getCourseCode());

        System.out.println("Lecturer Name: "
                + course.getLecturer()
                .getLecturerName());

        System.out.println("Course Teaching: "
                + course.getLecturer()
                .getCourseTeaching());

        System.out.println("Student Name: "
                + student.getStudentName());

        System.out.println("Degree Name: "
                + student.getDegreeName());

        System.out.println("Course Following: "
                + student.getCourseFollowing());
    }
}