package com.array.targetlogic.service;

/*need to find the target value in given array
 * array[]={5,2,3,1,7,8,2,3,4};
 * target value = 7
 * output =[5,2],[3,1,3]*/
public class Target {

	public static void main(String[] args) {
		
		 int values[] = {5,2,3,1,7,8,2,3,4};
		 int target = 7;
		
		for(int i =0; i < values.length;i++ ) {
			for(int j = i+1; j< values.length; j++ ) {
				if(values[i]+values[j] == target) {
					System.out.println("["+values[i]+","+values[j]+"]");
				}
			}
		}
		for(int i =0; i < values.length;i++ ) {
			for(int j = i+1; j< values.length; j++ ) {
				for(int k = j+1; k< values.length; k++) {
					if(values[i]+values[j]+values[k] == target) {
						System.out.println("["+values[i]+","+values[j]+","+values[k]+"]");
					}
				}
			}
		}

	}

}
