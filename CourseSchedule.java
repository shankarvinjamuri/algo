/*
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. 
 * You are given an array prerequisites where prerequisites[i] = [ai, bi] 
 * indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {

    public boolean canFinish(int n, int[][] pre) {

        boolean visited[] = new boolean[n];
        boolean helper[] = new boolean[n];
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(new ArrayList());
        }

        for (int[] t : pre) {
            al.get(t[1]).add(t[0]);
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                boolean ans = dfs_cyclicDetection(al, i, visited, helper);
                if (ans)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numCourses = 0;
        int[][] prerequisites = { { 1 }, { 0 } };
        canFinish(numCourses, prerequisites);
    }

}
