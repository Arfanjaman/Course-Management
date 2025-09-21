import java.util.ArrayList;
import java.util.List;


public class CourseModule implements CourseComponent {
    private String moduleName;
    private String description;
    private List<CourseComponent> components;
    

    public CourseModule(String moduleName, String description) {
        this.moduleName = moduleName;
        this.description = description;
        this.components = new ArrayList<>();
    }
    
    public void addComponent(CourseComponent component) {
        components.add(component);
    }
    
    public void removeComponent(CourseComponent component) {
        components.remove(component);
    }
    
    public List<CourseComponent> getComponents() {
        return new ArrayList<>(components);
    }
    
    @Override
    public void showDetails() {
        System.out.println("Module: " + moduleName);
        System.out.println("  Description: " + description);
        System.out.println("  Components:");
        
        if (components.isEmpty()) {
            System.out.println("    No components in this module");
        } else {
            for (CourseComponent component : components) {
                System.out.print("    ");
                component.showDetails();
            }
        }
    }
    
    public int getTotalLessons() {
        int count = 0;
        for (CourseComponent component : components) {
            if (component instanceof Lesson) {
                count++;
            } else if (component instanceof CourseModule) {
                count += ((CourseModule) component).getTotalLessons();
            }
        }
        return count;
    }
    
    public String getModuleName() {
        return moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}