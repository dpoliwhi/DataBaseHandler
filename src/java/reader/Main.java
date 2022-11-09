package reader;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        Reader reader = new FileReader("resources/input.json");
        try (reader) {
            Root<Person> rootPersons = gson.fromJson(reader, Root.class);
            System.out.println(rootPersons);
        } catch (Exception ex) {
            System.out.printf("Parsing error " + ex.getMessage());
        }

//        Reader reader2 = new FileReader("resources/input.json");
//        try (reader) {
//            Root<Expenses> rootExpenses = gson.fromJson(reader, Root.class);
//            System.out.println(rootExpenses);
//        } catch (Exception ex) {
//            System.out.printf("Parsing error " + ex.getMessage());
//        }



    }
}
