package org.reactome.server.search.domain;

import java.util.List;
import java.util.Map;

/**
 * Internal Model for Reactome Entries
 * @author Florian Korninger (fkorn@ebi.ac.uk)
 * @version 1.0
 */
@SuppressWarnings("unused")
public class Query {

    private String query;
    private String filter; //fq
    private List<String> species;
    private List<String> types;
    private List<String> keywords;
    private List<String> compartment;
    private Integer start;
    private Integer rows;
    private Map<String, String> reportInfo; // extra information for report, useragent, ip, etc

    public Query() {

    }

    public Query(String query, List<String> species, List<String> types, List<String> compartment, List<String> keywords) {
        this.query = query;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
    }

    public Query(String query, List<String> species, List<String> types, List<String> compartment, List<String> keywords, Map<String, String> reportInfo) {
        this.query = query;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
        this.reportInfo = reportInfo;
    }

    public Query(String query, String filter, List<String> species, List<String> types, List<String> compartment, List<String> keywords) {
        this.query = query;
        this.filter = filter;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
    }

    public Query(String query, String filter, List<String> species, List<String> types, List<String> compartment, List<String> keywords, Map<String, String> reportInfo) {
        this.query = query;
        this.filter = filter;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
        this.reportInfo = reportInfo;
    }

    public Query(String query, List<String> species, List<String> types, List<String> keywords, List<String> compartment, Integer start, Integer rows) {
        this.query = query;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
        this.start = start;
        this.rows = rows;
    }

    public Query(String query, String filter, List<String> species, List<String> types, List<String> keywords, List<String> compartment, Integer start, Integer rows) {
        this.query = query;
        this.filter = filter;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
        this.start = start;
        this.rows = rows;
    }

    public Query(String query, String filter, List<String> species, List<String> types, List<String> keywords, List<String> compartment, Integer start, Integer rows, Map<String, String> reportInfo) {
        this.query = query;
        this.filter = filter;
        this.species = species;
        this.types = types;
        this.keywords = keywords;
        this.compartment = compartment;
        this.start = start;
        this.rows = rows;
        this.reportInfo = reportInfo;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<String> getCompartment() {
        return compartment;
    }

    public void setCompartment(List<String> compartment) {
        this.compartment = compartment;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Map<String, String> getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(Map<String, String> reportInfo) {
        this.reportInfo = reportInfo;
    }
}
