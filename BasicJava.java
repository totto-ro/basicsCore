import java.util.ArrayList;
public class BasicJava{

    //Print 1-255
    public void print255(){
        for ( int i = 0;  i < 256; i++ ){
            System.out.println(i);
        }
    }

    //Print odd numbers between 1-255
    public void printOddNum(){
        for ( int i = 0;  i < 256; i++ ){
            if ( i % 2 != 0)
                System.out.println(i);
        }
    }

    //Sigma of 255 AKA Sum to 255
    public int sigmaSum255(){
        int sum = 0;
        for( int i = 0; i < 256; i++ ){
            sum += i;
        }
        return sum;
    }

    //Iterating through an array
    public void iteratingArray( int array[] ){
        int j = 0;
        while( j < array.length ){
            System.out.println( array[j] );
            j ++;
        }
            
    } 

    //Find Max
    public int findMaxNum( int array[] ){
        int maxNum = array[0];
        for( int i = 0; i < array.length; i++ ){
            if( maxNum < array[i] ){
                maxNum = array[i];
            }
        }
        return maxNum;
        
    }

    //Array with Odd Numbers 
    public ArrayList<Integer> getOddArray() {
		ArrayList<Integer> oddNums = new ArrayList<Integer>();
		for( int i = 0; i < 256; i++ ) {
			if( i % 2 != 0 )
				oddNums.add(i);
		}
		return oddNums;
	}


} 
