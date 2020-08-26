package august;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
        List<String> arrList = new ArrayList<String>();
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0) arrList.add(String.valueOf(i));
            else if(i % 3 == 0 && i % 5 == 0) arrList.add("FizzBuzz");
            else if(i % 3 == 0) arrList.add("Fizz");
            else arrList.add("Buzz");
        }
        return arrList;
    }

}


