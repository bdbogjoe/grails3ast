package demo

import helper.ClassMarkedWithMagicNumber

class DemoController {

    def index() {
        def helper = new ClassMarkedWithMagicNumber()

        def message = "The Magic Number Is ${helper.magicNumber}"

        render message
    }
}
