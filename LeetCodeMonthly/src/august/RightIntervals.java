package august;

import java.util.Map;
import java.util.TreeMap;

public class RightIntervals {
	public int[] findRightInterval(int[][] intervals) {
        if(intervals == null) return null;
        if(intervals.length == 0) return new int[]{};
        if(intervals.length == 1) return new int[]{-1};
        
        int size = intervals.length;        
        
        int[] rightIntervals = new int[size];
        
        //init: key = rightInterval and value = rightIntervalIndex
        TreeMap<Integer, Integer> intervalTreemap = new TreeMap<Integer, Integer>();
        
        //Fill tree map
        for(int i = 0; i < size; i++) intervalTreemap.put(intervals[i][0], i);        
        
        //Find right intervals
        for(int i = 0; i < size; i++){
            int end = intervals[i][1];
            int rIntervalIndex = -1;
            Map.Entry<Integer, Integer> rInterval = intervalTreemap.ceilingEntry(end);
            if(rInterval != null)
                rIntervalIndex = rInterval.getValue();
            
            rightIntervals[i] = rIntervalIndex;            
        }
        return rightIntervals;
    }

}
