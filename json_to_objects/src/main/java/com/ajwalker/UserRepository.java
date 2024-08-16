package com.ajwalker;

import com.google.gson.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepository {
	
	public static List<User> getUsers(int amount){
		List<User> users = new ArrayList<>();
		Scanner sc;
		String jsonData = "";
		try {
			sc = new Scanner(new URL("https://randomuser.me/api/?results="+amount).openStream());
//			System.out.println(sc.nextLine());
			jsonData = sc.nextLine();
//			System.out.println(jsonData);
		}
		catch (
				IOException e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		
		//JSON element içinde { ile başladığı için bir json object olduğunu biliyoruz.
		// Onun için içindeki object'i almak için getAsJsonObject methodunu kullanıyoruz.
		JsonElement jsonElement = JsonParser.parseString(jsonData);
		
		//JsonObject içinde bizi ilgilendiren User dataları results kısmında olduğu için get içinde results kısmında[
		// ile başladığı için bir jsonArray oludğunu biliyoruz. Bu yüzden içindeki jsonArray'i almak için
		// getJsonArray metodunu kullanıyoruz.
		JsonObject asJsonObject = jsonElement.getAsJsonObject();
		JsonArray resultsJsonArray = asJsonObject.get("results").getAsJsonArray();
		for (int i = 0; i <resultsJsonArray.size(); i++){
			JsonObject userJsonObject = resultsJsonArray.get(i).getAsJsonObject();
			User user = gson.fromJson(userJsonObject, User.class);
//			System.out.println("---------------------");
//			System.out.println(user);
//			System.out.println("---------------------");
			users.add(user);
		}
		return users;
	}
	
}