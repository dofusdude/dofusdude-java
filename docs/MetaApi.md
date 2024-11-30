# MetaApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getGameSearchTypes**](MetaApi.md#getGameSearchTypes) | **GET** /dofus3beta/v1/meta/search/types | Available Game Search Types |
| [**getItemTypes**](MetaApi.md#getItemTypes) | **GET** /dofus3beta/v1/meta/items/types | Available Item Types |
| [**getMetaAlmanaxBonuses**](MetaApi.md#getMetaAlmanaxBonuses) | **GET** /dofus2/meta/{language}/almanax/bonuses | Available Almanax Bonuses |
| [**getMetaAlmanaxBonusesSearch**](MetaApi.md#getMetaAlmanaxBonusesSearch) | **GET** /dofus2/meta/{language}/almanax/bonuses/search | Search Available Almanax Bonuses |
| [**getMetaElements**](MetaApi.md#getMetaElements) | **GET** /dofus3beta/v1/meta/elements | Effects and Condition Elements |
| [**getMetaVersion**](MetaApi.md#getMetaVersion) | **GET** /dofus3beta/v1/meta/version | Game Version |


<a id="getGameSearchTypes"></a>
# **getGameSearchTypes**
> List&lt;String&gt; getGameSearchTypes()

Available Game Search Types

Get all types for /{game}/v1/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

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

<a id="getItemTypes"></a>
# **getItemTypes**
> List&lt;String&gt; getItemTypes()

Available Item Types

Get all types of all items. Primarily used for filtering more detailed types in listings or search endpoints. All names are english for comparing them inside applications. Ordering is not guaranteed to persist with game updates.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      List<String> result = apiInstance.getItemTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#getItemTypes");
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

<a id="getMetaAlmanaxBonuses"></a>
# **getMetaAlmanaxBonuses**
> List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt; getMetaAlmanaxBonuses(language)

Available Almanax Bonuses

Get all the available bonuses and their id for filtering them in the range endpoint.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    MetaApi apiInstance = new MetaApi(defaultClient);
    String language = "en"; // String | a valid language code
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
| **language** | **String**| a valid language code | [enum: en, fr, de, it, es] |

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

<a id="getMetaAlmanaxBonusesSearch"></a>
# **getMetaAlmanaxBonusesSearch**
> List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt; getMetaAlmanaxBonusesSearch(language, query, limit)

Search Available Almanax Bonuses

Search all the available bonuses and their id for filtering them in the range endpoint.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

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

<a id="getMetaElements"></a>
# **getMetaElements**
> List&lt;String&gt; getMetaElements()

Effects and Condition Elements

Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

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

<a id="getMetaVersion"></a>
# **getMetaVersion**
> Version getMetaVersion()

Game Version

The current game version of the hosted data.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.MetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    MetaApi apiInstance = new MetaApi(defaultClient);
    try {
      Version result = apiInstance.getMetaVersion();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetaApi#getMetaVersion");
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

[**Version**](Version.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

