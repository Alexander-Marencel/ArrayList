
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class CourseLoader
{

    public CourseLoader(ArrayList<Course> courses)
    {
        try
        {
            read_courses_file(courses);
        } catch (IOException ex)
        {
            Logger.getLogger(CourseLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public final void read_courses_file(ArrayList<Course> courses) throws FileNotFoundException, IOException
    {
        FileReader fr = new FileReader(new File("courses.txt"));
        BufferedReader br = new BufferedReader(fr);
        String s_cname, s_cnumber, s_cdesc, s_ccredits, s_cgened;

        try
        {
            while (br.ready())
            {
                Course c = new Course();
                s_cname = br.readLine();
                s_cnumber = br.readLine();
                c.setName(new CourseName(s_cname, Integer.parseInt(s_cnumber)));

                s_cdesc = br.readLine();
                c.setDescription(s_cdesc.trim());

                s_ccredits = br.readLine();
                c.setCredits(Integer.parseInt(s_ccredits));

                s_cgened = br.readLine();
                if (s_cgened.matches("NONE"))
                {
                    c.setGenEd(false);
                    c.setGenEdType("");
                } else
                {
                    c.setGenEd(true);
                    c.setGenEdType(s_cgened);
                }
                courses.add(c);
                br.readLine();

            }
        } catch (IOException e)
        {
        } finally
        {
            br.close();
        }

    }

}
