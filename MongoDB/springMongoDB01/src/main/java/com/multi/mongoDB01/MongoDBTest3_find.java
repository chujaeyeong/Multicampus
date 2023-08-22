package com.multi.mongoDB01;

import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest3_find {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1. MongoDB 연결 성공!");
		
		// 2) shop2로 연결하기 
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");
		
		// 3) member.collection 에 연결 
		MongoCollection<Document> collection = database.getCollection("memo");
		System.out.println("3. memo Collection 연결 성공!");
		
		FindIterable<Document> list = collection.find(); // 전체검색 
		ArrayList<MemoVO> result = new ArrayList<MemoVO>();
		for (Document document : list) {
			System.out.println(document);
			MemoVO bag = new MemoVO();
			bag.setName(document.getString("name"));
			bag.setAge(document.getDouble("age"));
			bag.setOffice(document.getString("office"));
			bag.setTel(document.getString("tel"));
			result.add(bag);
		}
		System.out.println(result); // arraylist
		
	}
}