import java.util.ArrayList;
import java.util.List;

    public class Graph {
        public static void allPaths(int[][] graph, int node, List<Integer> list, List<List<Integer>> result) {
            list.add(node);
            if (node == graph.length - 1) {
                result.add(new ArrayList<>(list));
            } else {
                for (int i = 0; i < graph[node].length; i++) {
                    allPaths(graph, graph[node][i], list, result);
                }
            }
            list.remove(list.size() - 1);
        }

        public static List<List<Integer>> allPaths(int[][] graph) {
            if (graph.length == 0) {
                return new ArrayList<>();
            }
            List<Integer> intList = new ArrayList<>();
            List<List<Integer>> resultList = new ArrayList<>();
            allPaths(graph, 0, intList, resultList);
            System.out.println(resultList);
            return resultList;
        }

        public static void main(String[] args) {
            int graph1[][] = {{1,2},{3},{3},{}};
            List<List<Integer>> arr_graph1 = allPaths(graph1);

            int graph2[][] = {{1},{}};
            List<List<Integer>> arr_graph2 = allPaths(graph2);

            int arr3[][] = {{4,3,1},{3,2,4},{3},{4},{}};
            List<List<Integer>> arr_graph3 = allPaths(arr3);


            System.out.println("graph 1: " +  arr_graph1);
            System.out.println("graph 2: "+ arr_graph2);
            System.out.println("graph 3: "+ arr_graph3);

        }

    }



