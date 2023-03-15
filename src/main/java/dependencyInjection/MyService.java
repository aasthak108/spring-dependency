package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class MyService {
    @Autowired
    public ArrayList<Library> names;
    public void printBooks()
    {
        for(Library books : names)
        {
            System.out.println(books.getName());
        }
    }
}
