package constructor.test

import grails.gsp.PageRenderer

class PersonController {

    PageRenderer groovyPageRenderer

    def test() {
        // in real usage, the results of this would be cached then used later; here, they're just thrown out
        groovyPageRenderer.render(view: "/test", model: [source: "pageRenderer"])
        render view: "/test", model: [source: "normal"]
    }

}
