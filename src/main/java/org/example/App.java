package org.example;

import org.example.abstractfactory.Client;
import org.example.abstractfactory.factory.ICompanyFactory;
import org.example.abstractfactory.factory.DellFactory;
import org.example.abstractfactory.factory.LenovoFactory;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    private static Client client;
    private static ICompanyFactory companyFactory;
    private final static String TITLE = "ABSTRACT FACTORY";
    private final static String OPTION_1 = "1. Dell";
    private final static String OPTION_2 = "2. Lenovo";
    private final static String OPTION_3 = "3. Exit";
    private final static String MESSAGE = "Choose the option";
    private final static String ERROR = "Error";
    private final static String EXIT = "3";
    private final static String EXIT_MESSAGE = "Exit";

    public static void main( String[] args )
    {

        String option = null;

        do {
            System.out.println(TITLE);
            Scanner in = new Scanner(System.in);
            System.out.println(OPTION_1);
            System.out.println(OPTION_2);
            System.out.println(OPTION_3);

            System.out.println(MESSAGE);
           option = in.next();
            switch (option){
                case "1": {
                    companyFactory = new DellFactory();
                    client = new Client(companyFactory);
                    client.generateOrder(8, "i5", 512, "X30", 14,4);
                    break;
                }
                case "2":  {
                    companyFactory = new LenovoFactory();
                    client = new Client(companyFactory);
                    client.generateOrder(8, "i5", 512, "X30", 14,4);
                    break;
                }
                case "3": {

                    System.out.println(EXIT_MESSAGE);
                    break;
                }
                default: System.out.println(ERROR);
            }
            System.out.println("");
        }while(!option.equals(EXIT));
    }
}
