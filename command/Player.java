package command;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

public class Player {
    public Player() {
    System.out.println("the Player is born");
    }

    /**
     * Reads and prints out the jumping man
     */
    public void jump()  {
    
    try {
    File jump = new File("jump.txt");
    Scanner readFile = new Scanner(jump);
    while(readFile.hasNextLine()) {
        String toPrint[] = new String [6];
        for(int i = 0; i < toPrint.length; ++i) {
        toPrint[i] = readFile.nextLine();
        }
        readFile.close();
        for (int i = 0; i <toPrint.length; ++i) { 
        System.out.println(toPrint[i]);
            }
            sleep(3);
            clear();
        }
    }catch(FileNotFoundException e) {
    System.out.println("an error occurred");
       }
    }

    /**
     * reads and prints out the fire.txt
     */
    public void fire() {
        
        try {
        File fire = new File("fire.txt");
        Scanner readFile = new Scanner(fire);
        while(readFile.hasNextLine()) {
            String toPrint[] = new String [3];
            for(int i = 0; i < toPrint.length; ++i) {
            toPrint[i] = readFile.nextLine();
            }
            readFile.close();
            for (int i = 0; i <toPrint.length; ++i) { 
            System.out.println(toPrint[i]);
                }
                sleep(6);
                clear();
            }
        }catch(FileNotFoundException e) {
        System.out.println("an error occurred");
           }
    }

    public void runForward() {
        
        try{
        File run = new File("01-Runtime-Error-Repository/command/run.txt");
        Scanner read = new Scanner(run);
        while(read.hasNextLine()) {
            
            for(int i = 0; i < 3; ++i) {
            String toPrint = read.nextLine();
            System.out.println(toPrint);
            }
            
                sleep(3);
                clear();
            }
            read.close();
        }catch (FileNotFoundException s) {
            System.out.println(" error no file");
        }
    }

/**
 * private method from portia to make consol sleep
 * @param num number of second to sleep
 */
private void sleep(int num) {
    try {
        TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
        System.out.println("Timmer error");
    }

}
/**
 * private method from portia to clear console
 */
private void clear() {
    System.out.print("\033[H\033[2J");
    }
}