import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String languagePreference;
    private boolean activeStatus;
    private int level;

    public Student(String name, String languagePreference) {
        this.name = name;
        this.languagePreference = languagePreference;
        this.activeStatus = false;
        this.level = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getLanguagePreference() {
        return languagePreference;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLanguage Preference: " + languagePreference + "\nActive Status: " + activeStatus
                + "\nLevel: " + level;
    }
}
