# ResourcesApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllItemsResourcesList**](ResourcesApi.md#getAllItemsResourcesList) | **GET** /{game}/{language}/items/resources/all | List All Resources |
| [**getItemsResourceSearch**](ResourcesApi.md#getItemsResourceSearch) | **GET** /{game}/{language}/items/resources/search | Search Resources |
| [**getItemsResourcesList**](ResourcesApi.md#getItemsResourcesList) | **GET** /{game}/{language}/items/resources | List Resources |
| [**getItemsResourcesSingle**](ResourcesApi.md#getItemsResourcesSingle) | **GET** /{game}/{language}/items/resources/{ankama_id} | Single Resources |



## getAllItemsResourcesList

> ItemsListPaged getAllItemsResourcesList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding)

List All Resources

Retrieve all resource items with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.ResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        ResourcesApi apiInstance = new ResourcesApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
        String filterTypeName = "miscellaneous resources"; // String | only results with the translated type name
        Integer filterMinLevel = 160; // Integer | only results which level is equal or above this value
        Integer filterMaxLevel = 190; // Integer | only results which level is equal or below this value
        String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
        try {
            ItemsListPaged result = apiInstance.getAllItemsResourcesList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, acceptEncoding);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getAllItemsResourcesList");
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
| **200** | Resources Found |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## getItemsResourceSearch

> List&lt;ItemListEntry&gt; getItemsResourceSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit)

Search Resources

Search in all names and descriptions of resource items with a query.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.ResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        ResourcesApi apiInstance = new ResourcesApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String query = "snowdew"; // String | case sensitive search query
        String filterTypeName = "plant"; // String | only results with the translated type name
        Integer filterMinLevel = 150; // Integer | only results which level is equal or above this value
        Integer filterMaxLevel = 200; // Integer | only results which level is equal or below this value
        Integer limit = 8; // Integer | maximum number of returned results
        try {
            List<ItemListEntry> result = apiInstance.getItemsResourceSearch(language, game, query, filterTypeName, filterMinLevel, filterMaxLevel, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getItemsResourceSearch");
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
| **200** | Resources Found |  -  |
| **400** | Bad Request  Possibilities: - empty or no query  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |


## getItemsResourcesList

> ItemsListPaged getItemsResourcesList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem)

List Resources

Retrieve a list of resource items.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.ResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        ResourcesApi apiInstance = new ResourcesApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String sortLevel = "asc"; // String | sort the resulting list by level, default unsorted
        String filterTypeName = "miscellaneous resources"; // String | only results with the translated type name
        Integer filterMinLevel = 160; // Integer | only results which level is equal or above this value
        Integer filterMaxLevel = 190; // Integer | only results which level is equal or below this value
        Integer pageSize = 10; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
        Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
        Set<String> fieldsItem = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
        try {
            ItemsListPaged result = apiInstance.getItemsResourcesList(language, game, sortLevel, filterTypeName, filterMinLevel, filterMaxLevel, pageSize, pageNumber, fieldsItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getItemsResourcesList");
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
| **200** | Resources Found |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |


## getItemsResourcesSingle

> Resource getItemsResourcesSingle(language, ankamaId, game)

Single Resources

Retrieve a specific resource item with id.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.ResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        ResourcesApi apiInstance = new ResourcesApi(defaultClient);
        String language = "en"; // String | a valid language code
        Integer ankamaId = 7295; // Integer | identifier
        String game = "dofus2"; // String | 
        try {
            Resource result = apiInstance.getItemsResourcesSingle(language, ankamaId, game);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ResourcesApi#getItemsResourcesSingle");
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

[**Resource**](Resource.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Resource Found |  -  |
| **400** | Bad Request  Possibilities: - invalid ankama id format  |  -  |
| **404** | Not Found  Possibilities: - nothing found for this ankama_id |  -  |

