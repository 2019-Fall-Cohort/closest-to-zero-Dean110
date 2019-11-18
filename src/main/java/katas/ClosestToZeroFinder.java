package katas;

import java.util.Collections;
import java.util.List;

public class ClosestToZeroFinder {

	public int findClosestToZero(List<Integer> integers) {
		Integer closestToZero = Integer.MAX_VALUE;
		Collections.sort(integers);
		if(integers.get(integers.size()-1)==Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		for (Integer integer : integers) {
			
			if (Math.abs(closestToZero) >= Math.abs(integer)&&integer !=Integer.MIN_VALUE) {
				closestToZero = integer;
			}
		}
		return closestToZero;
	}

}
