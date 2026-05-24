class Course {

    // Variables
    private String courseName;
    private String courseCode;

    // Lecturer object
    private Lecturer lecturer;

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    // Setter methods
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}