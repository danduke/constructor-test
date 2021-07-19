# constructor-test
The only files that really matter are [PersonController](https://github.com/danduke/constructor-test/blob/master/grails-app/controllers/constructor/test/PersonController.groovy), [test.gsp](https://github.com/danduke/constructor-test/blob/master/grails-app/views/test.gsp), and [PersonService](https://github.com/danduke/constructor-test/blob/master/grails-app/services/constructor/test/PersonService.groovy).

Basically this shows that:
* Setting named fields in a constructor through a GroovyPageRenderer silently fails
* Setting specific fields on a constructed object through a GroovyPageRenderer succeeds
* Both succeed when following a more "normal" path of a "render" call

# output
The console output of running this is

    --------------------------
    Working in pageRenderer
    Created null
    Created Bob
    pageRenderer complete
    --------------------------
    --------------------------
    Working in normal
    Created Alice
    Created Bob
    normal complete
    --------------------------
