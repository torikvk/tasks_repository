package org.training.tasks.calculation;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i;
        System.out.println("FACTORIAL"+"\n"+"Enter a number: ");
        i=scan.nextInt();
        System.out.println("Factorial with recursion: "+ getFactorialRecursion(i));
        System.out.println("Factorial with cycle: "+ getFactorialCycle(i));

        System.out.println("FIBONACCI"+"\n"+"Enter a number: ");
        i=scan.nextInt();
        System.out.println("Fibonacci with recursion: ");
        getFibRecursion(1, 1, i);
        System.out.println("\n"+"Fibonacci with cycle: ");
        getFibCycle(i);

        int[] mass;
        mass = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println("\n"+"REVERSE: ");
        for(int el:mass){
            System.out.print(el+" ");
        }
        System.out.println("\n"+"Rotating with recursion: ");
        revMassRecursion(mass,mass.length-1);
        System.out.println("\n"+"Rotating with cycle: ");
        revMassCycle(mass);

        System.out.println("\n"+"SPLITTING: ");
        String str = "asd afas qtye cfhfgh sfsdfsd!";
        System.out.println(str);

        System.out.println("Splitting a string into words:");
        String spl = " ";
        String[] subStr;
        subStr=str.split(spl);
        
        for(String s:subStr){
            System.out.println(s);
        }
        System.out.println("Splitting a string into symbols:");
        char[] strToChar = str.toCharArray();
        for(int j=0;j<strToChar.length;j++){
            System.out.println(strToChar[j]);
        }

    }
      public static int getFactorialRecursion(int i){
        if (i!=1){
           return i* getFactorialRecursion(i-1);
        }
        else return i;
     }
    public static int getFactorialCycle(int i){
        int res =1;
        for (int j=1;j<=i;j++){
            res *=j;
        }
        return res;
    }
    public static void getFibRecursion(int i1, int i2, int num){
        System.out.print(i1 + " ");
        if(num!=0)
        getFibRecursion(i2,i1+i2,num-1);

    }
    public static void getFibCycle(int num){
        int i1=1;
        int i2=1;
        int j;
        System.out.print(i1 + " ");
        for(int n=0;n<num;n++){
            System.out.print(i2 + " ");
            j=i2;
            i2+=i1;
            i1=j;
        }
    }
    static void revMassRecursion(int []mass,int num){
        if (num<0){
            return;
        }
        System.out.print(mass[num]+" ");
        revMassRecursion(mass,num-1);
    }
    static void revMassCycle(int []mass){
        int num = mass.length;
        int massRev[] = new int[num];
        for (int j=0;j<num;j++){
            massRev[j]=mass[num-j-1];
        }
        for (int l=0;l<num;l++){
            System.out.print(massRev[l]+" ");
        }

    }

}
