package com.multi.mongoDB01;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_delete2 {

	public static void main(String[] args) {
		// 1) MongoDB 프로그램에 연결하자.
		MongoClient client = new MongoClient("localhost",27017);
		System.out.println("1. MongoDB 연결 성공!");
		
		// 2) shop2로 연결!
		MongoDatabase database = client.getDatabase("shop2");
		System.out.println("2. shop2 DB 연결 성공!");
		
		// 3) member.collection 에 연결!
		MongoCollection<Document> collection = database.getCollection("member");
		System.out.println("3. member Collection 연결 성공!");
		
		// 삭제할 조건을 json(Document)로 만들어주세요.
		Document filter = new Document();
		filter.append("pw", "1234");
		
		collection.deleteMany(filter);
		client.close();
		System.out.println("4. member 컬렉션에 deleteMany 성공 ");
		
	}
}