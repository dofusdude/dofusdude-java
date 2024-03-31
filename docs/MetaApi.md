# MetaApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameSearchTypes**](MetaApi.md#getGameSearchTypes) | **GET** /dofus2/meta/search/types | Available Game Search Types |
| [**getMetaAlmanaxBonuses**](MetaApi.md#getMetaAlmanaxBonuses) | **GET** /dofus2/meta/{language}/almanax/bonuses | Available Almanax Bonuses |
| [**getMetaAlmanaxBonusesSearch**](MetaApi.md#getMetaAlmanaxBonusesSearch) | **GET** /dofus2/meta/{language}/almanax/bonuses/search | Search Available Almanax Bonuses |
| [**getMetaElements**](MetaApi.md#getMetaElements) | **GET** /dofus2/meta/elements | Effects and Condition Elements |



## getGameSearchTypes

> List&lt;String&gt; getGameSearchTypes()

Available Game Search Types

Get all types for /{game}/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MetaApi apiInstance = new MetaApi(defaultClient);
        try {
            List<String> result = apiInstance.getGameSearchTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetaApi#getGameSearchTypes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetaAlmanaxBonuses

> List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt; getMetaAlmanaxBonuses(language)

Available Almanax Bonuses

Get all the available bonuses and their id for filtering them in the range endpoint.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MetaApi apiInstance = new MetaApi(defaultClient);
        String language = "en"; // String | 
        try {
            List<GetMetaAlmanaxBonuses200ResponseInner> result = apiInstance.getMetaAlmanaxBonuses(language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetaApi#getMetaAlmanaxBonuses");
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
| **language** | **String**|  | [enum: en, fr, de, it, es] |

### Return type

[**List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;**](GetMetaAlmanaxBonuses200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetaAlmanaxBonusesSearch

> List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt; getMetaAlmanaxBonusesSearch(language, query, limit)

Search Available Almanax Bonuses

Search all the available bonuses and their id for filtering them in the range endpoint.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MetaApi apiInstance = new MetaApi(defaultClient);
        String language = "en"; // String | a valid language code
        String query = "abond"; // String | case sensitive search query
        Integer limit = 56; // Integer | maximum number of returned results
        try {
            List<GetMetaAlmanaxBonuses200ResponseInner> result = apiInstance.getMetaAlmanaxBonusesSearch(language, query, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetaApi#getMetaAlmanaxBonusesSearch");
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
| **language** | **String**| a valid language code | [enum: en, fr, de, it, es] |
| **query** | **String**| case sensitive search query | |
| **limit** | **Integer**| maximum number of returned results | [optional] |

### Return type

[**List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;**](GetMetaAlmanaxBonuses200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetaElements

> List&lt;String&gt; getMetaElements()

Effects and Condition Elements

Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.

### Example

```java
// Import classes:
import de.dofusdude.client.ApiClient;
import de.dofusdude.client.ApiException;
import de.dofusdude.client.Configuration;
import de.dofusdude.client.models.*;
import de.dofusdude.client.api.MetaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        MetaApi apiInstance = new MetaApi(defaultClient);
        try {
            List<String> result = apiInstance.getMetaElements();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetaApi#getMetaElements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

