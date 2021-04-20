# CatalogApi

All URIs are relative to *https://sellingpartnerapi-na.amazon.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalogItem**](CatalogApi.md#getCatalogItem) | **GET** /catalog/2020-12-01/items/{asin} | 


<a name="getCatalogItem"></a>
# **getCatalogItem**
> Item getCatalogItem(asin, marketplaceIds, includedData)



Retrieves details for an item in the Amazon catalog.  **Usage Plans:**  | Plan type | Rate (requests per second) | Burst | | ---- | ---- | ---- | |Default| 5 | 5 | |Selling partner specific| Variable | Variable |  The x-amzn-RateLimit-Limit response header returns the usage plan rate limits that were applied to the requested operation. Rate limits for some selling partners will vary from the default rate and burst shown in the table above. For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.

### Example
```java
// Import classes:
//import com.amazon.spapi.ApiException;
//import com.amazon.spapi.api.CatalogApi;


CatalogApi apiInstance = new CatalogApi();
String asin = "asin_example"; // String | The Amazon Standard Identification Number (ASIN) of the item.
List<String> marketplaceIds = Arrays.asList("ATVPDKIKX0DER"); // List<String> | A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces.
List<String> includedData = Arrays.asList("summaries"); // List<String> | A comma-delimited list of data sets to include in the response.
try {
    Item result = apiInstance.getCatalogItem(asin, marketplaceIds, includedData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CatalogApi#getCatalogItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **asin** | **String**| The Amazon Standard Identification Number (ASIN) of the item. |
 **marketplaceIds** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of Amazon marketplace identifiers. Data sets in the response contain data only for the specified marketplaces. |
 **includedData** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of data sets to include in the response. | [optional] [enum: attributes, identifiers, images, productTypes, salesRanks, summaries, variations, vendorDetails]

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

