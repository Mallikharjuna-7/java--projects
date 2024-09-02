package com.google.voteridapplication.things;

public class Voters {

	public String voter_names[] = new String[4];
	public int index = 0;
	
	public int votersLength() {
		return voter_names.length;
	}
		
	public void saveVoters(String voter) {
		System.out.println("Voter: "+voter);
		if(this.index < votersLength()) {
			voter_names[index]=voter;
			index++;
			System.out.println("Array is Not full");
		}else {
			System.out.println("Array is full");
		}
	}
	public void printVoters() {
		for(int index = 0; index < votersLength(); index++) {
		System.out.println("-"+voter_names[index]);
		}
	}
	public String updateVoters(String old_voter, String new_voter) {
		for(int index = 0; index < votersLength(); index++) {
			if(voter_names[index] == old_voter) {
				voter_names[index] = new_voter;
				return "Voter Updated Successfully";
			}
		}
		return "Voter Not Updated";
	}
	public String deleteVoter(String delete) {
		for(int index = 0; index < votersLength(); index++) {
			if(voter_names[index] == delete) {
				voter_names[index] = null;
				return "Voter deleted Successfully";
			}
		}
		return "Voter Not deleted";
	}
	public String searchVoter(String search_name) {
		for(String name : voter_names) {
			if(name == search_name) {
			return "Search Result found:"+search_name;
			}
		}
		return "Search Result not found";
	}
		
}