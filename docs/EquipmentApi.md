# EquipmentApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllItemsEquipmentList**](EquipmentApi.md#getAllItemsEquipmentList) | **GET** /{game}/v1/{language}/items/equipment/all | List All Equipment |
| [**getItemsEquipmentList**](EquipmentApi.md#getItemsEquipmentList) | **GET** /{game}/v1/{language}/items/equipment | List Equipment |
| [**getItemsEquipmentSearch**](EquipmentApi.md#getItemsEquipmentSearch) | **GET** /{game}/v1/{language}/items/equipment/search | Search Equipment |
| [**getItemsEquipmentSingle**](EquipmentApi.md#getItemsEquipmentSingle) | **GET** /{game}/v1/{language}/items/equipment/{ankama_id} | Single Equipment |


<a id="getAllItemsEquipmentList"></a>
# **getAllItemsEquipmentList**
> ListItems getAllItemsEquipmentList(language, game, sortLevel, filterMinLevel, filterMaxLevel, acceptEncoding, filterTypeNameId)

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinLevel = 10; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 60; // Integer | only results which level is equal or below this value
    String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ListItems result = apiInstance.getAllItemsEquipmentList(language, game, sortLevel, filterMinLevel, filterMaxLevel, acceptEncoding, filterTypeNameId);
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

<a id="getItemsEquipmentList"></a>
# **getItemsEquipmentList**
> ListItems getItemsEquipmentList(language, game, sortLevel, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeNameId)

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinLevel = 10; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 60; // Integer | only results which level is equal or below this value
    Integer pageSize = 5; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
    Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
    Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      ListItems result = apiInstance.getItemsEquipmentList(language, game, sortLevel, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem, filterTypeNameId);
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
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterMinLevel** | **Integer**| only results which level is equal or above this value | [optional] |
| **filterMaxLevel** | **Integer**| only results which level is equal or below this value | [optional] |
| **pageSize** | **Integer**| size of the results from the list. -1 disables pagination and gets all in one response. | [optional] |
| **pageNumber** | **Integer**| page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16. | [optional] |
| **fieldsItem** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: recipe, description, conditions, effects, is_weapon, pods, parent_set, critical_hit_probability, critical_hit_bonus, max_cast_per_turn, ap_cost, range] |
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

<a id="getItemsEquipmentSearch"></a>
# **getItemsEquipmentSearch**
> List&lt;ListItem&gt; getItemsEquipmentSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId)

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
    String query = "nidas"; // String | case sensitive search query
    Integer filterMinLevel = 150; // Integer | only results which level is equal or above this value
    Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
    Integer limit = 8; // Integer | maximum number of returned results
    Set<String> filterTypeNameId = Arrays.asList(); // Set<String> | multi-filter results with the english type name. Add with \"wood\" or \"+wood\" and exclude with \"-wood\".
    try {
      List<ListItem> result = apiInstance.getItemsEquipmentSearch(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId);
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
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |

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
    String game = "dofus3"; // String | game main 'dofus3' or beta channel 'dofus3beta'
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
| **game** | **String**| game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; | [enum: dofus3, dofus3beta] |

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
| **200** |  |  -  |
| **400** |  |  -  |
| **404** |  |  -  |

