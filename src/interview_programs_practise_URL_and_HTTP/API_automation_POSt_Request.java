package interview_programs_practise_URL_and_HTTP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API_automation_POSt_Request {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url ="https://jsonplaceholder.typicode.com/posts";
		
		String json = """
				{
                    "title": "Java HTTP",
                    "body": "HttpClient is awesome!",
                    "userId": 101
                }
                """;
	
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.header("Content-Type", "application/json") // I'm sending you JSON, not plain text
				.POST(HttpRequest.BodyPublishers.ofString(json)) //BodyPublishers.ofString(json) converts your JSON string into a stream that the HTTP client can send.
				.build();
		
		HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status code :" + response.statusCode());
		System.out.println("Response code :\n" + response.body());
	}

}
