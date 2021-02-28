package br.edu.ifpb.report.controller;

public abstract class Report {
	
	public final void generate() {
        createDatabaseConnection();
        executeQuery();
        convertToFormat();
    }

    public abstract void createDatabaseConnection();

    public abstract void executeQuery();

    public abstract void convertToFormat();
}
