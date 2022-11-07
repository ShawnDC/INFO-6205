package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UF_Client {

    public static void main(String[] args) {
        for (int n = 100; n <= 6400; n*=2) {
            System.out.println("Objects Number(n):" + n + " ---> Connections(m):" + count(n));
        }
    }

    public static int count(int n) {
        Random random  = new Random();
        UF_HWQUPC uf = new UF_HWQUPC(n);
        int connections = 0;
        while(uf.components() != 1){
            int n1 = random.nextInt(n);
            int n2 = random.nextInt(n);
            uf.connect(n1,n2);
            connections ++;
        }
        return connections;
    }

}
