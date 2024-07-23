# graphQL
graphQL DEMO

Run The Application : mvn clean install

End point : http://localhost:8080/graphiql?path=/graphql

Sample schema:

{
books{
id
name
pageCount
author {
id
name
}
}
}

Expected output:

{
"data": {
"books": [
{
"id": "1",
"name": "DATA INTENSIVE APPLICATION",
"pageCount": 500,
"author": {
"id": "1",
"name": "Martin Kleppmann"
}
},
{
"id": "2",
"name": "JAVA BY O'REILLY",
"pageCount": 400,
"author": {
"id": "2",
"name": "Marc Loy, Patrick Niemeyer"
}
},
{
"id": "3",
"name": "Interview Questions",
"pageCount": 700,
"author": {
"id": "3",
"name": "Dan Leuck"
}
}
]
}
}
