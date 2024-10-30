import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph<V>{


    private final Map<V, ArrayList<V>> connectList = new HashMap<>();
    private final boolean directed;

      public Graph(boolean directed){
        this.directed = directed;
    }

    public void addConnect(V vert1, V vert2){
        if ( connectList.get(vert1) != null && connectList.get(vert2) != null){
            connectList.get(vert1).add(vert2);
            if (!directed){
                connectList.get(vert2).add(vert1);
            }
        }
    }

    public void addVert(V vert){
        connectList.computeIfAbsent(vert, k -> new ArrayList<>());
    }

    public void displayNetwork(){
        System.out.println(connectList);
    }

}
