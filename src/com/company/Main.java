package com.company;

import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static HashMap<String, ArrayList<Country>> country = new HashMap<>();

    public static void main(String[] args) throws Exception {

        File f = new File("countries.txt");
        Scanner fileScanner = new Scanner(f);


        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Country c = new Country(columns[0], columns[1]);

            if(country.containsKey(c.name.substring(0, 1))) {
                ArrayList<Country> a = country.get(c.name.substring(0, 1));
                a.add(c);
            } else {
                ArrayList<Country> a = new ArrayList<>();
                a.add(c);
                country.put(c.name.substring(0, 1), a);
            }
        }

        //userLetter();
        saveCountry(userLetter());

    }


    public static String userLetter() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of a country to see list: ");
        String inputLetter = scanner.nextLine();

        if(inputLetter.isEmpty()) {
            throw new Exception("You must enter a letter!");
        }

        return inputLetter;

    }

    public static void saveCountry(String inputLetter) throws Exception {

        File f = new File(inputLetter + "_Countries.txt");
        FileWriter fw = new FileWriter(f);

        //pull arraylist out of hashmap and iterate through it to write every country out to file
        ArrayList<Country> letter = country.get(inputLetter.toUpperCase());

        int i = 0;


        for (Country a : letter) {

            i++;

            fw.append(a.name + "\n");
            System.out.println(a.name + " | " + a.abbrevation);
        }

        fw.close();

    }

}
