import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class App
{
    static ArrayList <GenEd> geneds;
    static ArrayList<Course> courses;
    public static void main(String[] args)
    {
        geneds = new ArrayList<GenEd>(); //create ArrayList
        courses = new ArrayList<Course>();
        
        GenEdLoader gel = new GenEdLoader(); //create GenEdLoader
        geneds = gel.getGenEds(); //assign ArrayList from GenEdLoader to geneds
        CourseLoader cl = new CourseLoader(courses); // read courses into ArrayList
        
        int ticker = 1;
        for (int i = 0; i<courses.size(); i++) //loop through ArrayList
        {
            Course c =courses.get(i); //set current course
            if (c.isGenEd()) //check for genEd
            {
                for (int p = 0; p<geneds.size(); p++) //loop through genEds
                {
                    GenEd ge = geneds.get(p); //set current genEd
                    if(c.getGenEdType().matches(ge.getType())) //check if current genEd matches current course's genEd
                    {
                        System.out.println(ticker +"-"+ c.getName().getMajor() +" "+ c.getName().getNumber() +" - "+ c.getDescription() +" is a Gen.Ed. "+ ge.getType() +"-"+ ge.getDescription());
                        ticker++;
                    }
                }
            }
        }
    }
}
