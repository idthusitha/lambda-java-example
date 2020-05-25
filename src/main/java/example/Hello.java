package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Hello implements RequestHandler<Object, String> {

//	// @Override
//	public String handleRequest(Object input, Context context) {
//		context.getLogger().log("Input: " + input);
//
//		// TODO Auto-generated method stub
//		return "Hello from Lamda! Thusitha Dissanayaka";
//	}
	
	public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);

        // TODO: implement your handler
        return "Hello from Lambda Thusitha";
    }

}
