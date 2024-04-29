package osproject;

import java.io.FileNotFoundException;

public class MainProject {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("*************************************");
        System.out.println("|     ayman albustanje    201125    |");
        System.out.println("*************************************");

        // Run 
        System.out.println("*********************************************************************\n\n\n\n FCFS ALGORITHM");
        FCFS.fcfs();
        System.out.println("*********************************************************************\n\n\n\n SJF ALGORITHM");
        SJF.sjf();
        System.out.println("*********************************************************************\n\n\n\n ROUND ROBIN ALGORITHM");
        RR.roundRobin();
    }
}
