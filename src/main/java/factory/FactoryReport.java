package factory;

import br.edu.ifpb.report.controller.*;

public class FactoryReport {
	
	public Report getReport(String type) {
		
		if (type.equals("expense")) {
			return new ExpenseReport();
        } else {
            return new TaxReport();
        }
	}
}
