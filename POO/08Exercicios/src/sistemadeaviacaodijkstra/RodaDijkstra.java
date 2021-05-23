/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeaviacaodijkstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eduardoasilvestre
 */
public class RodaDijkstra {

    private List<Vertex> nodes;
    private List<Edge> edges;
    
    String [] executa(int origem, int destino) {
    
         
        Graph graph = this.createGraph();
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        //source
        dijkstra.execute(nodes.get(origem));
        //destination
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(destino));

        //Total distance
        int totalDistance = 0;
        String [] retorno = new String[path.size()];
        
        for (int i = 0; i < retorno.length; i++) {
            retorno[i] = path.get(i).toString();
            
        }
            
        return retorno;
    }

    private Graph createGraph() {
        nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        
        int i=1;
        Vertex UBERABA = new Vertex("Node_" + i++, "UBERABA");
        nodes.add(UBERABA);
        Vertex SAOPAULO = new Vertex("Node_" + i++, "SAOPAULO");
        nodes.add(SAOPAULO);
        Vertex NOVAIORQUE = new Vertex("Node_" + i++, "NOVAIORQUE");
        nodes.add(NOVAIORQUE);
        Vertex LONDRES = new Vertex("Node_" + i++, "LONDRES");
        nodes.add(LONDRES);
        Vertex PARIS = new Vertex("Node_" + i++, "PARIS");
        nodes.add(PARIS);
        
        //UBERABA: 0
        //SAOPAULO: 1
        //NOVAIORQUE: 2
        //LONDRES: 3
        //PARIS: 4
        
        i=1;
        //Uberaba <-> São Paulo = 500
        edges.add(this.createLane("Edge_" + i++, 0, 1, 500));
        edges.add(this.createLane("Edge_" + i++, 1, 0, 500));
        
        //São Paulo <–> Nova Iorque = 10200
        //edges.add(this.createLane("Edge_1", 1, 2, 10200));
        //edges.add(this.createLane("Edge_1", 2, 1, 10200));
        
        //São Paulo <–> Londres = 12600
        edges.add(this.createLane("Edge_" + i++, 1, 3, 12600));
        edges.add(this.createLane("Edge_" + i++, 3, 1, 12600));
        
        //São Paulo <–> Paris = 10600
        edges.add(this.createLane("Edge_" + i++, 1, 4, 10600));
        edges.add(this.createLane("Edge_" + i++, 4, 1, 10600));
        
        //Nova Iorque <–> Londres = 8000
        edges.add(this.createLane("Edge_" + i++, 2, 3, 8000));
        edges.add(this.createLane("Edge_" + i++, 3, 2, 8000));
        
        //Nova Iorque <–> Paris = 7500
        edges.add(this.createLane("Edge_" + i++, 2, 4, 7500));
        edges.add(this.createLane("Edge_" + i++, 4, 2, 7500));
        
        //Londres <–> Paris = 1500
        edges.add(this.createLane("Edge_" + i++, 3, 4, 1500));
        edges.add(this.createLane("Edge_" + i++, 4, 3, 1500));
        
        // Lets check from location Loc_1 to Loc_10
        Graph graph = new Graph(nodes, edges);
        return graph;
    }
    
    
    private Edge createLane(String laneId, int sourceLocNo, int destLocNo,
            int duration) {
        Edge lane = new Edge(laneId, nodes.get(sourceLocNo), nodes.get(destLocNo), duration);
        return lane;
    }
}
