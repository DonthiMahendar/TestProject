package org.geb.spock

import spock.lang.Specification;

class RegisterSpec extends Specification {

    def "Navigate to WU page and register the user" () {

        def register = new RegisterPage()

        when:
        register

        then:
        print("successfully entered the registration details")

    }


}

