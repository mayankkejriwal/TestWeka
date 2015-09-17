package testWeka;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
 
import java.io.File;
 
public class TestCSVARFF {
  /**
   * takes 2 arguments:
   * - CSV input file
   * - ARFF output file
   */
	
	static String prefix="/host/heteroDatasets/eswc1/ACM-DBLP/";
	
  public static void main(String[] args) throws Exception {
    String csv=prefix+"ACM.csv";
    String arff=prefix+"arff1.csv";
 
    // load CSV
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File(csv));
    Instances data = loader.getDataSet();
 
    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File(arff));
    saver.setDestination(new File(arff));
    saver.writeBatch();
  }
}
