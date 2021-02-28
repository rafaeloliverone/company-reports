package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.ExpenseReport;
import br.edu.ifpb.report.controller.TaxReport;

public class ReportService {

    public void generateReportExpense() {
    	ExpenseReport expenseReport = new ExpenseReport();
    	expenseReport.generate(); 
    }
    
    public void generateReportTax() {
    	TaxReport taxReport = new TaxReport();
    	taxReport.generate();
    }

}
