package constructor.test

class TestTagLib {

    def personService

    static namespace = "ct"

    def simpleTag = { attrs ->
        personService.testTemporaryCreate(attrs.source)
        out << "Tag Called"
    }
}
