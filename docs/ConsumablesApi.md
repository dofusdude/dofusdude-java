# ConsumablesApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllItemsConsumablesList**](ConsumablesApi.md#getAllItemsConsumablesList) | **GET** /{game}/v1/{language}/items/consumables/all | List All Consumables |
| [**getItemsConsumablesList**](ConsumablesApi.md#getItemsConsumablesList) | **GET** /{game}/v1/{language}/items/consumables | List Consumables |
| [**getItemsConsumablesSearch**](ConsumablesApi.md#getItemsConsumablesSearch) | **GET** /{game}/v1/{language}/items/consumables/search | Search Consumables |
| [**getItemsConsumablesSingle**](ConsumablesApi.md#getItemsConsumablesSingle) | **GET** /{game}/v1/{language}/items/consumables/{ankama_id} | Single Consumables |


<a id="getAllItemsConsumablesList"></a>
# **getAllItemsConsumablesList**
> ListItems getAllItemsConsumablesList(language, game, sortLevel, filterMinLevel, filterMaxLevel, acceptEncoding, filterTypeNameId)

List All Consumables

Retrieve all consumable items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.ConsumablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    ConsumablesApi apiInstance = new ConsumablesApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinLevel = 150; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 180; // Integer | only results which level is equal or below this value
    String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ListItems result = apiInstance.getAllItemsConsumablesList(language, game, sortLevel, filterMinLevel, filterMaxLevel, acceptEncoding, filterTypeNameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumablesApi#getAllItemsConsumablesList");
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
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **acceptEncoding** | **String**| optional compression for saving bandwidth | [optional] [enum: gzip] |
| **filterTypeNameId** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**ListItems**](ListItems.md)

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

<a id="getItemsConsumablesList"></a>
# **getItemsConsumablesList**
> ListItems getItemsConsumablesList(language, game, sortLevel, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeNameId)

List Consumables

Retrieve a list of consumable items.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.ConsumablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    ConsumablesApi apiInstance = new ConsumablesApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinLevel = 150; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 180; // Integer | only results which level is equal or below this value
    Integer pageSize = 2; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
    Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
    Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ListItems result = apiInstance.getItemsConsumablesList(language, game, sortLevel, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeNameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumablesApi#getItemsConsumablesList");
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
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **pageSize** | **Integer**| size of the results from the list. -1 disables pagination and gets all in one response. | [optional] |
| **pageNumber** | **Integer**| page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16. | [optional] |
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: recipe, description, conditions, effects] |
| **filterTypeNameId** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**ListItems**](ListItems.md)

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

<a id="getItemsConsumablesSearch"></a>
# **getItemsConsumablesSearch**
> List&lt;ListItem&gt; getItemsConsumablesSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId)

Search Consumables

Search in all names and descriptions of consumable items with a query.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.ConsumablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    ConsumablesApi apiInstance = new ConsumablesApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String query = "Wholewrite"; // String | case sensitive search query
    Integer filterMinLevel = 1; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<ListItem> result = apiInstance.getItemsConsumablesSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumablesApi#getItemsConsumablesSearch");
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
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **query** | **String**| case sensitive search query | |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **filterTypeNameId** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**List&lt;ListItem&gt;**](ListItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Consumables Found |  -  |
| **400** |  |  -  |
| **404** |  |  -  |

<a id="getItemsConsumablesSingle"></a>
# **getItemsConsumablesSingle**
> Resource getItemsConsumablesSingle(language, ankamaId, game)

Single Consumables

Retrieve a specific consumable item with id.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.ConsumablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    ConsumablesApi apiInstance = new ConsumablesApi(defaultClient);
    String language = "en"; // String | a valid language code
    Integer ankamaId = 17206; // Integer | identifier
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    try {
      Resource result = apiInstance.getItemsConsumablesSingle(language, ankamaId, game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConsumablesApi#getItemsConsumablesSingle");
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
| **ankamaId** | **Integer**| identifier | |
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |

### Return type

[**Resource**](Resource.md)

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

