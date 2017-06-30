package graphs;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class CourseSchedule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] input = {{0,1},{1,2},{0,2},{2,4},{3,4}};
		int[][] input2 = {{1,0},{0,1}};
		int[][] input3 = {{1,0},{2,0},{3,1},{3,2}};
		int numCourses = 4;
		System.out.println(findOrder(numCourses,input3));
		
	}
	static LinkedList<Integer>[] adj ;
	public static int[] findOrder(int numCourses, int[][] prerequisites) {
		adj = new LinkedList[numCourses];
		for(int i = 0; i < numCourses; i++)
			adj[i] = new LinkedList<>();
		
		for(int[] prerequisite: prerequisites)
			adj[prerequisite[0]].add(prerequisite[1]);	
		
		canFinishCourses(numCourses);
		int[] result = new int[numCourses];
		for(int i = 0; i < numCourses; i++){
			result[i] = stack.pollLast();
		}
		return result;
    }
	static int[] visited ;
	static Deque<Integer> stack;
	int coursesFinished = 0;
	public static boolean canFinishCourses(int numCourses){
		visited = new int[numCourses];
		stack = new LinkedList<>();
		for(int i = 0;i < numCourses;i++){
			 if(visited[i]==0){
				if(!canFinishCoursesUtil(i))
			 		return false;
			 }
		 }
		return true;
	}
	
	public static boolean canFinishCoursesUtil(int startCourse){	
		visited[startCourse] = 1;
		Iterator<Integer> i = adj[startCourse].listIterator();
		while(i.hasNext()){
			int neighbor = i.next();
			if(visited[neighbor]==1)
				return false;
			if(visited[neighbor] ==0){
				if(canFinishCoursesUtil(neighbor)==false)
					return false;	
			}
		}
		visited[startCourse]= 2;
		stack.addFirst(startCourse);
		return true;
	}


}
