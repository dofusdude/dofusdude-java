# GameApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameSearch**](GameApi.md#getGameSearch) | **GET** /{game}/v1/{language}/search | Game Search |
| [**getItemsAllSearch**](GameApi.md#getItemsAllSearch) | **GET** /{game}/v1/{language}/items/search | Search All Items |


<a id="getGameSearch"></a>
# **getGameSearch**
> List&lt;GameSearch&gt; getGameSearch(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId)

Game Search

Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus3/meta/search/types.

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String query = "paztek"; // String | search query
    Set<String> filterSearchIndex = Arrays.asList(); // Set<String> | only results with all specific type
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from the item search to the list entries if the hit is a item. Multiple comma separated values allowed.
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english item type name, including \"mount\" and \"set\" from filter[type]. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<GameSearch> result = apiInstance.getGameSearch(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId);
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
| **language** | **String**| a valid language code | [enum: en, fr, de, es, pt] |
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **query** | **String**| search query | |
| **filterSearchIndex** | [**Set&lt;String&gt;**](String.md)| only results with all specific type | [optional] [enum: items-consumables, items-cosmetics, items-resources, items-equipment, items-quest_items, mounts, sets] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from the item search to the list entries if the hit is a item. Multiple comma separated values allowed. | [optional] [enum: level, image_urls, type] |
| **filterTypeNameId** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english item type name, including \&quot;mount\&quot; and \&quot;set\&quot; from filter[type]. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**List&lt;GameSearch&gt;**](GameSearch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |

<a id="getItemsAllSearch"></a>
# **getItemsAllSearch**
> List&lt;ListItemGeneral&gt; getItemsAllSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId)

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String query = "atcham"; // String | case sensitive search query
    Integer filterMinLevel = 190; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<ListItemGeneral> result = apiInstance.getItemsAllSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId);
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
| **language** | **String**| a valid language code | [enum: en, fr, de, es, pt] |
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **query** | **String**| case sensitive search query | |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **filterTypeNameId** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**List&lt;ListItemGeneral&gt;**](ListItemGeneral.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |

