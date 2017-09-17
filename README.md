# GraphQL-spring-boot
Attempt to use GraphQL java library to build GraphQL server using spring boot.No external persistence layer used so far,all data is in memory.

# Schema for GraphQL (SDL)
 - `resources/schema.graphqls` contains GraphQL schema defination for query,resolver and types

# Application Initialization

-  Embedded tomcat of spring boot starts using `gradle bootRun` 
-  Unit tests runs using `gradle clean test`


# Query
- Fetch all blogs : `http://localhost:8080/graphql` POST Endpoint.
  Request body format :
 `{
	    "query": "{allBlogs{title}}"
 }`
 
- It sounds little stupid here to fetch all blogs using `POST` http method but it is used so we can pass query as a part of request body.
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

# Mutation aka POST

- GraphQL provides feature of Mutation which let us create new enitity.

- Create Blog: `http:/localhost:8080/graphql`.
  Request Body: `{
                 	"query": "mutation createBlog {createBlog(title:\"hello\",content:\"world\") {title content}}"
                 }`
- Response: `{
                 "createBlog": {
                     "title": "hello",
                     "content": "world"
                 }
             }`
             
             
- If you now again Query all blogs response would be `{
                                                          "allBlogs": [
                                                              {
                                                                  "title": "REST in peace.GraphQL live long",
                                                                  "content": "GraphQL dominating now days"
                                                              },
                                                              {
                                                                  "title": "Kotlin for Android",
                                                                  "content": "how useful is kotlin for android dev"
                                                              },
                                                              {
                                                                  "title": "hello",
                                                                  "content": "world"
                                                              }
                                                          ]
                                                      }`
 
  
