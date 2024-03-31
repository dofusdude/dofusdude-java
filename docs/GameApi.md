# GameApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameSearch**](GameApi.md#getGameSearch) | **GET** /{game}/{language}/search | Game Search |
| [**getItemsAllSearch**](GameApi.md#getItemsAllSearch) | **GET** /{game}/{language}/items/search | Search All Items |



## getGameSearch

> List&lt;GetGameSearch200ResponseInner&gt; getGameSearch(language, game, query, filterType, limit, fieldsItem)

Game Search

Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus2/meta/search/types.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        GameApi apiInstance = new GameApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String query = "paztek"; // String | search query
        Set<String> filterType = Arrays.asList(); // Set<String> | only results with all specific type
        Integer limit = 8; // Integer | maximum number of returned results
        Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from the item search to the list entries if the hit is a item. Multiple comma separated values allowed.
        try {
            List<GetGameSearch200ResponseInner> result = apiInstance.getGameSearch(language, game, query, filterType, limit, fieldsItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getGameSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **language** | **String**| a valid language code | [enum: en, fr, de, it, es, pt] |
| **game** | **String**|  | [enum: dofus2, dofus2beta] |
| **query** | **String**| search query | |
| **filterType** | [**Set&lt;String&gt;**](String.md)| only results with all specific type | [optional] [enum: items-consumables, items-cosmetics, items-resources, items-equipment, items-quest_items, mounts, sets] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from the item search to the list entries if the hit is a item. Multiple comma separated values allowed. | [optional] [enum: level, image_urls, type] |

### Return type

[**List&lt;GetGameSearch200ResponseInner&gt;**](GetGameSearch200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Game Search Result |  -  |
| **400** | Bad Request  Possibilities: - empty or no query - filter[type] does not exist  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |


## getItemsAllSearch

> List&lt;ItemsListEntryTyped&gt; getItemsAllSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit)

Search All Items

Search in all names and descriptions of Dofus items (including all subtypes) with a query.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        GameApi apiInstance = new GameApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String query = "atcham"; // String | case sensitive search query
        String filterTypeName = "Bottes"; // String | only results with the translated type name across all item_subtypes
        Integer filterMinLevel = 190; // Integer | only results which level is equal or above this value
        Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
        Integer limit = 8; // Integer | maximum number of returned results
        try {
            List<ItemsListEntryTyped> result = apiInstance.getItemsAllSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#getItemsAllSearch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **language** | **String**| a valid language code | [enum: en, fr, de, it, es, pt] |
| **game** | **String**|  | [enum: dofus2, dofus2beta] |
| **query** | **String**| case sensitive search query | |
| **filterTypeName** | **String**| only results with the translated type name across all item_subtypes | [optional] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |

### Return type

[**List&lt;ItemsListEntryTyped&gt;**](ItemsListEntryTyped.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Items Found |  -  |
| **400** | Bad Request  Possibilities: - empty or no query  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |

