# SetsApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllSetsList**](SetsApi.md#getAllSetsList) | **GET** /{game}/v1/{language}/sets/all | List All Sets |
| [**getSetsList**](SetsApi.md#getSetsList) | **GET** /{game}/v1/{language}/sets | List Sets |
| [**getSetsSearch**](SetsApi.md#getSetsSearch) | **GET** /{game}/v1/{language}/sets/search | Search Sets |
| [**getSetsSingle**](SetsApi.md#getSetsSingle) | **GET** /{game}/v1/{language}/sets/{ankama_id} | Single Sets |


<a id="getAllSetsList"></a>
# **getAllSetsList**
> ListSets getAllSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, acceptEncoding, filterContainsCosmeticsOnly, filterContainsCosmetics)

List All Sets

Retrieve all sets with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.SetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    SetsApi apiInstance = new SetsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | dofus3 | dofus3beta
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinHighestEquipmentLevel = 190; // Integer | only results where the equipment with the highest level is above or equal to this value
    Integer filterMaxHighestEquipmentLevel = 200; // Integer | only results where the equipment with the highest level is below or equal to this value
    String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
    Boolean filterContainsCosmeticsOnly = true; // Boolean | filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment.
    Boolean filterContainsCosmetics = true; // Boolean | filter sets based on if they got cosmetic items in it.
    try {
      ListSets result = apiInstance.getAllSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, acceptEncoding, filterContainsCosmeticsOnly, filterContainsCosmetics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SetsApi#getAllSetsList");
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
| **game** | **String**| dofus3 | dofus3beta | [enum: dofus3, dofus3beta] |
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterMinHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is above or equal to this value | [optional] |
| **filterMaxHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is below or equal to this value | [optional] |
| **acceptEncoding** | **String**| optional compression for saving bandwidth | [optional] [enum: gzip] |
| **filterContainsCosmeticsOnly** | **Boolean**| filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment. | [optional] |
| **filterContainsCosmetics** | **Boolean**| filter sets based on if they got cosmetic items in it. | [optional] |

### Return type

[**ListSets**](ListSets.md)

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

<a id="getSetsList"></a>
# **getSetsList**
> ListSets getSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, pageSize, pageNumber, fieldsSet, filterContainsCosmeticsOnly, filterContainsCosmetics)

List Sets

Retrieve a list of sets.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.SetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    SetsApi apiInstance = new SetsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | dofus3 | dofus3beta
    String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
    Integer filterMinHighestEquipmentLevel = 190; // Integer | only results where the equipment with the highest level is above or equal to this value
    Integer filterMaxHighestEquipmentLevel = 200; // Integer | only results where the equipment with the highest level is below or equal to this value
    Integer pageSize = 20; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
    Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
    Set<String> fieldsSet = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
    Boolean filterContainsCosmeticsOnly = true; // Boolean | filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment.
    Boolean filterContainsCosmetics = true; // Boolean | filter sets based on if they got cosmetic items in it.
    try {
      ListSets result = apiInstance.getSetsList(language, game, sortLevel, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, pageSize, pageNumber, fieldsSet, filterContainsCosmeticsOnly, filterContainsCosmetics);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SetsApi#getSetsList");
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
| **game** | **String**| dofus3 | dofus3beta | [enum: dofus3, dofus3beta] |
| **sortLevel** | **String**| sort the resulting list by level, default unsorted | [optional] [enum: asc, desc] |
| **filterMinHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is above or equal to this value | [optional] |
| **filterMaxHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is below or equal to this value | [optional] |
| **pageSize** | **Integer**| size of the results from the list. -1 disables pagination and gets all in one response. | [optional] |
| **pageNumber** | **Integer**| page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16. | [optional] |
| **fieldsSet** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: effects, equipment_ids] |
| **filterContainsCosmeticsOnly** | **Boolean**| filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment. | [optional] |
| **filterContainsCosmetics** | **Boolean**| filter sets based on if they got cosmetic items in it. | [optional] |

### Return type

[**ListSets**](ListSets.md)

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

<a id="getSetsSearch"></a>
# **getSetsSearch**
> List&lt;ListSet&gt; getSetsSearch(language, game, query, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, limit, filterIsCosmetic)

Search Sets

Search in all names and descriptions of sets with a query.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.SetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    SetsApi apiInstance = new SetsApi(defaultClient);
    String language = "en"; // String | a valid language code
    String game = "dofus3"; // String | dofus3 | dofus3beta
    String query = "Des"; // String | case sensitive search query
    Integer filterMinHighestEquipmentLevel = 195; // Integer | only results where the equipment with the highest level is above or equal to this value
    Integer filterMaxHighestEquipmentLevel = 200; // Integer | only results where the equipment with the highest level is below or equal to this value
    Integer limit = 8; // Integer | maximum number of returned results
    Boolean filterIsCosmetic = true; // Boolean | filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment.
    try {
      List<ListSet> result = apiInstance.getSetsSearch(language, game, query, filterMinHighestEquipmentLevel, filterMaxHighestEquipmentLevel, limit, filterIsCosmetic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SetsApi#getSetsSearch");
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
| **game** | **String**| dofus3 | dofus3beta | [enum: dofus3, dofus3beta] |
| **query** | **String**| case sensitive search query | |
| **filterMinHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is above or equal to this value | [optional] |
| **filterMaxHighestEquipmentLevel** | **Integer**| only results where the equipment with the highest level is below or equal to this value | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |
| **filterIsCosmetic** | **Boolean**| filter sets based on if they only got cosmetic items in it. If true, the item ids are for the cosmetic endpoints instead of equipment. | [optional] |

### Return type

[**List&lt;ListSet&gt;**](ListSet.md)

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

<a id="getSetsSingle"></a>
# **getSetsSingle**
> Set getSetsSingle(language, ankamaId, game)

Single Sets

Retrieve a specific set with id.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.SetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    SetsApi apiInstance = new SetsApi(defaultClient);
    String language = "en"; // String | a valid language code
    Integer ankamaId = 499; // Integer | identifier
    String game = "dofus3"; // String | dofus3 | dofus3beta
    try {
      Set result = apiInstance.getSetsSingle(language, ankamaId, game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SetsApi#getSetsSingle");
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
| **game** | **String**| dofus3 | dofus3beta | [enum: dofus3, dofus3beta] |

### Return type

[**Set**](Set.md)

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

