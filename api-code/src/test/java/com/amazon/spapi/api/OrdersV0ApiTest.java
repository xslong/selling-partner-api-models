/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.api;

import com.amazon.spapi.ApiException;
import com.amazon.spapi.model.orders.GetOrderAddressResponse;
import com.amazon.spapi.model.orders.GetOrderBuyerInfoResponse;
import com.amazon.spapi.model.orders.GetOrderItemsBuyerInfoResponse;
import com.amazon.spapi.model.orders.GetOrderItemsResponse;
import com.amazon.spapi.model.orders.GetOrderResponse;
import com.amazon.spapi.model.orders.GetOrdersResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersV0Api
 */
@Ignore
public class OrdersV0ApiTest {

    private final OrdersV0Api api = new OrdersV0Api();

    
    /**
     * 
     *
     * Returns the order indicated by the specified order ID.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        String orderId = null;
        GetOrderResponse response = api.getOrder(orderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the shipping address for the order indicated by the specified order ID.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderAddressTest() throws ApiException {
        String orderId = null;
        GetOrderAddressResponse response = api.getOrderAddress(orderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns buyer information for the order indicated by the specified order ID.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderBuyerInfoTest() throws ApiException {
        String orderId = null;
        GetOrderBuyerInfoResponse response = api.getOrderBuyerInfo(orderId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns detailed order item information for the order indicated by the specified order ID. If NextToken is provided, it&#39;s used to retrieve the next page of order items.  Note: When an order is in the Pending state (the order has been placed but payment has not been authorized), the getOrderItems operation does not return information about pricing, taxes, shipping charges, gift status or promotions for the order items in the order. After an order leaves the Pending state (this occurs when payment has been authorized) and enters the Unshipped, Partially Shipped, or Shipped state, the getOrderItems operation returns information about pricing, taxes, shipping charges, gift status and promotions for the order items in the order.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderItemsTest() throws ApiException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsResponse response = api.getOrderItems(orderId, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns buyer information in the order items of the order indicated by the specified order ID.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderItemsBuyerInfoTest() throws ApiException {
        String orderId = null;
        String nextToken = null;
        GetOrderItemsBuyerInfoResponse response = api.getOrderItemsBuyerInfo(orderId, nextToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns orders created or updated during the time frame indicated by the specified parameters. You can also apply a range of filtering criteria to narrow the list of orders returned. If NextToken is present, that will be used to retrieve the orders instead of other criteria.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 1 | 1 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrdersTest() throws ApiException {
        List<String> marketplaceIds = null;
        String createdAfter = null;
        String createdBefore = null;
        String lastUpdatedAfter = null;
        String lastUpdatedBefore = null;
        List<String> orderStatuses = null;
        List<String> fulfillmentChannels = null;
        List<String> paymentMethods = null;
        String buyerEmail = null;
        String sellerOrderId = null;
        Integer maxResultsPerPage = null;
        List<String> easyShipShipmentStatuses = null;
        String nextToken = null;
        List<String> amazonOrderIds = null;
        GetOrdersResponse response = api.getOrders(marketplaceIds, createdAfter, createdBefore, lastUpdatedAfter, lastUpdatedBefore, orderStatuses, fulfillmentChannels, paymentMethods, buyerEmail, sellerOrderId, maxResultsPerPage, easyShipShipmentStatuses, nextToken, amazonOrderIds);

        // TODO: test validations
    }
    
}
