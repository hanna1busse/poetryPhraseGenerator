package Prompts;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Random;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;
public class AdjNNAdj {
    void mix(){
       try {
      File myObj = new File("AdjN_NAdj.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        int length=0;
        
        try {
      File adjList = new File("/storage/emulated/0/JavaNIDE/prompts/WritingPrompts/src/Prompts/adjs.txt");
      Scanner myReader = new Scanner(adjList);
      
      while (myReader.hasNextLine()) {
     							String line=myReader.nextLine();
                length++;			
      }
            myReader.close();
            } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        String[] adjs = new String[length];
        try {
            File adjList = new File("/storage/emulated/0/JavaNIDE/prompts/WritingPrompts/src/Prompts/adjs.txt");
            Scanner myReader2 = new Scanner(adjList);
           
          int i=0;
            while (myReader2.hasNextLine()) {
      adjs[i] = myReader2.nextLine();
        System.out.println(adjs[i]);
                i++;
      }
      myReader2.close();
       
            
            
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        ///////
        length=0;
        try {
      File nounList = new File("/storage/emulated/0/JavaNIDE/prompts/WritingPrompts/src/Prompts/nouns.txt");
      Scanner myReader = new Scanner(nounList);
      
      while (myReader.hasNextLine()) {
     							String line=myReader.nextLine();
                length++;			
      }
            myReader.close();
            } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        String[] nouns = new String[length];
        try {
            File nounList = new File("/storage/emulated/0/JavaNIDE/prompts/WritingPrompts/src/Prompts/nouns.txt");
            Scanner myReader2 = new Scanner(nounList);
           
          int i=0;
            while (myReader2.hasNextLine()) {
      nouns[i] = myReader2.nextLine();
       // System.out.println(nouns[i]);
                i++;
      }
      myReader2.close();
       
            
            
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
     ///////   
        try { FileWriter myWriter = new FileWriter("AdjN_NAdj.txt"); 
           Random rand= new Random();
            for(int j=0;j<adjs.length;j++){
                  int ran=rand.nextInt(length);  
            myWriter.write(adjs[j]+" "+nouns[ran]+"\n"); 
             
            System.out.println("Successfully wrote to the file."); 
       } 
            myWriter.write("-------------------------\n");
            for(int j=0;j<adjs.length;j++){
                  int ran=rand.nextInt(length);  
            myWriter.write(nouns[ran]+" "+adjs[j]+"\n"); 
            System.out.println("Successfully wrote to the file."); 
       } 
            myWriter.close();
        } catch (IOException e) {
            
            System.out.println("An error occurred while writing to the fille."); 
            e.printStackTrace(); }
    }  
    }

