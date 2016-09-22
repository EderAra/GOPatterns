package termoGO;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class AlgoritmoApriori {

	public void AplicaAlgoritmo(String caminho) throws Exception {

		DataSource source = new DataSource(caminho);
		Instances d = source.getDataSet();

		Apriori ap = new Apriori();

		ap.buildAssociations(d);

		System.out.println(ap + "" + d);
	}
}
