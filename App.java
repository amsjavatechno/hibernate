package Hibernate19Feb.Hibernate19Feb;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //Implement Session Factory Interface
        
        SessionFactory factory;
        factory = new Configuration()
        		.configure()
        		.buildSessionFactory();
        //
        Configuration cfgConfiguration = new Configuration();
        cfgConfiguration.configure();
        
        SessionFactory factory2;
        factory2 = cfgConfiguration.buildSessionFactory();
        
        System.out.println("Session :" +factory.toString());
        System.out.println("Session via 2nd Method "+factory2.toString());
        System.out.println("------------------------------------");
        
        
    }
}
