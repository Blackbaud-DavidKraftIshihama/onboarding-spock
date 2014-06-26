package com.example.basics

import spock.lang.Specification

class _2FixtureMethods extends Specification {

	def setupSpec() {
		println "setup specification"
	}

	def setup() {
		println "setup feature"
	}

	def cleanup() {
		println "cleanup feature"
	}

	def cleanupSpec() {
		println "cleanup specification"
	}

	def "should output fixture flow"() {
		println "test"
	}

}
