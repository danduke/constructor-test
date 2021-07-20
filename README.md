# constructor-test
This is mostly a blank project from `create-app`.  The only files that really matter are 

* [PersonController](https://github.com/danduke/constructor-test/blob/master/grails-app/controllers/constructor/test/PersonController.groovy): Calls the `pageRenderer` and also `render` in its one action.
* [test.gsp](https://github.com/danduke/constructor-test/blob/master/grails-app/views/test.gsp): Calls the tablig
* [TestTagLib](https://github.com/danduke/constructor-test/blob/master/grails-app/taglib/constructor/test/TestTagLib.groovy): Calls the service
* [PersonService](https://github.com/danduke/constructor-test/blob/master/grails-app/services/constructor/test/PersonService.groovy): Creates two objects, one via map constructor and one via blank constructor + fields.

Basically this shows that:
* Setting named fields in a constructor through a GroovyPageRenderer silently fails
* Setting specific fields on a constructed object through a GroovyPageRenderer succeeds
* Both succeed when following a more "normal" path of a "render" call

Note that the taglib is not actually necessary; the same thing happens if the service is called directly from the GSP.

Stackoverflow issue with discussion, some backstory, etc. is available here: https://stackoverflow.com/questions/68446060/named-map-constructors-do-not-work-in-grails-gsp-pagerenderer?noredirect=1#comment120991465_68446060
# output
Web page output is not important in this demo application.  The console output of running this is

    --------------------------
    Called from pageRenderer
    Created null
    Created Bob
    pageRenderer complete
    --------------------------
    --------------------------
    Called from normal
    Created Alice
    Created Bob
    normal complete
    --------------------------
