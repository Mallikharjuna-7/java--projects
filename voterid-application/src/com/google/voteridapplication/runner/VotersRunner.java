package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Voters;

public class VotersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voters ap = new Voters();
		
		ap.saveVoters("Mallikharjun");
		ap.saveVoters("Ganesh");
		ap.saveVoters("Siddu");
		ap.saveVoters("Nithin");
		ap.saveVoters("Rajesh");
		
		ap.printVoters();
		
		String updateResult = ap.updateVoters("Ganesh", "Gowtham");
		System.out.println("Update Result: "+updateResult);
		ap.printVoters();
		
		String deleteResult = ap.deleteVoter("Siddu");
		System.out.println("Delete Result: "+deleteResult);
		ap.printVoters();
		
		String searchResult = ap.searchVoter("Nithin");
		System.out.println("Search Result: "+searchResult);
	}

}
