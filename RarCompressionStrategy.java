import java.util.ArrayList;
import compStrat.*;  //importing the package from CompressionStrategy interface

public class RarCompressionStrategy implements CompressionStrategy //Child class of CompressionStrategy

{
	public void compressFiles(ArrayList files) //It compresses the files in rar format. Overriding the compressFiles() method

		{
			System.out.println("Files have been compressed using rar approach");
		} //end of compressFiles method

} //end of RarCompressionStrategy class
