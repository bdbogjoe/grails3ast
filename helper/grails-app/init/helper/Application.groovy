package helper

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        println new ClassMarkedWithMagicNumber().getMagicNumber()
        GrailsApp.run(Application)
    }
}