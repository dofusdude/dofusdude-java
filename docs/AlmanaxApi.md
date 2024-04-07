# AlmanaxApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAlmanaxDate**](AlmanaxApi.md#getAlmanaxDate) | **GET** /dofus2/{language}/almanax/{date} | Single Almanax Date |
| [**getAlmanaxRange**](AlmanaxApi.md#getAlmanaxRange) | **GET** /dofus2/{language}/almanax | Almanax Range |


<a id="getAlmanaxDate"></a>
# **getAlmanaxDate**
> AlmanaxEntry getAlmanaxDate(language, date)

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
    LocalDate date = LocalDate.parse("Tue Jul 14 00:00:00 UTC 2020"); // LocalDate | yyyy-mm-dd
    try {
      AlmanaxEntry result = apiInstance.getAlmanaxDate(language, date);
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

### Return type

[**AlmanaxEntry**](AlmanaxEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAlmanaxRange"></a>
# **getAlmanaxRange**
> List&lt;AlmanaxEntry&gt; getAlmanaxRange(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone)

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
    LocalDate rangeFrom = LocalDate.parse("Thu Sep 15 00:00:00 UTC 2016"); // LocalDate | yyyy-mm-dd
    LocalDate rangeTo = LocalDate.parse("Wed Sep 28 00:00:00 UTC 2016"); // LocalDate | yyyy-mm-dd
    Integer rangeSize = -1; // Integer | size of the returned range
    String timezone = "Europe/Paris"; // String | determine what the current time is. If you live in Brazil, \"today\" will be hours apart from Paris. Use your timezone to get results relative to your location.
    try {
      List<AlmanaxEntry> result = apiInstance.getAlmanaxRange(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone);
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
| **rangeSize** | **Integer**| size of the returned range | [optional] |
| **timezone** | **String**| determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. | [optional] [default to Europe/Paris] |

### Return type

[**List&lt;AlmanaxEntry&gt;**](AlmanaxEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

