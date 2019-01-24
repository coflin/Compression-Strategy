
package compCon;
import java.util.ArrayList;
import compStrat.*;

public class CompressionContext

{

	CompressionStrategy strategy; //Object of CompressionStrategy
	public void setCompressionStrategy(CompressionStrategy strategy) //Type of Compression Strategy is set in this method

		{
	
			this.strategy = strategy; //Strategy being set according to the client's call.

		} //end of setCompressionStrategy method

//using the strategy
	public void createArchive(ArrayList files)
		{
			strategy.compressFiles(files); //According to the strategy set, the compressFiles() method of the child class of CompressionStrategy is called.
		} //end of createArchive method
} //end of CompressionContext class
