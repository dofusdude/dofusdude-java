# EquipmentApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllItemsEquipmentList**](EquipmentApi.md#getAllItemsEquipmentList) | **GET** /{game}/{language}/items/equipment/all | List All Equipment |
| [**getItemsEquipmentList**](EquipmentApi.md#getItemsEquipmentList) | **GET** /{game}/{language}/items/equipment | List Equipment |
| [**getItemsEquipmentSearch**](EquipmentApi.md#getItemsEquipmentSearch) | **GET** /{game}/{language}/items/equipment/search | Search Equipment |
| [**getItemsEquipmentSingle**](EquipmentApi.md#getItemsEquipmentSingle) | **GET** /{game}/{language}/items/equipment/{ankama_id} | Single Equipment |


<a id="getAllItemsEquipmentList"></a>
# **getAllItemsEquipmentList**
> ItemsListPaged getAllItemsEquipmentList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding)

List All Equipment

Retrieve all equipment items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.EquipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    EquipmentApi apiInstance = new EquipmentApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    String filterTypeName = "Sword"; // String | only results with the translated type name
    Integer filterMinLevel = 10; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 60; // Integer | only results which level is equal or below this value
    String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
    try {
      ItemsListPaged result = apiInstance.getAllItemsEquipmentList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipmentApi#getAllItemsEquipmentList");
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
| **200** | Equipment Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |

<a id="getItemsEquipmentList"></a>
# **getItemsEquipmentList**
> ItemsListPaged getItemsEquipmentList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeEnum)

List Equipment

Retrieve a list of equipment items.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.EquipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    EquipmentApi apiInstance = new EquipmentApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    String filterTypeName = "Sword"; // String | only results with the translated type name
    Integer filterMinLevel = 10; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 60; // Integer | only results which level is equal or below this value
    Integer pageSize = 5; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
    Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
    Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
    Set<String> filterTypeEnum = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ItemsListPaged result = apiInstance.getItemsEquipmentList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeEnum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipmentApi#getItemsEquipmentList");
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
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: recipe, description, conditions, effects, is_weapon, pods, parent_set, critical_hit_probability, critical_hit_bonus, is_two_handed, max_cast_per_turn, ap_cost, range] |
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
| **200** | Equipment Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |

<a id="getItemsEquipmentSearch"></a>
# **getItemsEquipmentSearch**
> List&lt;ItemListEntry&gt; getItemsEquipmentSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit, filterTypeEnum)

Search Equipment

Search in all names and descriptions of equipment items with a query.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.EquipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    EquipmentApi apiInstance = new EquipmentApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus2"; // String | 
    String query = "nidas"; // String | case sensitive search query
    String filterTypeName = "boots"; // String | only results with the translated type name
    Integer filterMinLevel = 150; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> filterTypeEnum = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<ItemListEntry> result = apiInstance.getItemsEquipmentSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit, filterTypeEnum);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipmentApi#getItemsEquipmentSearch");
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
| **200** | Equipment Found |  -  |
| **400** | Bad Request  Possibilities: - empty or no query  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |

<a id="getItemsEquipmentSingle"></a>
# **getItemsEquipmentSingle**
> Weapon getItemsEquipmentSingle(language, ankamaId, game)

Single Equipment

Retrieve a specific equipment item with id.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.EquipmentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    EquipmentApi apiInstance = new EquipmentApi(defaultClient);
    String language = "en"; // String | a valid language code
    Integer ankamaId = 26009; // Integer | identifier
    String game = "dofus2"; // String | 
    try {
      Weapon result = apiInstance.getItemsEquipmentSingle(language, ankamaId, game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EquipmentApi#getItemsEquipmentSingle");
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

[**Weapon**](Weapon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Equipment Found |  -  |
| **400** | Bad Request  Possibilities: - invalid ankama id format  |  -  |
| **404** | Not Found  Possibilities: - nothing found for this ankama_id |  -  |

