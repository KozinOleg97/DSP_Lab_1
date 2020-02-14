package ru.rsatu;


import org.apache.poi.ss.usermodel.Workbook;

public class Main {

    public static void main(String[] args) {

        Features features = new Features();

        OneDHaar oneDHaar = new OneDHaar();

        double[] sample_1 = {6, 4, 13, 5, 9, 11, 13, 12, 10, 9, 4, 6, 13, 10, 8, 9};

        oneDHaar.inPlaceFastHaarWaveletTransform(sample_1);

        System.out.println("============================");

        oneDHaar.inPlaceFastInverseHaarWaveletTransform(oneDHaar.transformResult.get(oneDHaar.transformResult.size() - 1));

        ExcelHandler excelHandler = new ExcelHandler();
        Workbook newWb = excelHandler.createNewWb();

        newWb = excelHandler.addList(newWb, oneDHaar.transformResult, 0);

        newWb = excelHandler.addList(newWb, oneDHaar.reverseTransformApproximation, 1);

        excelHandler.saveWbToFile(newWb, " Отчёт " + features.getCurTimeStr());


    }

}
