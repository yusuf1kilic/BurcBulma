package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month,day;
        String burc="";
        boolean isError=false;

        Scanner input=new Scanner(System.in);
        System.out.print("Doğduğunuz ay :");
        month= input.nextInt();;

        System.out.println("Doğduğunuz gün :");
        day= input.nextInt();

        switch (month){
            case 1:
                if (day>=1 && day<=31){
                    if(day<22){
                        burc="Oglak";

                    }else{
                        burc="kova";
                    }
                }else{
                    isError=true;

                }
                break;
            case 2:
                if (day>=1 && day<=28){
                    if (day<20){
                        burc="kova";
                    }else {
                        burc="balik";

                    }
                }else{
                    isError=true;
                }
                break;
            default:
                isError=true;
        }


    }
}
