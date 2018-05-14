package com.prediction;
import java.util.HashMap;
import java.util.ArrayList;
public class user_rated_value {
	private static final int movieNumber = 0;
	private static final int usernum = 0;
	private static ArrayList<String[]> train= read_file.readInData(prediction.datasetname, '\t');
	public static HashMap<Integer, Integer[]> createRating(){
		HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for(int i = 0; i < train.size(); i++)
		{
			
			
			String s[]=train.get(i)[0].split(",");
			if(!map.containsKey(Integer.parseInt(s[0])))
			{
				Integer[] ratings = new Integer[movieNumber];
				for(int j = 0; j < ratings.length; j++)
					ratings[j] = 0;
				map.put(Integer.parseInt(s[0]), ratings);
			}
			Integer[] sublist = map.get(Integer.parseInt(s[0]));
		}
		return map;
	}
	public static Integer[] user_ratings(int user){
		HashMap<Integer, Integer[]> map = createRating();
		return map.get(user);
	}
	public static HashMap<Integer, Integer[]> movie_ratings(){
		HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for(int i = 0; i < train.size(); i++){
			if(!map.containsKey(Integer.parseInt(train.get(i)[1]))){
				Integer[] s = new Integer[usernum];
				for(int n = 0; n < s.length; n++)
					s[n] = 0;
				map.put(Integer.parseInt(train.get(i)[1]), s);
			}
			Integer[] ratings = map.get(Integer.parseInt(train.get(i)[1]));
			ratings[Integer.parseInt(train.get(i)[0]) - 1] = Integer.parseInt(train.get(i)[2]);
		}
		return map;
	}
}

