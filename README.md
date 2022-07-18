## API-IV

Fetch fitness related activity for a user from Strava

API used - Strava API, Gson (can be found in the POM file), Selenium <br>
Excel Data - can be found on the test resources file 

[Strava API Documentation](https://developers.strava.com/docs/)

## How it works <br><br>
![image](https://developers.strava.com/images/getting-started-5.png)

<br>

Note:
```raml
You need to open an account in strava before proceeding.
This project have an open account and already configured from all aspect. 
The credentials can be found inside the config file. 
The google account here was created with the help of smailpro
```

link to [smailpro](https://smailpro.com/)

<br># Steps to be followed - <br>
Step 1: Visit the below mentioned site with your client id. And authorization code from authorization page. This is a one time, manual step. But in this project I have automated this step using selenium and to configure your client id make change in the config file. 
```raml
http://www.strava.com/oauth/authorize?client_id=[REPLACE_WITH_YOUR_CLIENT_ID]&response_type=code&redirect_uri=http://localhost/exchange_token&approval_prompt=force&scope=read
```

Step 2: Exchange authorization code for access token. In this step the authorization code recieved from the step 1 is given to the post request url below which will provide us the access token.
```raml
https://www.strava.com/oauth/token?client_id=[REPLACE_WITH_YOUR_CLIENT_ID]&client_secret=[REPLACE_WITH_YOUR_CLIENT_SECRET]&code=[REPLACE_WITH_YOUR_AUTHORIZATION_CODE_RECIEVED_FROM_STEP2]&grant_type=authorization_code
```

Step 3: view the activities using the access tokens just revieved from step 2
```raml
https://www.strava.com/api/v3/athlete/activities?access_token=[REPLACE_WITH_THE_ACCESS_CODE_RECIEVED_FROM_STEP3]
```



## For installing this project and running it in IDE
```raml
- navigate to your IDE workspace in cmd/power shell/terminal
- git clone https://github.com/Git-Nayanjyoti/API-IV.git
- import the already existing project in your IDE
- run the tests
```


## For installing and running this project in command line 

Note: 
```raml
You must have Maven in your system
```
```raml
- git clone https://github.com/Git-Nayanjyoti/API-IV.git
- cd API-IV
- mvn test
```
