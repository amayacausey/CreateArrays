import java.util.Arrays;
import java.util.Scanner;

public class CreateArrays {
    public static void main(String [] args){


        int[] num= new int[]{1,21,63,4,51};
        System.out.print("Numbers: [ ");
        for(int i=0;i < num.length;i++){

            //if i reaches 4 do not add ,
            //if i is any number but 4 add num i plus ,
            if (i!=4){
                System.out.print( num[i] +  ", ");
            } else if(i==4) {
                System.out.print( num[i]);
            }
        }
        System.out.print( "]");

        String[] weekdays = new String[7];
        Scanner scanner =new Scanner(System.in);

        for( int i=0 ; i<weekdays.length; i++){
            System.out.println("\nPlease give me weekday 0" + (i+1));
            weekdays[i]=scanner.nextLine();
        }
        System.out.println("Strings: "+Arrays.toString(weekdays));

        char[] ch = new char[5];
        ch[0] = 'a';
        ch[1] = 'e';
        ch[2] = 'i';
        ch[3] = 'o';
        ch[4] = 'u';

        System.out.println("Characters:" +Arrays.toString(ch));

        boolean[] booleans = new boolean[2];
        booleans[0] = true;
        booleans[1] = false;

        System.out.println("Boolean: "+Arrays.toString(booleans));







    }
}
