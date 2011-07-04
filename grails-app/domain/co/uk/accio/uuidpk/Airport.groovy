package co.uk.accio.uuidpk

class Airport {

    static mapping = {
        id generator:'assigned', type:'string'
    }

    static hasMany = [flights: Flight]
    String id
    String name

    Airport() {
        id = UUID.randomUUID().toString()
    }
}
