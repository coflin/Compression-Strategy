import java.util.ArrayList;
import compStrat.*; //importing packages from Compression Strategy Interface

public class ZipCompressionStrategy implements CompressionStrategy        //Child class of CompressionStrategy

  {

	public void compressFiles(ArrayList files)         //It compresses the files in zip format. Overrides the compressFiles() method
  
  	{

		System.out.println("Files have been compressed using zip approach");

 	} 				//end of compressFiles method

   } 					//end of ZipCompressionStrategy class
