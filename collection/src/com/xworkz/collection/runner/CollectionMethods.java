package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

	public static void main(String[] args) {
		
	    //Store CollegeNames by using collection
		//add
		Collection<String> collegeNames = new ArrayList<String>();
		collegeNames.add("Kakinada Institute of Technology and Science");
		collegeNames.add("Andhra University College of Engineering");
        collegeNames.add("Pragathi Engineering College");
        collegeNames.add("Jawaharlal Nehru Technological University");
        collegeNames.add("Aditya Engineering College");
        collegeNames.add("Goverment College of Engineering and Technology");
        collegeNames.add("Narayana Engineering College");
        collegeNames.add("Godavari Institute  of Engineering and Technology");
        collegeNames.add("Siddharth Institute of Science and Technology");
        collegeNames.add("Pydah College of Engineering and Technology");
        
        System.out.println("college names :"+collegeNames);
        
        Collection<String> newCollegeNames = new ArrayList<String>();
        newCollegeNames.add("ANKU College of Science and Engineering");
        newCollegeNames.add("Raja Mahendra College of Engineering");
        newCollegeNames.add("Sri Venkateswara Institute of Technology");
        newCollegeNames.add("SRKR Engineering College");
        newCollegeNames.add("Lenora Engineering College");
        
        //add all
        collegeNames.addAll(newCollegeNames);
        System.out.println("After adding new colleges :"+collegeNames);
        
        //size
        System.out.println("Size :"+collegeNames.size());
        
        //contains
        boolean isContainsAndhra = collegeNames.contains("Andhra University College of Engineering");
        System.out.println("isContains Andhra University :"+isContainsAndhra);
        
        //contains all
        Collection<String> check = new ArrayList<String>();
        check.add("Ideal College of Engineering");
        check.add("Kakinada Institute of Technology and Science");
        check.add("Godavari Institute  of Engineering and Technology");
        
        boolean isContains = collegeNames.containsAll(check);
        System.out.println("isContains All :"+isContains);
        
        //remove
        collegeNames.remove("Pragathi Engineering College");
        System.out.println("After Removing Pragathi :"+collegeNames);
        
        //remove all
        collegeNames.removeAll(newCollegeNames);
        System.out.println("After Removing All new Colleges :"+collegeNames);
        
        //toArray
        Object[] collegeArray = collegeNames.toArray();
        System.out.println("CollegeNames Array :");
        for(Object college : collegeArray) {
        	System.out.println("- "+college);
        }
        
        //clear
        collegeNames.clear();
        System.err.println("After clear :"+collegeNames);
        
        
        System.out.println("--------------------------------");
        //Store CompanyNames by using collection
        //add
        Collection<String> companyNames = new ArrayList<String>();
        companyNames.add("Google");
        companyNames.add("Infosys");
        companyNames.add("Wipro");
        companyNames.add("Flipkart");
        companyNames.add("Swiggy");
        companyNames.add("Amazon");
        companyNames.add("Oracle");
        
        System.out.println("Company Names :"+companyNames);
        
        Collection<String> newCompanyNames = new ArrayList<String>();
        newCompanyNames.add("Microsoft");
        newCompanyNames.add("Accenture");
        newCompanyNames.add("TCS");
        newCompanyNames.add("Deloitte");
        
        //add all
        companyNames.addAll(newCompanyNames);
        System.out.println("After adding new Companies :"+companyNames);
        
        //size
        System.out.println("Size :"+companyNames.size());
        
        //contains
        boolean isContainAmazon = companyNames.contains("Amazon");
        System.out.println("isContains Amazon :"+isContainAmazon);
        
        //contains all
        boolean isContainsAll = companyNames.containsAll(newCompanyNames);
        System.out.println("isContains All :"+isContainsAll);
        
        //remove
        companyNames.remove("Infosys");
        System.out.println("After Removing Infosys :"+companyNames);
        
        //remove all
        companyNames.removeAll(newCompanyNames);
        System.out.println("After removing all new Companies :"+companyNames);
        
        //toArray
        Object[] companiesArray = companyNames.toArray();
        System.out.println("CompanyNames Array");
        for(Object company : companiesArray) {
        	System.out.println("- "+company);
        }
        
        //clear
        companyNames.clear();
        System.err.println("After clear :"+companyNames);
        
	}

}
