import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Monsters> list = new ArrayList<>();
        //Creating Monsters
        Monsters rathalos = new Monsters("Rathalos", 270, true, 80, "Fire");
        Monsters PukeiPukei = new Monsters("PukeiPukei", 200, true, 50, "Poision");
        Monsters Zingore = new Monsters("Zingore", 250, false, 60, "Lighting");
        Monsters Diablos = new Monsters("Diablos", 300, false, 100, "None");
        Monsters Devlijho = new Monsters("Devlijho", 270, false, 100, "Dragon");

        //adding Mosnters to arrayList
        list.add(rathalos);
        list.add(PukeiPukei);
        list.add(Zingore);
        list.add(Diablos);
        list.add(Devlijho);

        //java to Json
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);

        mapper.writeValue(new File("C:\\Users\\aboub\\OneDrive\\Desktop\\Personal Projects\\IdeaProjects\\Webpage\\monsters.json"), list);






    }
}