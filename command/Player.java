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
    
        try{
            File run = new File("command/jump.txt");
            Scanner read = new Scanner(run);
            while(read.hasNextLine()) {
                
                for(int i = 0; i < 6; ++i) {
                String toPrint = read.nextLine();
                System.out.println(toPrint);
                }
                
                    sleep(100);
                    clear();
                }
                read.close();
            }catch (FileNotFoundException s) {
                System.out.println(" error no file");
            }
    }

    /**
     * reads and prints out the fire.txt
     */
    public void fire() {
        
      
            try{
                File run = new File("command/fire.txt");
                Scanner read = new Scanner(run);
                while(read.hasNextLine()) {
                    
                    for(int i = 0; i < 3; ++i) {
                    String toPrint = read.nextLine();
                    System.out.println(toPrint);
                    }
                    
                        sleep(100);
                        clear();
                    }
                    read.close();
                }catch (FileNotFoundException s) {
                    System.out.println(" error no file");
            }
            }
    

    public void runForward() {
        
        try{
        File run = new File("command/run.txt");
        Scanner read = new Scanner(run);
        while(read.hasNextLine()) {
            
            for(int i = 0; i < 3; ++i) {
            String toPrint = read.nextLine();
            System.out.println(toPrint);
            }
            
                sleep(100);
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