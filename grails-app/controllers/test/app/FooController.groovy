package test.app

class FooController {

    def index() {
        render "session.getMaxInactiveInterval() = " + session.getMaxInactiveInterval()
    }
}
