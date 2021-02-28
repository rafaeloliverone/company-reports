package br.edu.ifpb;

import br.edu.ifpb.report.controller.Report;
import br.edu.ifpb.report.service.ReportService;
import factory.*;

public class Main {

    public static void main(String[] args) {
        FactoryReport factoryReport = new FactoryReport();
        
        String type = "expense";
        String typeTwo = "taxes";
        
        Report instanceType = factoryReport.getReport(type);
        Report instanceTypeTwo = factoryReport.getReport(typeTwo);
        
        instanceType.generate();
        instanceTypeTwo.generate();
        
        
    }

}
