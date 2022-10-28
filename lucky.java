package org.example;

import java.io.*;
class lucky
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t;
        System.out.print("Enter the number of testcases: ");
        t=Integer.parseInt(br.readLine());
        int[][] arr =new int[t][2];
        for(int i=0;i<t;i++)
        {
            String[] temp =br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(temp[0]);
            arr[i][1]=Integer.parseInt(temp[1]);
        }
        int c;
        int[] out =new int[t];
        for(int i=0;i<t;i++)
        {
            c=0;
            for(int j=arr[i][0];j<=arr[i][1];j++)
            {
                String tempo=String.valueOf(j);
                if(tempo.endsWith("2")||tempo.endsWith("3")||tempo.endsWith("9"))
                    c++;
            }
            out[i]=c;
        }
        for(int i=0;i<t;i++)
            System.out.println(out[i]);
    }
}