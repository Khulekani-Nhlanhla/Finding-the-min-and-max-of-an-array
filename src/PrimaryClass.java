import java.util.Random;

public class PrimaryClass {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] randomNumbers= new int[10];
        int smallest = 100;
        int largest = 1;
        for (int i =0;i<randomNumbers.length;i++){
            randomNumbers[i]=rand.nextInt(100)+1;
            if (randomNumbers[i]<smallest){
                smallest=randomNumbers[i];
            }
            else if (randomNumbers[i]>largest) {
                largest=randomNumbers[i];
            }
        }
        for (int element:randomNumbers) {
            System.out.printf(" {"+element+ "}, ");

        }
        System.out.println("");
        System.out.println("The smallest number in the array is: "+smallest);
        System.out.println("The largest number in the array is: "+ largest);
    }
}
