package interview_programs_practise_URL_and_HTTP;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API_automation_GET_Request {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url = "https://jsonplaceholder.typicode.com/posts/1";
		
		HttpClient client = HttpClient.newHttpClient(); //Think of it as a web browser without the UI. It’s responsible for sending the request and receiving the response.
		HttpRequest request = HttpRequest.newBuilder() //This starts building an HTTP request.
				.uri(URI.create(url)) //This tells the request where it’s going — it sets the target URL.
				.GET() //We're saying: "Hey, I want to do a GET request."
				.build();  // This finalizes the request object.
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		/*
		 This line sends the request to the server. Let's break down the parts:
		 client.send(...): Actually sends the request and waits for a response.
		 response is the object that holds everything the server sends back.
		 BodyHandlers.ofString(): Tells Java to read the body of the response as plain text (String).
		 */
		
		System.out.println("Status code : " + response.statusCode());
		System.out.println("Response body :\n" + response.body());
	}

}
