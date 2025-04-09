/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class Course {
    private CourseName name;
    private int credits;
    private String description;
    private boolean genEd;
    private String genEdType;

    public Course(CourseName name, int credits, String description, boolean genEd, String genEdType) {
        this.name = name;
        this.credits = credits;
        this.description = description;
        this.genEd = genEd;
        this.genEdType = genEdType;
    }
    
    public Course() {
        this.name = new CourseName();
        this.credits = 0;
        this.description = "no name";
        this.genEd = false;
        this.genEdType = "";
    }

    public CourseName getName() {
        return name;
    }

    public void setName(CourseName name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGenEd() {
        return genEd;
    }

    public void setGenEd(boolean genEd) {
        this.genEd = genEd;
    }

    public String getGenEdType() {
        return genEdType;
    }

    public void setGenEdType(String genEdType) {
        this.genEdType = genEdType;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", credits=" + credits + ", description=" + description + ", genEd=" + genEd + ", genEdType=" + genEdType + '}';
    }  
}
