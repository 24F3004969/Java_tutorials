/*
package org.java_tutorials.util;



import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.File;
import java.io.IOException;



public class MyPdfMerger {
    public static void main(String[] args)
            throws IOException
    {

        // loading all the pdf files we wish to merge

        File file1 = new File( "/Users/hilal/Downloads/Satyajit Ray - The Complete Adventures of Feluda Vol 1. 1-Penguin Books.pdf");
        File file2 = new File(
                "/Users/hilal/Downloads/hmbs.pdf");

        // Instantiating PDFMergerUtility class

        PDFMergerUtility obj = new PDFMergerUtility();

        // Setting the destination file path

        obj.setDestinationFileName(
                "/Users/hilal/Downloads/Satyajit Ray - The Complete Adventures of Feluda.pdf");

        // Add all source files, to be merged

        obj.addSource(file1);
        obj.addSource(file2);

        // Merging documents

        obj.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());

        System.out.println(
                "PDF Documents merged to a single file");
    }
}
 */