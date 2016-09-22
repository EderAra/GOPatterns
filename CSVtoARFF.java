package termoGO;

import java.io.File;
import java.io.IOException;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

public class CSVtoARFF {

	public void ConvertCSVtoARFF(String diretorioDoCSV, String diretorioDoARFF) throws IOException {
		
		CSVLoader loadCsv = new CSVLoader();
		loadCsv.setSource(new File(diretorioDoCSV));
		Instances data = loadCsv.getDataSet();

		ArffSaver save = new ArffSaver();
		save.setInstances(data);
		save.setFile(new File(diretorioDoARFF));
		save.writeBatch();

	}

}
