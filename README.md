# Spark Java Framework
Spark Framework is a simple and expressive Java/Kotlin web framework DSL built for rapid development. Sparks intention is to provide an alternative for Kotlin/Java developers that want to develop their web applications as expressive as possible and with minimal boilerplate. With a clear philosophy Spark is designed not only to make you more productive, but also to make your code better under the influence of Spark’s sleek, declarative and expressive syntax. [Spark-Java](http://sparkjava.com/)

##### Africa's Talking Callback
[Africa's Talking](https://africastalking.com) speaks to your app via callbacks over RESTful HTTP.

Given that most developers use their localhost for the development process, it is important to note that this does not expose the developed application to the internet -- even though the application can send HTTP requests to various endpoints. To be accessible to other hosts online e.g the Africa's Talking Servers, the application should be accessible by external hosts via a public IP/URL. You can use [ngrok](https://www.ngrok.com) to tunnel your local host to the internet (it is free to use).

#### To test the endpoints, use CURL:
````
curl -X POST -H "Content-Type: application/json" -d '{
  "transactionId": "ATPid_TestTransaction123",
  "category": "MobileCheckout",
  "provider": "Mpesa",
  "providerRefId": "MpesaID001",
  "providerChannel": "525900",
  "productName": "My Online Store",
  "sourceType": "PhoneNumber",
  "source": "+254711XYYZZZ",
  "destinationType" : "Wallet",
  "destination": "PaymentWallet",
  "value": "KES 1000",
  "transactionFee": "KES 1.5",
  "providerFee": "KES 5.5",
  "status": "Success",
  "description": "Payment confirmed by mobile subscriber",
  "requestMetadata" : {
      "shopId" : "1234",
      "itemId" : "abcdef"
   },
  "providerMetadata" : {
      "KYCName" : "TestCustomer",
      "KYCLocation" : "Nairobi"
   },
  "transactionDate": "2016-07-10T15:12:05+03"
}' "http://9c2e54fc.ngrok.io/confirmation"
````


