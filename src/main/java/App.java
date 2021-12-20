import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat oneCat =
                (Cat) applicationContext.getBean("cat");
        Cat twoCat =
                (Cat) applicationContext.getBean("cat");
        boolean hwBollean = bean == bean2;
        boolean catBollean = oneCat == twoCat;
        System.out.println(hwBollean);
        System.out.println(catBollean);

        System.out.println(bean.getMessage());
    }
}