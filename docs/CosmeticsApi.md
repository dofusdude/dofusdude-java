# CosmeticsApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllCosmeticsList**](CosmeticsApi.md#getAllCosmeticsList) | **GET** /{game}/{language}/items/cosmetics/all | List All Cosmetics |
| [**getCosmeticsList**](CosmeticsApi.md#getCosmeticsList) | **GET** /{game}/{language}/items/cosmetics | List Cosmetics |
| [**getCosmeticsSearch**](CosmeticsApi.md#getCosmeticsSearch) | **GET** /{game}/{language}/items/cosmetics/search | Search Cosmetics |
| [**getCosmeticsSingle**](CosmeticsApi.md#getCosmeticsSingle) | **GET** /{game}/{language}/items/cosmetics/{ankama_id} | Single Cosmetics |


<a id="getAllCosmeticsList"></a>
# **getAllCosmeticsList**
> ItemsListPaged getAllCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding)

List All Cosmetics

Retrieve all cosmetic items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.CosmeticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    CosmeticsApi apiInstance = new CosmeticsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    String filterTypeName = "Chapeau d'apparat"; // String | only results with the translated type name
    Integer filterMinLevel = 1; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 5; // Integer | only results which level is equal or below this value
    String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
    try {
      ItemsListPaged result = apiInstance.getAllCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CosmeticsApi#getAllCosmeticsList");
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
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterTypeName** | **String**| only results with the translated type name | [optional] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **acceptEncoding** | **String**| optional compression for saving bandwidth | [optional] [enum: gzip] |

### Return type

[**ItemsListPaged**](ItemsListPaged.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cosmetics Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |

<a id="getCosmeticsList"></a>
# **getCosmeticsList**
> ItemsListPaged getCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeEnum)

List Cosmetics

Retrieve a list of cosmetic items.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.CosmeticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    CosmeticsApi apiInstance = new CosmeticsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    String filterTypeName = "Chapeau d'apparat"; // String | only results with the translated type name
    Integer filterMinLevel = 1; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 5; // Integer | only results which level is equal or below this value
    Integer pageSize = 5; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
    Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
    Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
    Set<String> filterTypeEnum = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ItemsListPaged result = apiInstance.getCosmeticsList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeEnum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CosmeticsApi#getCosmeticsList");
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
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterTypeName** | **String**| only results with the translated type name | [optional] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **pageSize** | **Integer**| size of the results from the list. -1 disables pagination and gets all in one response. | [optional] |
| **pageNumber** | **Integer**| page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16. | [optional] |
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: recipe, description, conditions, effects] |
| **filterTypeEnum** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**ItemsListPaged**](ItemsListPaged.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cosmetics Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |

<a id="getCosmeticsSearch"></a>
# **getCosmeticsSearch**
> List&lt;ItemListEntry&gt; getCosmeticsSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit, filterTypeEnum)

Search Cosmetics

Search in all names and descriptions of cosmetic items with a query.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.CosmeticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    CosmeticsApi apiInstance = new CosmeticsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String query = "nedora"; // String | case sensitive search query
    String filterTypeName = "Wings"; // String | only results with the translated type name
    Integer filterMinLevel = 1; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 2; // Integer | only results which level is equal or below this value
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> filterTypeEnum = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<ItemListEntry> result = apiInstance.getCosmeticsSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit, filterTypeEnum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CosmeticsApi#getCosmeticsSearch");
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
| **filterTypeName** | **String**| only results with the translated type name | [optional] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **filterTypeEnum** | [**Set&lt;String&gt;**](String.md)| multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. | [optional] |

### Return type

[**List&lt;ItemListEntry&gt;**](ItemListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cosmetics found |  -  |
| **400** | Bad Request  Possibilities: - empty or no query  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |

<a id="getCosmeticsSingle"></a>
# **getCosmeticsSingle**
> Cosmetic getCosmeticsSingle(language, ankamaId, game)

Single Cosmetics

Retrieve a specific cosmetic item with id.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.CosmeticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    CosmeticsApi apiInstance = new CosmeticsApi(defaultClient);
    String language = "en"; // String | a valid language code
    Integer ankamaId = 24132; // Integer | identifier
    String game = "dofus2"; // String | 
    try {
      Cosmetic result = apiInstance.getCosmeticsSingle(language, ankamaId, game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CosmeticsApi#getCosmeticsSingle");
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
| **game** | **String**|  | [enum: dofus2, dofus2beta] |

### Return type

[**Cosmetic**](Cosmetic.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cosmetic Found |  -  |
| **400** | Bad Request  Possibilities: - invalid ankama id format  |  -  |
| **404** | Not Found  Possibilities: - nothing found for this ankama_id |  -  |

