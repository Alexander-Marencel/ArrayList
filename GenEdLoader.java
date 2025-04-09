import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Marencel
 */
public class GenEdLoader {
    private ArrayList <GenEd> genEds; //attributes

    public GenEdLoader(ArrayList<GenEd> genEds) { //full-param constructor
        this.genEds = genEds;
    }
    
    public GenEdLoader() { //no-param constructor
       this.genEds = new ArrayList <GenEd> ();
       this.genEds.add(new GenEd("GWS", "Writing/Speaking"));
       this.genEds.add(new GenEd("GQ", "Quantification"));
       this.genEds.add(new GenEd("GA", "Arts"));
       this.genEds.add(new GenEd("GH", "Humanities"));
       this.genEds.add(new GenEd("GHW", "Health and Wellness"));
       this.genEds.add(new GenEd("GN", "Natural Sciences"));
       this.genEds.add(new GenEd("GS", "Social and Behavioral Sciences"));
       this.genEds.add(new GenEd("US", "United States Culture"));
       this.genEds.add(new GenEd("IL", "International Cultures"));
    }

    //getters and setters
    public ArrayList <GenEd> getGenEds() {
        return genEds;
    }

    public void setGenEds(ArrayList <GenEd> genEds) {
        this.genEds = genEds;
    }

    //toString()
    @Override
    public String toString() {
        return "GenEdLoader{" + "genEds=" + genEds + '}';
    }    
}
