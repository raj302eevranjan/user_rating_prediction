package com.prediction;
import java.util.ArrayList;
import java.util.HashMap;
public class item_based_cf {
	
	
	private int movieID1, movieID2;
	private Integer[] ratings1;
	private Integer[] ratings2;
	public item_based_cf(int id1, int id2){
		movieID1 = id1;
		movieID2 = id2;
		HashMap<Integer, Integer[]> movie_rate_table = user_rated_value.movie_ratings();
		ratings1 = movie_rate_table.get(movieID1);
    	ratings2 = movie_rate_table.get(movieID2);
	}
	
    public ArrayList<Integer> commonUser(){
    	ArrayList<Integer> user_group = new ArrayList<Integer>();
    	for(int i = 0; i < ratings1.length; i++){
    		if(ratings1[i] != 0 && ratings2[i] != 0)
    			user_group.add(i);
    	}
    	return user_group;
    }
    public double[] average_rating(){
    	int[] count = {0, 0};
    	double[] avg = {0, 0};
    	for(int i = 0; i < ratings1.length; i++){
    		if(ratings1[i] != 0){
    			count[0]++;
    			avg[0] += ratings1[i];
    		}
    	}
    	for(int i = 0; i < ratings2.length; i++){
    		if(ratings2[i] != 0){
    			count[1]++;
    			avg[1] += ratings2[i];
    		}
    	}
    	avg[0] = avg[0] / count[0];
    	avg[1] = avg[1] / count[1];
    	return avg;
    }
    
    
    public double pearson_sim()
    {
    	ArrayList<Integer> user_group = commonUser();
    	double[] avg_rate = average_rating();
    	double upper = 0, lower1 = 0, lower2 = 0;
    	for(int i = 0; i < user_group.size(); i++)
    	{
    		upper += (double)(ratings1[i]) - avg_rate[0] * (ratings2[i] - avg_rate[1]);
    		lower1 += Math.pow((ratings1[i] - avg_rate[0]), 2);
    		lower2 += Math.pow((ratings2[i] - avg_rate[1]), 2);
    	}
    	double sim = upper / (Math.sqrt(lower1) * Math.sqrt(lower2));
    	return sim;
    }
    public static void main(String[] args){
    	item_based_cf sim = new item_based_cf(1, 29);
    	System.out.println(sim.pearson_sim());
    }
}

