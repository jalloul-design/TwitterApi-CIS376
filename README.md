# TwitterApi-CIS376

Project Overview: 
I have created a Spring Boot REST Twitter API that loads a JSON file of tweets and provides several endpoints to retrieve tweet data, extract links, and look up users by their screen name. 
Applications Used For This: 
- Java
- Spring Boot
- Maven


How To Run The Project:
1. Open the project in SpringBoot Application
2. Go to file, import the exsiting Maven project
3. Select the project file

Make Sure:
1. The JSON file is present
2. Make sure the pom.xml is present

Run The SpringBoot Application:
1. Right Click on file name
2. Click Run as
3. Select Run as Spring Boot App

Loading the Tweets Data By Testing Their Endpoints: 
1. Open A Browser
2. Type "http://localhost:8080/load" in search bar, then press enter
3. "Json file has loaded" message will appear
4. Then youll run  "http://localhost:8080/Tweets"
5. All tweets in the JSON file will display with user create time, id, and tweet text
6. Then youll run "http://localhost:8080/Tweets/{id}", must enter the Id number (ex:1,2,3)  
7. This will display the tweet at that ID number along with the text, created at, location,description, screen name, followers and friends count.
8. Then youll run the http://localhost:8080/Tweets/Links"
9. This function will display any links that are within the text IDs
10. Lastly  youll run "http://localhost:8080/screen_name/{screen_name}" must enter the screen name of the person who made a tweet.
11. This will dislay the user location,description, name,screen name, followers and friends count.

