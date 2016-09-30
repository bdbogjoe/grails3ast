package app

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        println new demo.ClassMarkedWithMagicNumber().getMagicNumber()
        println new helper.ClassMarkedWithMagicNumber().getMagicNumber()
        GrailsApp.run(Application)
    }
}