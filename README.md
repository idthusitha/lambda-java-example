# lambda-java-example

###To create an execution role

    1) Open the roles page in the IAM console.

    2) Choose Create role. 

    3) Create a role with the following properties.

       Trusted entity – Lambda.

       Permissions – AWSLambdaBasicExecutionRole.

       Role name – lambda-role.

       The AWSLambdaBasicExecutionRole policy has the permissions that the function needs to write logs to CloudWatch Logs.

You can add permissions to the role later, or swap it out for a different role that's specific to a single function.

###To create a Java function

    1) Open the Lambda console

    2) Choose Create function.

    3) Configure the following settings:

       Name – my-function.

       Runtime – Java 11.

       Role – Choose an existing role.

       Existing role – lambda-role.

    4) Choose Create function.

    5) To configure a test event, choose Test.

    6) For Event name, enter test.

    7) Choose Create.

    8) To execute the function, choose Test.

The console creates a Lambda function with a handler class named Hello. Since Java is a compiled language, you can't view or edit the source code in the Lambda console, but you can modify its configuration, invoke it, and configure triggers. 
