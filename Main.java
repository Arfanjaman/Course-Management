/**
 * Main class to demonstrate the Course Management System
 * Creates a sample course module with sub-modules and lessons
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Course Management System Demo ===\n");
        
        // Create individual lessons
        Lesson lesson1 = new Lesson("Introduction to Java", "2 hours", "Dr. Smith");
        Lesson lesson2 = new Lesson("Object-Oriented Programming", "3 hours", "Dr. Johnson");
        Lesson lesson3 = new Lesson("Data Structures", "4 hours", "Prof. Williams");
        Lesson lesson4 = new Lesson("Algorithms", "3 hours", "Dr. Brown");
        Lesson lesson5 = new Lesson("Database Concepts", "2.5 hours", "Dr. Davis");
        Lesson lesson6 = new Lesson("Web Development", "4 hours", "Prof. Miller");
        
        // Create sub-modules
        CourseModule fundamentalsModule = new CourseModule("Programming Fundamentals", 
            "Basic programming concepts and Java introduction");
        fundamentalsModule.addComponent(lesson1);
        fundamentalsModule.addComponent(lesson2);
        
        CourseModule advancedModule = new CourseModule("Advanced Programming", 
            "Advanced topics in computer science");
        advancedModule.addComponent(lesson3);
        advancedModule.addComponent(lesson4);
        
        CourseModule webModule = new CourseModule("Web Technologies", 
            "Database and web development concepts");
        webModule.addComponent(lesson5);
        webModule.addComponent(lesson6);
        
        // Create main course module
        CourseModule mainCourse = new CourseModule("Complete Software Development Course", 
            "A comprehensive course covering all aspects of software development");
        
        // Add sub-modules to main course
        mainCourse.addComponent(fundamentalsModule);
        mainCourse.addComponent(advancedModule);
        mainCourse.addComponent(webModule);
        
        // Display all course details
        System.out.println("Course Structure and Details:");
        System.out.println("================================");
        mainCourse.showDetails();
        
        // Display summary statistics
        System.out.println("\nCourse Summary:");
        System.out.println("===============");
        System.out.println("Total Lessons in Course: " + mainCourse.getTotalLessons());
        System.out.println("Number of Modules: " + mainCourse.getComponents().size());
        
        // Demonstrate individual module details
        System.out.println("\nIndividual Module Details:");
        System.out.println("==========================");
        
        for (CourseComponent component : mainCourse.getComponents()) {
            if (component instanceof CourseModule) {
                CourseModule module = (CourseModule) component;
                System.out.println("Module: " + module.getModuleName() + 
                    " has " + module.getTotalLessons() + " lesson(s)");
            }
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}