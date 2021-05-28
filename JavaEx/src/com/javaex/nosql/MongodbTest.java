package com.javaex.nosql;

import org.bson.Document;

//서버 > DB> Collection 얻어오기

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongodbTest {
	static String MONGODB_IP="127.0.0.1"; //localhost
	static int MONGODB_PORT=27017; //port 번호
	static String DB_NAME="javaMongo";
	static String COLL_NAME="testCollection";
	
	public static void main(String[] args) {
//		connect();
		getCollection(DB_NAME,COLL_NAME);
	}
	private static MongoCollection<Document> getCollection(
			String databaseName, String collectionName) {
		//접속 
		MongoClient client=connect();
		//use Database
		MongoDatabase db = client.getDatabase(DB_NAME); //use javaMongo
		System.out.println("DATABASE:"+db);
		MongoCollection<Document> coll=db.getCollection(databaseName);
		System.out.println("COLLECTION:"+coll);
		return coll;
				
		
	}
	
	private static MongoClient connect() {
		//몽고 DB 접속 
		MongoClient client=MongoClients.create();
		
		System.out.println(client);
		return client;
	}
}
