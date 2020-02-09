package ru.rsatu;


public class Main {

    public static void main(String args[]) {

        OneDHaar oneDHaar = new OneDHaar();

        double[] sample_1 = {6, 4, 13, 5, 9, 11, 13, 12, 10, 9, 4, 6, 13, 10, 8, 9};

        oneDHaar.inPlaceFastHaarWaveletTransform(sample_1);

        System.out.println("============================");

        oneDHaar.inPlaceFastInverseHaarWaveletTransform(oneDHaar.transformResult.get(oneDHaar.transformResult.size() - 1));



    }

}
