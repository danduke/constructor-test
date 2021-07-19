package constructor.test

class UrlMappings {

    static mappings = {
        "/"(controller: "person", action: "test")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
