package sk.akademiasovy.tipos;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by host on 30.1.2018.
 */
public class Tipos {


    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public Tipos() {
        arr = new int[5];
    }

    public void generate(){
        //generovanie 5 roznych nahodnych cisel <1;35>
        Random random=new Random();
        arr[0]=random.nextInt(35)+1;
        int k,i=1;
        boolean unique=true;
        while(i<5){
            arr[i]=random.nextInt(35)+1;
            unique=true;
            for(k=0;k<i;k++){
                if(arr[i]==arr[k])
                    unique=false;
            }
            if(unique==true){
                i++;
            }

        }
        Arrays.sort(arr);
    }
    public void print(){
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
