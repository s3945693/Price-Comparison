
# Run Instructions

Run back end: mvn spring-boot:run
Run front end: npm start

# Initial Setup

## Setup your environment 
You will need to have in your system

- Java 17.0 or higher
- Node and npm
- Apache Maven
- IDE or Editor

## Backend

- cd in backend/
- Run the app with "mvn spring-boot:run"
- Access the app on http://localhost:8080/

## Frontend
- cd into frontend/
- Install dependencies "npm install"
- Run the app with "npm run dev"

## Docker
### Backend Run
- have docker installed and running in background
- cd into backend/
- run "docker-compose up --build --no-cache"
- run "docker-compose up"
- backend should be running on localhost:8080

### Frontend Run
- in a new terminal window, cd into frontend/
- install dependencies "npm install"
- run "npm run dev"
- access the application on http://localhost:3000/
