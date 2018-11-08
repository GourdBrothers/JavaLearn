

import java.util.BitSet;

public class BitsetTest 
{

	public static void main(String[] args) 
	{
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        
        // set some bits
        for(int i=0;i<16;i++) {
        	//
        	if((i%2)==0) {
        		bits1.set(i);
        	}
        	//
        	if((i%5)!=0) {
        		bits2.set(i);
        	}
        }
        System.out.println("Initital pattern in bits1:\n "+bits1);
        System.out.println("Initital pattern in bits2:\n "+bits2);
        
        // get one bits
        System.out.println("Get bits1[0]:"+bits1.get(0));
        System.out.println("Get bits1[1]:"+bits1.get(1));
        System.out.println("Get bits2[0]:"+bits2.get(0));
        System.out.println("Get bits2[1]:"+bits2.get(1));
        
        // bits equals bits
        System.out.println("bits1 equals bits2 :"+ bits2.equals(bits1));
        
        // AND bits
        bits2.and(bits1);
        System.out.println("bits2 AND bits1,bits2 is:\n "+bits2);
        
        // OR bits
        bits2.or(bits1);
        System.out.println("bits2 OR bits1,bits2 is:\n "+bits2);
        
        // XOR bits
        bits2.xor(bits1);
        System.out.println("bits2 XOR bits1,bits2 is:\n "+bits2);

	}

}
