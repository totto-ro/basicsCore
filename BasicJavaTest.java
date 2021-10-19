public class BasicJavaTest {
    public static void main( String args[] ){

        //Print 1-255
        BasicJava test = new BasicJava();
        test.print255();

        //Print odd numbers between 1-255
        BasicJava odds = new BasicJava();
        odds.printOddNum();

        //Sigma of 255 AKA Sum to 255
        BasicJava sigma = new BasicJava();
        System.out.println(sigma.sigmaSum255());

        //Iterating through an array
        int [] arrayNum = {1, 3, 5, 7, 9, 13};
        BasicJava itirate = new BasicJava();
        itirate.iteratingArray( arrayNum );
        
        //Find Max
        int [] arrNum = { -3, -5, -7 };
        BasicJava findMax = new BasicJava();
        System.out.println( findMax.findMaxNum(arrNum) );

        //Array with Odd Numbers
        BasicJava arrayOddNums = new BasicJava();
        System.out.println(arrayOddNums.getOddArray());
        

    }

}
