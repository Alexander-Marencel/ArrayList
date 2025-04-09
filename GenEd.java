/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class GenEd {
    private String type; //encapsulated attributes
    private String description;

    public GenEd(String type, String description) { //full-param constructor
        this.type = type;
        this.description = description;
    }
    
    public GenEd() { //no-param constructor
        this.type = "N.A.";
        this.description = "N.A.";
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //toString()
    @Override
    public String toString() {
        return "GenEd{" + "type=" + type + ", description=" + description + '}';
    }
}
