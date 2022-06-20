# ShipmentApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateShipmentStatus**](ShipmentApi.md#updateShipmentStatus) | **POST** /orders/v0/orders/{orderId}/shipment | 


<a name="updateShipmentStatus"></a>
# **updateShipmentStatus**
> updateShipmentStatus(orderId, payload)



Update the shipment status.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.ShipmentApi;


ShipmentApi apiInstance = new ShipmentApi();
String orderId = "orderId_example"; // String | An Amazon-defined order identifier, in 3-7-7 format.
UpdateShipmentStatusRequest payload = new UpdateShipmentStatusRequest(); // UpdateShipmentStatusRequest | Request to update the shipment status.
try {
    apiInstance.updateShipmentStatus(orderId, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling ShipmentApi#updateShipmentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| An Amazon-defined order identifier, in 3-7-7 format. |
 **payload** | [**UpdateShipmentStatusRequest**](UpdateShipmentStatusRequest.md)| Request to update the shipment status. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

