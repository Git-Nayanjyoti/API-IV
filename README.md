# API-IV

Fetch fitness related activity for a user from Strava

API used - Strava API, Gson (can be found in the POM file)<br>
Excel Data - can be found on the test resources file 

How it works <br>
![image](https://developers.strava.com/images/getting-started-5.png)

Steps -
Step 1: Get authorization code from authorization page. This is a one time, manual step.
```raml
http://www.strava.com/oauth/authorize?client_id=[REPLACE_WITH_YOUR_CLIENT_ID]&response_type=code&redirect_uri=http://localhost/exchange_token&approval_prompt=force&scope=read
```

Step 2: Exchange authorization code for access token & refresh token
```raml
https://www.strava.com/oauth/token?client_id=89990&client_secret=330ca97bbc5df9c29d19c51e68582456d889325c&code=e69a9383fe41fb7544ca690c367c3a275404a500&grant_type=authorization_code
```

Step 3: view the activities using the access tokens just revieved
```raml
https://www.strava.com/api/v3/athlete/activities?access_token=7077bb7682076fcc66068cf2e4c1d879205ee36c
```

Step 4: use refresh token to get new access tokens
```raml
```


## For installing this project
```raml
- navigate to your IDE workspace in cmd/power shell/terminal
- git clone https://github.com/Git-Nayanjyoti/API-II.git
- import the already existing project in your IDE
- run the tests
```
