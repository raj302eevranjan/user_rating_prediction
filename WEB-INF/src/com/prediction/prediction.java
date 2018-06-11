package com.prediction;
import java.util.ArrayList;
public class prediction
{
	private int user;
	private int movie;
	
	static String datasetname="";
	public static ArrayList prediclist=new ArrayList();
	public prediction(int u, int m){
		user = u;
		movie = m;
	}
	public int predict()
	{
		Integer[] user_ratings = user_rated_value.user_ratings(user);

		ArrayList<Double> similarity = new ArrayList<Double>();
		ArrayList<Integer> ratings = new ArrayList<Integer>();
		
		for(int i = 0; i < user_ratings.length; i++)
		{
			if(user_ratings[i] != 0)
			{
			    item_based_cf ibc = new item_based_cf(i + 1, movie);
			    double sim = ibc.pearson_sim();
			    similarity.add(sim);
			    ratings.add(user_ratings[i]);
			}
		}
		System.out.println("Finish computing similarites!");
		for(int i = 0; i < ratings.size(); i++){
			System.out.println(similarity.get(i));}
		
		
		double upper = 0, lower = 0;
		for(int i = 0; i < ratings.size(); i++){
			upper += similarity.get(i) * ratings.get(i);
			lower += Math.abs(similarity.get(i));
		}
		int predict_data = (int) (upper / lower);
		return predict_data;
	}
	
	public int recommendation(String root){
		ArrayList<String[]> test = read_file.readInData(datasetname, '\t');
		ArrayList<Integer[]> predicts = new ArrayList<Integer[]>();
		double val=0.3,val1=5;
		for(int i = 0; i < test.size(); i++)
		{
			String s[]=test.get(i)[0].split(",");
			if(Integer.parseInt(s[0]) == user)
			{
				int m=(int)Float.parseFloat(s[1]);
				prediction p = new prediction(user, m);
				int pp = p.predict();
				
				int n=(int) Float.parseFloat(s[2]);
				Integer[] pair = {pp, n, m};
				predicts.add(pair);
			}
		}
		
	    double upper = 0;
		for(int i = 0; i < predicts.size(); i++)
		{
			upper += Math.pow((predicts.get(i)[1] - predicts.get(i)[0]), 2);
		}
		double predictVal = Math.sqrt(upper / predicts.size());
	
		System.out.println("prediction: " + predictVal);
		
		
		prediclist.add(predictVal);
		ArrayList<Integer[]> predict_sorting = new ArrayList<Integer[]>();
		for(int i = 0; i < predicts.size(); i++){
			Integer[] pair = {predicts.get(i)[0], predicts.get(i)[2]};
			if(predict_sorting.size() == 0)
				predict_sorting.add(pair);
			else if(predicts.get(i)[0] < predict_sorting.get(0)[0])
				predict_sorting.add(0, pair);
			else if(predicts.get(i)[0] > predict_sorting.get(predict_sorting.size() - 1)[0])
				predict_sorting.add(pair);
			else{
				for(int j = 0; j < predict_sorting.size() - 1; j++){
					if(predict_sorting.get(j)[0] < predicts.get(i)[0] && predict_sorting.get(j + 1)[0] >= predicts.get(i)[0])
						predict_sorting.add(j + 1, pair);
				}
			}
		}
		System.out.println("sorting prediction is done! ");
		for(Integer[] values:predict_sorting)
			for(Integer Predict_val:values)
	        	System.out.println(Predict_val);

		
		ArrayList<Integer> recommend = new ArrayList<Integer>();
		int Item_Id=0;
		ArrayList<String[]> movies = read_file.readInData(root+"/Item_Name.csv", '|');
		ArrayList<String[]> users = read_file.readInData(datasetname, '|');
		
		System.out.println("prediction size is "+predict_sorting.size());
	
			for(int i = 0; i < predict_sorting.size(); i++){
				Item_Id = predict_sorting.get(i)[1];	
				recommend.add(Item_Id);
			}	
		
		for(int i = 0; i < recommend.size(); i++)
			System.out.println(recommend.get(i));
		return Item_Id;
	}
	
	public static int Item_predict(int id,String root)
	{
		
		int item_id=0;
		boolean flag=false;
		datasetname=root+"/Item_Hist_rate.csv";
		prediction p = new prediction(id,1);
		item_id=p.recommendation(root);
		System.out.println("predicted id is "+item_id);
		return item_id;
}
	
	public static void main(String[] args) {
		prediction.Item_predict(2,"");
	}
}
