package co.uk.accio.uuidpk

class Flight {

    static mapping = {
        id generator:'assigned', type:'string'
    }
    
    static belongsTo = [airport: Airport]
    String id
    String number
    Location destination

    Flight() {
        id = UUID.randomUUID().toString()
    }
}
