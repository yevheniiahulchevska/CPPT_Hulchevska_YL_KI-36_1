import java.io.*;
import java.util.*;

public class Lab2HulchevskaKI_36 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        int f=0;
        int s = 0;
        int n;//for checking odd or pair
        char[][] arr;//array of chars
        String filler;//filler symbol
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        n = nRows % 2;
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            if(i==0 || i==nRows-1) {
                arr[i] = new char[nRows];
            }
            else if(n == 0 && (i == (nRows/2-1)||i == nRows/2)){
                arr[i] = new char[4];
                }
            else if(n == 1 && i == (nRows-1)/2){
                arr[i] = new char[3];
            }
            else {
            arr[i] = new char[2];
            }
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        exit:
        {
            if (filler.length() == 1) {
//output
                for (int i = 0; i < nRows; i++) {
                    for (int j = 0; j < nRows; j++) {
                            if(i==0 || i==nRows-1) {
                                arr[i][j] = (char) filler.codePointAt(0);
                                System.out.print(arr[i][j] + " ");
                                fout.print(arr[i][j] + " ");
                                f++;
                            }
            //pair
                            else if(n == 0){
                                if((i == (nRows/2-1)||i == nRows/2)&&j==0){
                                for(int k =0;k<1;k++){
                                    arr[i][k]=(char) filler.codePointAt(0);
                                    System.out.print(arr[i][k] + " ");
                                    fout.print(arr[i][k] + " ");
                                    }
                                f++;
                                }
                                else if((i == (nRows/2-1)||i == nRows/2)&& (j ==(nRows/2-1))){
                                    for(int k =1;k<2;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if((i == (nRows/2-1)||i == nRows/2)&& (j == (nRows/2))){
                                    for(int k =2;k<3;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if((i == (nRows/2-1)||i == nRows/2)&&j==(nRows-1)){
                                    for(int k =3;k<4;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if(((i>0 && i<(nRows/2-1))||(i>(nRows/2) && i<(nRows-1)))&&j==0){
                                    for(int k =0;k<1;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if(((i>0 && i<(nRows/2-1))||(i>(nRows/2) && i<(nRows-1)))&&j==(nRows-1)){
                                    for(int k =1;k<2;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else{
                                    System.out.print("  ");
                                    fout.print("  ");
                                }
                            }
            //odd
                            else if(n == 1) {
                                if(i == (nRows-1)/2 && j == 0){
                                     for(int k =0;k<1;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if(i == (nRows-1)/2 && j == (nRows-1)/2 ){
                                    for(int k =1;k<2;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                else if(i == (nRows-1)/2 && j==(nRows-1)){
                                    for(int k =2;k<3;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }
                                    else if(((i>0 && i<(nRows-1)/2)||(i>(nRows-1)/2 && i<(nRows-1)))&&j==0 ){
                                       for(int k = 0; k<1;k++){
                                            arr[i][k]=(char) filler.codePointAt(0);
                                            System.out.print(arr[i][k] + " ");
                                            fout.print(arr[i][k] + " ");
                                        }
                                    f++;
                                    }
                                else if(((i>0 && i<(nRows-1)/2)||(i>(nRows-1)/2 && i<(nRows-1)))&&j==(nRows-1)){
                                    for(int k = 0; k<1;k++){
                                        arr[i][k]=(char) filler.codePointAt(0);
                                        System.out.print(arr[i][k] + " ");
                                        fout.print(arr[i][k] + " ");
                                    }
                                    f++;
                                }

                                    else{
                                        System.out.print("  ");
                                        fout.print("  ");
                                    }
                            }
                    }
                    System.out.println();
                    fout.println();
                }

            System.out.println("Array elements: " + f);
            } else if (filler.length() == 0) {
                System.out.print("\nНе введено символ заповнювач");
                break exit;
            } else {
                System.out.print("\nЗабагато символів заповнювачів");
                break exit;
            }
            fout.flush();
            fout.close();
        }
    }
}