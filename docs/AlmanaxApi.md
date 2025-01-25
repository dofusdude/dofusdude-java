# AlmanaxApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAlmanaxDate**](AlmanaxApi.md#getAlmanaxDate) | **GET** /dofus3/v1/{language}/almanax/{date} | Single Almanax Date |
| [**getAlmanaxRange**](AlmanaxApi.md#getAlmanaxRange) | **GET** /dofus3/v1/{language}/almanax | Almanax Range |


<a id="getAlmanaxDate"></a>
# **getAlmanaxDate**
> Almanax getAlmanaxDate(language, date, level)

Single Almanax Date

Get a single date. There are not more details in the returned object than the normal range endpoint.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.AlmanaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    AlmanaxApi apiInstance = new AlmanaxApi(defaultClient);
    String language = "en"; // String | code
    LocalDate date = LocalDate.parse("Sat Jan 25 00:00:00 UTC 2025"); // LocalDate | yyyy-mm-dd
    Integer level = 56; // Integer | character level for the reward_xp field
    try {
      Almanax result = apiInstance.getAlmanaxDate(language, date, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlmanaxApi#getAlmanaxDate");
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
| **language** | **String**| code | [enum: en, fr, de, it, es] |
| **date** | **LocalDate**| yyyy-mm-dd | |
| **level** | **Integer**| character level for the reward_xp field | [optional] |

### Return type

[**Almanax**](Almanax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a id="getAlmanaxRange"></a>
# **getAlmanaxRange**
> List&lt;Almanax&gt; getAlmanaxRange(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone, level)

Almanax Range

Get a range of dates, defaults to today + 6 following days but can specified by the query parameters.   filter[bonus_type] can be used seperately and does not have an effect on the other parameters.  range[from] changes the start date, everything else defaults to 6 following dates from this start date.  range[to] when used without anything else, it will use today as start date and this parameter as end. All ranges are inclusive.  range[from] + range[to] &#x3D; inclusive range over the specified dates, should never be farther apart than 35 days.  range[from|to] + range[size] no need to specify the date, just following days with [from] (0 is today) or go backwards in time with only [to] and [size].  Not all combinations are listed but this should give you an idea how to they could work.

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.AlmanaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    AlmanaxApi apiInstance = new AlmanaxApi(defaultClient);
    String language = "en"; // String | code
    String filterBonusType = "experience-points"; // String | ids from meta/{language}/almanax/bonuses
    LocalDate rangeFrom = LocalDate.now(); // LocalDate | yyyy-mm-dd
    LocalDate rangeTo = LocalDate.now(); // LocalDate | yyyy-mm-dd
    Integer rangeSize = -1; // Integer | Size of the returned range. Disable to fully use the range by setting size to -1.
    String timezone = "Europe/Paris"; // String | determine what the current time is. If you live in Brazil, \"today\" will be hours apart from Paris. Use your timezone to get results relative to your location.
    Integer level = 56; // Integer | character level for the reward_xp field
    try {
      List<Almanax> result = apiInstance.getAlmanaxRange(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone, level);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlmanaxApi#getAlmanaxRange");
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
| **language** | **String**| code | [enum: en, fr, de, it, es] |
| **filterBonusType** | **String**| ids from meta/{language}/almanax/bonuses | [optional] |
| **rangeFrom** | **LocalDate**| yyyy-mm-dd | [optional] |
| **rangeTo** | **LocalDate**| yyyy-mm-dd | [optional] |
| **rangeSize** | **Integer**| Size of the returned range. Disable to fully use the range by setting size to -1. | [optional] |
| **timezone** | **String**| determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. | [optional] [default to Europe/Paris] |
| **level** | **Integer**| character level for the reward_xp field | [optional] |

### Return type

[**List&lt;Almanax&gt;**](Almanax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

