package org.elasriabdelillah.views;

import java.sql.Date;
import java.util.Scanner;

public class ProgramView {
    static Scanner scanner = new Scanner(System.in);
    public static void menu(){
        while(true){
            System.out.println("list Menu : ");
            System.out.println("1- Authentication");
            System.out.println("2- Management agent");
            System.out.println("3- Management folder");
            System.out.println("0- exit");
            System.out.print("enter choice -> ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("auth");
                    break;
                case 2:
                    System.out.println("1- add agent");
                    System.out.println("2- update agent");
                    System.out.println("3- get all agent");
                    System.out.println("4- get one agent");
                    System.out.println("0- return to menu");
                    System.out.print("choose operation ->");
                    int agentChoice = scanner.nextInt();
                    switch (agentChoice){
                        case 1:
                            System.out.println("logic add");
                            break;
                        case 2:
                            System.out.println("logic update");
                            break;
                        case 3:
                            System.out.println("logic get all");
                            break;
                        case 4:
                            System.out.println("login get one");
                            break;
                        case 0:
                            System.out.println("return to main menu");
                            break;
                        default:
                            System.out.println("enter correct choice");
                            break;
                    }
                case 3:
                    System.out.println("1- add folder");
                    System.out.println("2- update folder");
                    System.out.println("3- get all folder");
                    System.out.println("4- get one folder");
                    System.out.println("5- archive folder");
                    System.out.println("0- return to menu");
                    System.out.print("choose operation ->");
                    int folderChoice = scanner.nextInt();
                    switch (folderChoice){
                        case 1:
                            System.out.println("logic add");
                            System.out.println("enter folder id: ");
                            System.out.println("-> ");
                            String folderId = scanner.nextLine();
                            System.out.println("enter folder name: ");
                            System.out.println("-> ");
                            String folderName = scanner.nextLine();
                            System.out.println("enter deposit date: ");
                            System.out.println("-> ");
                            Date folderDate = Date.valueOf(scanner.nextLine());
                            System.out.println("enter status of folder: ");
                            System.out.println("-> ");

                            break;
                        case 2:
                            System.out.println("logic update");
                            break;
                        case 3:
                            System.out.println("logic get all");
                            break;
                        case 4:
                            System.out.println("login get one");
                            break;
                        case 0:
                            System.out.println("return to main menu");
                            break;
                        default:
                            System.out.println("enter correct choice");
                            break;
                    }
                    break;


            }
        }
    }
}
