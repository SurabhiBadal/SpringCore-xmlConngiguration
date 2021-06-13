
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

public class SpringApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean from container
        CricketCoach theCoach=context.getBean("myCricketCoach",CricketCoach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyRoutine());

        // Call the new method
        System.out.println(theCoach.getDailyFortune());

        // call the get email and get team
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();

    }
}
