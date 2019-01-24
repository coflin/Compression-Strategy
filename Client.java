import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import compStrat.*;
import compCon.*;

public class Client
{
public static void main(String[] args) //main method
  { 
  ArrayList fileList=new ArrayList(); //Array being initialized
  fileList.add(new File("/root/Desktop/Java/Answer1.java")); //Files that need to be compressed added to the array
  fileList.add(new File("/root/Desktop/Java/Answer2.java"));
  fileList.add(new File("/root/Desktop/Java/Answer3.java"));
  fileList.add(new File("/root/Desktop/Java/Answer4.java"));
  fileList.add(new File("/root/Desktop/Java/Answer5.java"));

  CompressionContext ctx = new CompressionContext(); //CompressionContext object

  while(true){
  System.out.println("Enter the type of compression you want to use : ");
  Scanner sc=new Scanner(System.in);
  String compression=sc.nextLine();

  if(compression.equalsIgnoreCase("zip"))
	{
	   ctx.setCompressionStrategy(new ZipCompressionStrategy()); //Method of CompressionContext being called with ZipCompressionStrategy object.
	   ctx.createArchive(fileList); //createArchive() method being called with the list of files in array as the parameter
	   break;
	} //end of if

  else if(compression.equalsIgnoreCase("rar"))
	{
	   ctx.setCompressionStrategy(new RarCompressionStrategy()); //Method of CompressionContext being called with RarCompressionStrategy object.
	   ctx.createArchive(fileList); //createArchive() method being called with the list of files in array as the parameter
	   break;
	} //end of else if

  else
	{
            System.out.println("Enter a valid compression strategy :( \n ");
	}  //end of else 

	  } //end of while

 } //end of main

} //end of Client class
