package com.mentor.acme

import spock.lang.Specification

/**
 * 
 * @author kensipe
 */
class ExampleTest extends Specification {

    def example = new Example()

    def "hello message"() {

        expect:
        example.getMessage() == "hello message"
    }
}
