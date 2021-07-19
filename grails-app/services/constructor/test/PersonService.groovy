package constructor.test

class PersonService {

    Person testTemporaryCreate(String source) {
        println "--------------------------"
        println "Working in ${source}"
        def newPerson = new Person(name: "Alice")
        println "Created ${newPerson.name}"

        def newPerson2 = new Person()
        newPerson2.name = "Bob"
        println "Created ${newPerson2.name}"

        println "${source} complete"
        println "--------------------------"
        return null
    }

}