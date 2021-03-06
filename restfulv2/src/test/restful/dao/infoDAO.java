package test.restful.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import test.restful.model.SearchParam;


@Component
public class infoDAO {

	// Dummy database. Initialize with some dummy values.
	private static Map infoResult;
	{
		String jsonString = 

				"{"+
				"\"$schema\": \"http://json-schema.org/draft-04/schema#\","+
				"\"type\": \"object\","+
				"\"properties\": {"+
				"\"responseHeader\": {"+
				"\"description\": \"showing brief response information.\","+
				"\"type\": \"object\","+
				"\"properties\": {"+
				"\"status\": {"+
				"\"description\": \"status of this query, 0 for success, 1 for error\","+
				"\"type\": \"integer\","+
				"\"enum\": [0, 1]"+
				"},"+
				"\"status_message\": {"+
				"\"description\": \"brief message to explain the query status, useful when status is 1(error)\","+
				"\"type\": \"string\""+
				"},"+
				"\"query_time\": {"+
				"\"description\": \"time use to perform this query, in milliseconds\","+
				"\"type\": \"integer\""+
				"},"+
				"\"params\": {"+
				"\"description\": \"parameters of this query, simply return what client give to server.\","+
				"\"type\": \"object\","+
				"\"properties\": {"+
				"\"username\": {"+
				"\"description\": \"username of user whom perform query\","+
				"\"type\": \"string\","+
				"\"default\": \"\""+
				"},"+
				"\"include\": {"+
				"\"description\": \"include keywords of this query, will return documents contains all of these keywords\","+
				"\"type\": \"array\","+
				"\"items\": {"+
				"\"type\": \"string\""+
				"},"+
				"\"default\" : []"+
				"},"+
				"\"exclude\": {"+
				"\"description\": \"exclude keywords of this query, will return documents not contains these keywords\","+
				"\"type\": \"array\","+
				"\"items\": {"+
				"\"type\": \"string\""+
				"},"+
				"\"default\" : []"+
				"},"+
				"\"start\": {"+
				"\"description\": \"for pagination, first index of response, zero-based\","+
				"\"type\": \"integer\","+
				"\"default\" : 0"+
				"},"+
				"\"rows\": {"+
				"\"description\": \"for pagination, number of documents return in single query\","+
				"\"type\": \"integer\","+
				"\"default\" : 10"+
				"},"+
				"\"time_start\": {"+
				"\"description\": \"start time of time interval of result, the number of milliseconds since 1970/01/01, -1 when not limit\","+
				"\"type\": \"integer\","+
				"\"default\" : -1"+
				"},"+
				"\"time_end\": {"+
				"\"description\": \"end time of time interval of result, the number of milliseconds since 1970/01/01, -1 when not limit\","+
				"\"type\": \"integer\","+
				"\"default\" : -1"+
				"},"+
				"\"order_by\": {"+
				"\"description\": \"return result will order by given value\","+
				"\"type\": \"string\","+
				"\"enum\": ["+
				"\"date_desc\", \"date_asc\""+
				"],"+
				"\"default\": \"date_desc\""+
				"}"+
				"}"+
				"}"+
				"}"+
				"},"+
				"\"response\": {"+
				"\"type\": \"object\","+
				"\"properties\": {"+
				"\"numFound\": {"+
				"\"description\": \"number of total result in this query\","+
				"\"type\": \"integer\""+
				"},"+
				"\"start\": {"+
				"\"description\": \"start index of this response, zero-based.\","+
				"\"type\": \"integer\""+
				"},"+
				"\"docs\": {"+
				"\"description\": \"array contains each result\","+
				"\"type\": \"array\","+
				"\"items\": {"+
				"\"description\": \"single query result\","+
				"\"type\": \"object\","+
				"\"properties\": {"+
				"\"links\": {"+
				"\"description\": \"links to acces this result, should have unless one\","+
				"\"type\": \"array\","+
				"\"items\": {"+
				"\"type\": \"string\""+
				"}"+
				"},"+
				"\"id\": {"+
				"\"description\": \"unique identifier of this document\","+
				"\"type\": \"string\""+
				"},"+
				"\"last_modified\": {"+
				"\"description\": \"last modified date, the number of milliseconds since 1970/01/01\","+
				"\"type\": \"integer\""+
				"},"+
				"\"keywords\": {"+
				"\"description\": \"keywords of this document, could be empty\","+
				"\"type\": \"array\","+
				"\"items\": {"+
				"\"type\": \"string\""+
				"}"+
				"},"+
				"\"author\": {"+
				"\"description\": \"author this document\","+
				"\"type\": \"string\""+
				"},"+
				"\"title\": {"+
				"\"description\": \"title this document\","+
				"\"type\": \"string\""+
				"},"+
				"\"content\": {"+
				"\"description\": \"partial content of this document, used to display query result.\","+
				"\"type\": \"string\""+
				"}"+
				"}"+
				"}"+
				"}"+
				"}"+
				"}"+
				"}"+
				"}"
		;
		com.google.gson.Gson gson = new com.google.gson.Gson();
		//System.out.print("jsonString="+jsonString);
		infoResult = gson.fromJson(jsonString, Map.class);
	}

	public Map mapResult() {
		return infoResult;
	}
	
	/*public Map create(String jsonString) {
		com.google.gson.Gson gson = new com.google.gson.Gson();
		return gson.fromJson(jsonString, Map.class);
	}*/
	
	public Map create(String jsonString) {
		com.google.gson.Gson gson = new com.google.gson.Gson();
		return gson.fromJson(jsonString, Map.class);
	}
	
	public Map infoQuery(SearchParam searchParam) {
		com.google.gson.Gson gson = new com.google.gson.Gson();
		return gson.fromJson("", Map.class);
	}

}