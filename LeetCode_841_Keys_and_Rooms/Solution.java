//link: https://leetcode.com/problems/keys-and-rooms/description/

import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(0);
        int[] is_visited = new int[rooms.size()];
        dfs(rooms, set, 0, is_visited);
        return set.size() == rooms.size();
    }
    
    public void dfs(List<List<Integer>> rooms, Set<Integer> set, int room_index, int[] is_visited){
        if(is_visited[room_index] == 0){
            is_visited[room_index] = 1;
            for(int key: rooms.get(room_index)){
                set.add(key);
                dfs(rooms, set, key, is_visited);
            }
        }
    }

    public static void main(String[] args) { 
        Solution s = new Solution();
        List<Integer> keys_room_0 = new ArrayList<Integer>();
        keys_room_0.add(1);
        List<Integer> keys_room_1 = new ArrayList<Integer>();
        keys_room_1.add(0);
        List<Integer> keys_room_2 = new ArrayList<Integer>();
        keys_room_1.add(0);
        List<List<Integer>> rooms = new ArrayList<List<Integer>>();
        rooms.add(keys_room_0); rooms.add(keys_room_1); rooms.add(keys_room_2);
        System.out.println(s.canVisitAllRooms(rooms));
   }
}