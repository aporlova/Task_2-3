

public class TaskMain {


    public static void main(String... args){
        multiplication();
        getFactorial(3); // проверка как считает факториал на небольших числах, результат в double
        int[] arr =  createArr(-999,999);
        factorialForArr(arr);
        searchNumber(arr);
        maxArr(arr);
        minArr(arr);
    }


    static void multiplication(){
        System.out.println();
        System.out.println("_______");
        for(int i = 1; i < 10; i++){
            for(int f = 1; f < 10; f++){
                System.out.print((f) + " * " + i + " = " + (f*i) + "\t");
            }
            System.out.println();
        }
    }

    static int[] createArr(int min,int max){
        System.out.println();
        System.out.println("_______");
        int[] arr = new int[30];
        for (int i = 0; i <30; i ++){
            arr[i]= (int)(Math.random() * ((max - min) + 1) + min);
            System.out.print(arr[i] + "\t");
        } System.out.println();
        return arr;
    }


    static void factorialForArr(int[] arr){
        System.out.println();
        System.out.println("_______");
        for (int i= 0;i< arr.length;i++){
            if (arr[i]>0){
                getFactorial(arr[i]);
            }
        }
    }

    static void getFactorial(int var){
        double factorial = 1; //double потому что большое число
                for (int i = 1; i <= var ; i++){
                    factorial = factorial*i;
                } System.out.print("!"+var+ " = " + (factorial + "\t"));
    }


    static void searchNumber(int[] arr){
        System.out.println();
        System.out.println("_______");
        for (int i = 0; i < arr.length; i++){
            if((arr[i]*10!=arr[i]*10%100) && arr[i] ==arr[i]%100){
               if (arr[i]%2==0){
                   System.out.print(arr[i] + " : chetnoe delu na 2 = " + arr[i]/2 + ";" + "\t");
               } else {
                   System.out.print(arr[i] + " - nechetnoe umnoghau na 3 = " + arr[i]*3 + ";" + "\t");
               }

            }
        }
    }


    static void maxArr(int[] arr){
        System.out.println();
        System.out.println("_______");
        int max = -999;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]%100!=arr[i] &&  arr[i] == arr[i]%1000 && i%2 != 0) {
                if (arr[i] > max){
                    max = arr[i];
                }
            }
        }
        System.out.println((max) + " : max number");
    }


    static void minArr(int[] arr){
        System.out.println();
        System.out.println("_______");
        int min = 999;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]%100!=arr[i] &&  arr[i] == arr[i]%1000 && i%2 == 0) {
                if (arr[i] < min){
                    min = arr[i];
                }
            }
        }
        System.out.println((min) + " : min number");
    }

}

