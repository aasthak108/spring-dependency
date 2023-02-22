package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
@Configuration
@Component
public class Library {
    @Autowired
    public List<String> books;

    public Library(List<String> books) {
        this.books = books;
    }
    public void printBooks() {
            for (String s : books) {
                System.out.println("- " + s);
            }
        }
    }
