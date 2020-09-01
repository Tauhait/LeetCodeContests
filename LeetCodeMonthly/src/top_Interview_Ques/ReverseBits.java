package top_Interview_Ques;

public class ReverseBits {
	public int reverseBits(int n) {
        int answer = 0; 
        for (int i = 0; i < 32; i++) {
            // Move all bits recorded until now to left and make room in the last bit.
            answer = answer << 1;
            // Extract the last bit from n (n&1) and 
            // add it to the last bit of the answer (answer | last bit)
            answer = answer | (n & 1);
            // Shift n by 1 bit to the right for the next iteration.
            n = n >> 1; 
        }
        return answer;
    }
}
