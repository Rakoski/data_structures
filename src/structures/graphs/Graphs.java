package structures.graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphs {
    static Map<String, List<String>> graphImp = Map.of(
            "Você", List.of(
                    "Alice", "Bob", "Claire"
            ),
            "Bob", List.of(
                    "Anuj", "Annecy"
            ),
            "Alice", List.of(
                    "Thom"
            ),
            "Claire",List.of(
                    "Thom", "Johnny"
            ),
            "Anuj", List.of(),
            "Thom", List.of(),
            "Johnny", List.of(),
            "Annecy", List.of());

    public static void main(String[] args) {
        System.out.println(graphImp);
    }

}
