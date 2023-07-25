package OopsConcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//Write a Java program to demonstrate the usage of Property Class
public class PropertyClassDemo {
    public static void main(String []args){
        Properties properties=new Properties();
        properties.setProperty("name","ABC");
        properties.setProperty("email","ABC@gmail.com");
        try {
            properties.store(new FileWriter("db.properties")," ");
            try {
                FileReader reader=new FileReader("db.properties");
                properties.load(reader);
                System.out.println(properties.getProperty("name"));
                System.out.println(properties.getProperty("email"));

            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
