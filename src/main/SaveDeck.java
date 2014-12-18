package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import javax.json.JsonException;
import javax.json.JsonWriter;
import javax.json.spi.JsonProvider;

public class SaveDeck {

    public void save() {
        try {
            FileOutputStream fos = new FileOutputStream("save.txt");
            JsonObject model = Json.createObjectBuilder()
                    .add("firstName", "Duke")
                    .add("lastName", "Java")
                    .add("age", 18)
                    .add("streetAddress", "100 Internet Dr")
                    .add("city", "JavaTown")
                    .add("state", "JA")
                    .add("postalCode", "12345")
                    .add("phoneNumbers", Json.createArrayBuilder()
                            .add(Json.createObjectBuilder()
                                    .add("type", "mobile")
                                    .add("number", "111-111-1111"))
                            .add(Json.createObjectBuilder()
                                    .add("type", "home")
                                    .add("number", "222-222-2222")))
                    .build();
            JsonWriter writter = fos;
            System.out.println(model);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveDeck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
