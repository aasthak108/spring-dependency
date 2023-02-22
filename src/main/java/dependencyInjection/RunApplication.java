package dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplication {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.refresh();
        Library library = appContext.getBean(Library.class);
        library.books.add("Software Engineering");
        library.books.add("Data Mining");
    }

    
}
