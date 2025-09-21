
public class Lesson implements CourseComponent {
    private String lessonName;
    private String duration;
    private String instructorName;
    
  
    public Lesson(String lessonName, String duration, String instructorName) {
        this.lessonName = lessonName;
        this.duration = duration;
        this.instructorName = instructorName;
    }

    @Override
    public void showDetails() {
        System.out.println("Lesson: " + lessonName);
        System.out.println("  Duration: " + duration);
        System.out.println("  Instructor: " + instructorName);
    }
    
 
    public String getLessonName() {
        return lessonName;
    }
    
    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
    
    public String getDuration() {
        return duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    public String getInstructorName() {
        return instructorName;
    }
    
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
}