/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class CourseName {
    
    private String major; //attributes or fields
    private int number;

    
    public CourseName(String major, int number) { //full-parameter constructor
        this.major = major;
        this.number = number;
    }
    
    public CourseName() { //no-parameter contructor
        this.major = "IST";
        this.number = 1;
    }

    
    public String getMajor() { //major getter 
        return major;
    }

    public void setMajor(String major) { //major setter
        this.major = major;
    }

    public int getNumber() { //number getter
        return number;
    }

    public void setNumber(int number) { //number setter
        this.number = number;
    }

    @Override
    public String toString() { //toString
        return "CourseName{" + "major=" + major + ", number=" + number + '}';
    }     
}
