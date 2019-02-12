# XML to PDF Converter
The application is designed to convert your XML files to PDF format.

## How it works
To start the application you can use the following tasks:

- `./gradlew build`: build the project
- `./gradlew createDocker`: create a docker image
- `./gradlew runDocker`: run the application on port 8080

## How to use
After starting the service waits for POST requests on http://localhost:8080. You can send POST requests to http://localhost:8080/pdf.

Example:
`curl -X POST -d @data.xml http://localhost:8080/pdf`
