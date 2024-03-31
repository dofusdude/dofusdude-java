# MountsApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllMountsList**](MountsApi.md#getAllMountsList) | **GET** /{game}/{language}/mounts/all | List All Mounts |
| [**getMountsList**](MountsApi.md#getMountsList) | **GET** /{game}/{language}/mounts | List Mounts |
| [**getMountsSearch**](MountsApi.md#getMountsSearch) | **GET** /{game}/{language}/mounts/search | Search Mounts |
| [**getMountsSingle**](MountsApi.md#getMountsSingle) | **GET** /{game}/{language}/mounts/{ankama_id} | Single Mounts |



## getAllMountsList

> MountsListPaged getAllMountsList(language, game, filterFamilyName, acceptEncoding)

List All Mounts

Retrieve all mounts with one request. This endpoint is just an alias for the a list with disabled pagination (page[size]&#x3D;-1) and all fields[type] set.  If you want everything unfiltered, delete the other query parameters.  Be careful with testing or (god forbid) using /all in your browser, the returned json is huge and will slow down the browser!  Tip: set the HTTP Header &#39;Accept-Encoding: gzip&#39; for saving bandwidth. You will need to uncompress it on your end. Example with cURL: &#x60;&#x60;&#x60; curl -sH &#39;Accept-Encoding: gzip&#39; &lt;api-endpoint&gt; | gunzip - &#x60;&#x60;&#x60;

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MountsApi apiInstance = new MountsApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String filterFamilyName = "Dragoturkey"; // String | only results with the translated family name
        String acceptEncoding = "gzip"; // String | optional compression for saving bandwidth
        try {
            MountsListPaged result = apiInstance.getAllMountsList(language, game, filterFamilyName, acceptEncoding);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MountsApi#getAllMountsList");
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
| **filterFamilyName** | **String**| only results with the translated family name | [optional] |
| **acceptEncoding** | **String**| optional compression for saving bandwidth | [optional] [enum: gzip] |

### Return type

[**MountsListPaged**](MountsListPaged.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mounts Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |


## getMountsList

> MountsListPaged getMountsList(language, game, filterFamilyName, pageSize, pageNumber, fieldsMount)

List Mounts

Retrieve a list of mounts.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MountsApi apiInstance = new MountsApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String filterFamilyName = "Dragoturkey"; // String | only results with the translated family name
        Integer pageSize = 10; // Integer | size of the results from the list. -1 disables pagination and gets all in one response.
        Integer pageNumber = 1; // Integer | page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16.
        Set<String> fieldsMount = Arrays.asList(); // Set<String> | adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed.
        try {
            MountsListPaged result = apiInstance.getMountsList(language, game, filterFamilyName, pageSize, pageNumber, fieldsMount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MountsApi#getMountsList");
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
| **filterFamilyName** | **String**| only results with the translated family name | [optional] |
| **pageSize** | **Integer**| size of the results from the list. -1 disables pagination and gets all in one response. | [optional] |
| **pageNumber** | **Integer**| page number based on the current page[size]. So you could get page 1 with 8 entrys and page 2 would have entries 8 to 16. | [optional] |
| **fieldsMount** | [**Set&lt;String&gt;**](String.md)| adds fields from their detail endpoint to the item list entries. Multiple comma separated values allowed. | [optional] [enum: effects] |

### Return type

[**MountsListPaged**](MountsListPaged.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mounts Found |  -  |
| **400** | Bad Request  |  -  |
| **404** | Not Found |  -  |


## getMountsSearch

> List&lt;MountListEntry&gt; getMountsSearch(language, game, query, filterFamilyName, limit)

Search Mounts

Search in all names and descriptions of mounts with a query.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MountsApi apiInstance = new MountsApi(defaultClient);
        String language = "en"; // String | a valid language code
        String game = "dofus2"; // String | 
        String query = "Dorée"; // String | case sensitive search query
        String filterFamilyName = "Dragodinde"; // String | only results with the translated family name
        Integer limit = 8; // Integer | maximum number of returned results
        try {
            List<MountListEntry> result = apiInstance.getMountsSearch(language, game, query, filterFamilyName, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MountsApi#getMountsSearch");
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
| **filterFamilyName** | **String**| only results with the translated family name | [optional] |
| **limit** | **Integer**| maximum number of returned results | [optional] [default to 8] |

### Return type

[**List&lt;MountListEntry&gt;**](MountListEntry.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mounts Found |  -  |
| **400** | Bad Request  Possibilities: - empty or no query  |  -  |
| **404** | Not Found  Possibilities: - no hits for query |  -  |


## getMountsSingle

> Mount getMountsSingle(language, ankamaId, game)

Single Mounts

Retrieve a specific mount with id.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MountsApi apiInstance = new MountsApi(defaultClient);
        String language = "en"; // String | a valid language code
        Integer ankamaId = 180; // Integer | identifier
        String game = "dofus2"; // String | 
        try {
            Mount result = apiInstance.getMountsSingle(language, ankamaId, game);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MountsApi#getMountsSingle");
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

[**Mount**](Mount.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mount Found |  -  |
| **400** | Bad Request  Possibilities: - invalid ankama id format  |  -  |
| **404** | Not Found  Possibilities: - nothing found for this ankama_id |  -  |

