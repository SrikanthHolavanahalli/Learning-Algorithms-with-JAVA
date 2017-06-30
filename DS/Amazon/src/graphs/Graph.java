package graphs;

import java.util.*;


public class Graph {
	
	int v;
	LinkedList<Integer>[] adj;
	
	public Graph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v;i++){
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int v , int w){
		adj[v].add(w);
	}
	
	public void bfs(int start){
		boolean[] visited = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(start);
		while(!queue.isEmpty()){
			int node = queue.poll();
			visited[node] = true;
			
			System.out.print(node+ "->");
			
			//accessing Node node's neighbors from adj list using Iterator
			Iterator<Integer> i =  adj[node].listIterator();
			while(i.hasNext()){
				int neighbor = i.next();
				if(!visited[neighbor]){
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		System.out.println("end");
	}
	public void dfs(int start){
		boolean[] visited = new boolean[v];
		//for(int i = 0;i < v;i++){
		//	if(!visited[i])
				dfsUtil(start,visited);
		//}
		System.out.println("end");
	}
	public void dfsUtil(int v, boolean[] visited){
		visited[v] = true;
		System.out.print(v + "->");
		Iterator<Integer> i = adj[v].listIterator();
		while(i.hasNext()){
			int neighbor = i.next();
			if(!visited[neighbor]){
				dfsUtil(neighbor,visited);
			}
		}	
	}
	
	public void topologicalSort(){
		boolean[] visited = new boolean[v];
		Deque<Integer> stack = new LinkedList<>();
		for(int i = v-1;i > 0;i--){
			if(!visited[i])
				topologicalSortUtil(i, visited, stack);
		}
		System.out.print("start");
		while(!stack.isEmpty()){
			System.out.print("->" + stack.poll());
		}
		
	}
	
	public void topologicalSortUtil(int start, boolean[] visited, Deque<Integer> stack){
		visited[start] = true;
		Iterator<Integer> i = adj[start].listIterator();
		while(i.hasNext()){
			int neighbor = i.next();
			
			if(!visited[neighbor])
				topologicalSortUtil(neighbor, visited, stack);
		}
		stack.addFirst(start);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(6);
		g.addEdge(5, 2);
		g.addEdge(2, 3);
		g.addEdge(5, 0);
		g.addEdge(3, 1);
		g.addEdge(4, 1);
		g.addEdge(4, 0);
		g.bfs(5);
		
		g.dfs(4);
		
		g.topologicalSort();
		
	}

}
