package co.uk.accio.uuidpk

import grails.test.*

class AirportTests extends GrailsUnitTestCase {


    def destination
    def flight
    def airport

    protected void setUp() {
        super.setUp()

        destination = new Location(city: 'London', country: 'UK')
        destination.save(failOnError: true)
        flight = new Flight(number: 'abc123', destination: destination)
        airport = new Airport(name: 'Luton')
        airport.addToFlights(flight)
        airport.save(failOnError: true)
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSomething() {

        def myFlight = Flight.get(flight.id)
        assert flight == myFlight
    }
}
