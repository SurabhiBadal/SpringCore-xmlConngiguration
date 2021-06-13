
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean from container
        Coach theCoach=context.getBean("myCricketCoach",Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyRoutine());

        // Call the new method
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
