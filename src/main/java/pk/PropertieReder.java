package pk;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertieReder {

    public static void main(String args[]) throws Exception{

        File src=new File("C:\\Users\\Navneet\\Downloads\\Compressed\\AutomationLab\\src\\abc.properties");
        FileInputStream fis=new FileInputStream(src);

        Properties prop=new Properties();
        prop.load(fis);

        String read=prop.getProperty("App_URL");
        String read1=prop.getProperty("useid");
        String read2=prop.getProperty("Pass");
        System.out.println(""+read);
        System.out.println(""+read1);
        System.out.println(""+read2);

    }
}
