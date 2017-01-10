package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // read all the posts into memory
        File f = new File("countries.txt");
        Scanner fileScanner = new Scanner(f);

        //needs new and a new version Hashmap specifically

        HashMap<String, ArrayList<Country>>

        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Country country = new Country(columns[0], columns[1]);
        }

    }
}
