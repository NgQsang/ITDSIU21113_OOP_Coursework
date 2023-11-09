class CourseRegistration {

    //constructor for student group A
    public boolean registerStudentInGroupA(Student student, Course course) {
        String courseName = course.getCourseName();
        int TestResult = student.getTestResult();
        if ((TestResult >= 80) &&
            (courseName.equals("IE1") || courseName.equals("IE2") || courseName.equals("PT1") || courseName.equals("PT2") 
            ||courseName.equals("EE1") || courseName.equals("EE2"))) {
        return true; // Group A can take any course
    }
        return false;
    }

    //constructor for student group B
    public boolean registerStudentInGroupB(Student student, Course course) {
        String courseName = course.getCourseName();
        int TestResult = student.getTestResult();
        if ((TestResult >= 60 && TestResult <= 79) &&
            (courseName.equals("IE1") || courseName.equals("IE2") || courseName.equals("PT1") || courseName.equals("PT2"))) {
            return true; // Group B can take intermediate English or physical training courses
        }
        return false;
    }

    //constructor for student group C
    public boolean registerStudentInGroupC(Student student, Course course) {
        String courseName = course.getCourseName();
        int TestResult = student.getTestResult();
        if ((TestResult < 60) &&
            (courseName.equals("EE1") || courseName.equals("EE2"))) {
            return true; // Group C can take elementary English courses
        }
        return false;
    }

    //constructor for student group A, B, C
    public boolean register(Student student, Course course) {
        int TestResult = student.getTestResult();
        if (TestResult >= 80) {
            return registerStudentInGroupA(student, course);
        } else if (TestResult >= 60 && TestResult <= 79) {
            return registerStudentInGroupB(student, course);
        } else if(TestResult < 60) { // (TestResult < 60
            return registerStudentInGroupC(student, course);
        }
        return false; // add a default return statement
    }
}
