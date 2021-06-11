
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean from container
        Coach theCoach=context.getBean("myCoach",Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyRoutine());

        //close the context
        context.close();

    }
}
