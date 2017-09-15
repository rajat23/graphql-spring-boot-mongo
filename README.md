# GraphQL-spring-boot
Attempt to use GraphQL java library to build GraphQL server using spring boot.No external persistence layer used so far,all data is in memory.

# Schema for GraphQL (SDL)
 - `resources/schema.graphqls` contains GraphQL schema defination for query,resolver and types

# Application Initialization

-  Embedded tomcat of spring boot starts using `gradle bootRun` 
-  Unit tests runs using `gradle clean test`

# Endpoints available :
- Fetch all blogs : `http://localhost:8080/graphql` POST Endpoint.
  Request body format :
 `{
	    "query": "{allBlogs{title}}"
 }`
 
- It sound little stupid here to fetch all blogs using `POST` http method but it is used so we can pass query as a part of request body.
  We can change is to `GET` and pass actual query as query param.
  
- Resonse that you will get is : 
`{
    "allBlogs": [
        {
            "title": "REST in peace.GraphQL live long"
        },
        {
            "title": "Kotlin for Android"
        }
    ]
}`

- Lets add one more parameter to request body i.e content
`{
	"query": "{allBlogs{title content}}"
}`

- Response : 
`{
    "allBlogs": [
        {
            "title": "REST in peace.GraphQL live long",
            "content": "GraphQL dominating now days"
        },
        {
            "title": "Kotlin for Android",
            "content": "how useful is kotlin for android dev"
        }
    ]
}`
 
  
