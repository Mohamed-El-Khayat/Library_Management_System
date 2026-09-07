import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class JsonHandler {
    private Gson json = new Gson() ;
    private String path ;

    public JsonHandler(String p){
        path = p ;
    }

    public List<Book> read(){
        try {
            FileReader reader = new FileReader(path);
            Type listType = new TypeToken<List<Book>>(){}.getType();
            return json.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println("File not found, starting fresh.");
            return new ArrayList<>();
        }
    }
    public void write(List<Book> books)
    {
        try {
            FileWriter writer = new FileWriter(path);
            json.toJson(books, writer);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
