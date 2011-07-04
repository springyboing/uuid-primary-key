package co.uk.accio.uuidpk

class Location {

    static mapping = {
        id generator:'assigned', type:'string'
    }


    String id
    String city
    String country

    Location() {
        id = UUID.randomUUID().toString()
    }
}
