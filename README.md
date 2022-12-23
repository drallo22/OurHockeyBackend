<h1>OurHockey</h1>

OurHockey is a website intended for hockey fans! It allows users to see information about 4 Canadian hockey teams while also being able to add players to a team's roster. Users are also able to rate each time out of 5 stars!
The backend of OurHockey was created using IntelliJ IDEA with springboot and hibernate. 

<h2>Getting Started</h2>
To get started with this project, follow these steps:

Clone or download the repository to your local machine
Run the program (it will run on port 8082)

<h2>Challenges</h2>

A challenge I faced was attemping to insert data into the data.sql file so that when a user runs the backend data will automatically be displayed for the viewer on the front end. I was not able to accomplish this through the backend so instead I did it through the front-end. Another challenge I faced was creating the one to many relationship between Team and Players. It would not let me create the relationship but after doing research I was able to fix this as it came down to mostly syntax errors.

<h2>Relationships</h2>

The database contains two relationships. A one to many relationship between Team and Courses where each team can have many courses. Along with a one to one relationsip between Team and Statistic as each Team has one Statistic.

<h2>Endpoints</h2>

<h4>Team Controller</h4>

-POST /api/teams/{team_id}/players

-GET /api/teams/{teamId}/players

-GET /api/teams/

-POST /api/teams/

-DELETE /api/teams/{teamId}/players

-PUT /api/teams/{id}

-DELETE /api/teams/{id}


<h4>Player Controller</h4>

-GET /api/players

-GET /api/players/{playerId}

-PUT /api/players/{playerId}

-DELETE /api/players/{playerId}


<h2> Link to frontend repository </h2>
https://github.com/drallo22/ourhockey



