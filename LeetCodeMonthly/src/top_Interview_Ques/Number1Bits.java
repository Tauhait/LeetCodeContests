package top_Interview_Ques;

public class Number1Bits {
	public int hammingWeight(int n) {        
        int count1s = 0;        
        // while( n != 0 ){
        //     count1s++;
        //     //The key idea here is to realize that for any number n, 
        //     //doing a bit-wise AND of n and n - 1 flips the least-significant 1-bit in n to 0
        //     n &= (n-1);             
        // } 
        while(n != 0){
            count1s += (n & 1);
            n >>>= 1;
            //We need to use bit shifting unsigned operation >>> 
            //(while >> depends on sign extension)
        }
        /*
         * In Java we need to put attention on the fact that the maximum integer is 2147483647. 
         * Integer type in Java is signed and there is no unsigned int. 
         * So the input 2147483648 is represented in Java as -2147483648 
         * (in java int type has a cyclic representation, 
         * that means Integer.MAX_VALUE+1==Integer.MIN_VALUE).
			This force us to use 
				n!=0
			in the while condition and we cannot use
				n>0
			because the input 2147483648 would correspond to -2147483648 in java and 
			the code would not enter the while if the condition is n>0 for n=2147483648.
         */
        return count1s;
    }

}
