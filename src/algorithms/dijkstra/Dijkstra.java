package algorithms.dijkstra;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {
    Map<String, String> grafo = new HashMap<>();
    Map<String, String> custos = new HashMap<>();
    Map<String, String> pais = new HashMap<>();

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
            "Annecy", List.of()
    );



}
