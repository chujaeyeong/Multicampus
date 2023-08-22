package com.multi.mongoDB01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_insert3 {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost", 27017);
		System.out.println("1. MongoDB 연결 성공!");

		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");

		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member Collection 연결 성공!");
		
		// java 코드에서 자동 import => ctrl + shift + O

		Document doc = new Document();
		doc.append("id", "apple4");
		doc.append("pw", "1234");
		doc.append("name", "apple4");
		doc.append("tel", "apple4");
		
		Document doc2 = new Document();
		doc2.append("id", "apple5");
		doc2.append("pw", "1234");
		doc2.append("name", "apple5");
		doc2.append("tel", "apple5");
		
		// ArrayList<Document> list = new ArrayList<Document>();
		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc2);
		
		collection.insertMany(list);
		System.out.println("4. member Collection에 insertMany 성공!");
	}
}