package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author 余德军
 *
 */


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 4, 4, 5 };
		int[] b = twoSum2(a, 9);
		for (int i : b) {
			System.out.println(i);
		}
	}

	public static int[] twoSum2(int[] nums, int target) {
	    Map<Integer,Integer> map= new HashMap<Integer,Integer>();
	    for(int i=0;i<nums.length;i++){
	    	int complent=target-nums[i];
	    	if(map.containsKey(complent)){
	    		return new int[] {map.get(complent),i};
	    	}
	    	map.put(nums[i], i);
	    }
	    return new int[] {0,0};
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] arr = { 0, 0 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return arr;

	}

}
