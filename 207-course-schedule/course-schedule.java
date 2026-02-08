class Solution {
    int[] visited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses+1];
        HashMap<Integer,List<Integer>> adj_map = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            int key = prerequisites[i][0];
            int value = prerequisites[i][1];

            if(!adj_map.containsKey(key)){
                adj_map.put(key,new ArrayList<>());
            }
            adj_map.get(key).add(value);
        } 
        for(int i=0;i<numCourses;i++){
            if(bfs(i, adj_map)){
                return false;
            }
        }
        return true;
    }
    public boolean bfs(int node, HashMap<Integer,List<Integer>> adj_map){
        if(!adj_map.containsKey(node))return false;
        if(visited[node] == 1)return true; // contains cycle
        if(visited[node] == 2)return false;
        visited[node] = 1;

        for(int i=0;i<adj_map.get(node).size();i++){
            if(bfs(adj_map.get(node).get(i), adj_map)){
                return true;
            }
        }
        // this part wont be reached if the graph is cyclic
        visited[node] = 2;
        return false;
    }
}