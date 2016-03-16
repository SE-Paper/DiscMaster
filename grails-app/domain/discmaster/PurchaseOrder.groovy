package discmaster

class PurchaseOrder {

    String purchaseID
    float paidPrice
    float totalPrice
    int totalIems
    String status
    Date orderDate
    Date shippedDate

    static hasMany = [product: Product]

    static constraints = {
        purchaseID nullable: false
    }
}