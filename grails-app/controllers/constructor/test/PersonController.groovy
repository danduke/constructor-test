package constructor.test

import grails.gsp.PageRenderer

class PersonController {

    PageRenderer groovyPageRenderer

    def test() {
        groovyPageRenderer.render(view: "/test", model: [source: "pageRenderer"])
        render view: "/test", model: [source: "normal"]
    }

}
