# WebhooksApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebhooksAlmanaxId**](WebhooksApi.md#deleteWebhooksAlmanaxId) | **DELETE** /webhooks/almanax/{id} | Unregister Almanax Hook |
| [**deleteWebhooksRssId**](WebhooksApi.md#deleteWebhooksRssId) | **DELETE** /webhooks/rss/{id} | Unregister RSS Hook |
| [**deleteWebhooksTwitterId**](WebhooksApi.md#deleteWebhooksTwitterId) | **DELETE** /webhooks/twitter/{id} | Unregister Twitter Hook |
| [**getMetaWebhooksAlmanax**](WebhooksApi.md#getMetaWebhooksAlmanax) | **GET** /meta/webhooks/almanax | Get Almanax Hook Metainfo |
| [**getMetaWebhooksRss**](WebhooksApi.md#getMetaWebhooksRss) | **GET** /meta/webhooks/rss | Get RSS Hook Metainfo |
| [**getMetaWebhooksTwitter**](WebhooksApi.md#getMetaWebhooksTwitter) | **GET** /meta/webhooks/twitter | Get Twitter Hook Metainfo |
| [**getWebhooksAlmanaxId**](WebhooksApi.md#getWebhooksAlmanaxId) | **GET** /webhooks/almanax/{id} | Get Almanax Hook |
| [**getWebhooksRssId**](WebhooksApi.md#getWebhooksRssId) | **GET** /webhooks/rss/{id} | Get RSS Hook |
| [**getWebhooksTwitterId**](WebhooksApi.md#getWebhooksTwitterId) | **GET** /webhooks/twitter/{id} | Get Twitter Hook |
| [**postWebhooksAlmanax**](WebhooksApi.md#postWebhooksAlmanax) | **POST** /webhooks/almanax | Register Almanax Hook |
| [**postWebhooksRss**](WebhooksApi.md#postWebhooksRss) | **POST** /webhooks/rss | Register RSS Hook |
| [**postWebhooksTwitter**](WebhooksApi.md#postWebhooksTwitter) | **POST** /webhooks/twitter | Register Twitter Hook |
| [**putWebhooksAlmanaxId**](WebhooksApi.md#putWebhooksAlmanaxId) | **PUT** /webhooks/almanax/{id} | Update Almanax Hook |
| [**putWebhooksRssId**](WebhooksApi.md#putWebhooksRssId) | **PUT** /webhooks/rss/{id} | Update RSS Hook |
| [**putWebhooksTwitterId**](WebhooksApi.md#putWebhooksTwitterId) | **PUT** /webhooks/twitter/{id} | Update Twitter Hook |



## deleteWebhooksAlmanaxId

> void deleteWebhooksAlmanaxId(id)

Unregister Almanax Hook

Delete a Webhook from the service.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            void result = apiInstance.deleteWebhooksAlmanaxId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhooksAlmanaxId");
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
| **id** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## deleteWebhooksRssId

> void deleteWebhooksRssId(id)

Unregister RSS Hook

Delete a Webhook from the service.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            void result = apiInstance.deleteWebhooksRssId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhooksRssId");
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
| **id** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## deleteWebhooksTwitterId

> void deleteWebhooksTwitterId(id)

Unregister Twitter Hook

Delete a Webhook from the service.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            void result = apiInstance.deleteWebhooksTwitterId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#deleteWebhooksTwitterId");
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
| **id** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |


## getMetaWebhooksAlmanax

> GetMetaWebhooksTwitter200Response getMetaWebhooksAlmanax()

Get Almanax Hook Metainfo

Get a list of all available subscriptions. 

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            GetMetaWebhooksTwitter200Response result = apiInstance.getMetaWebhooksAlmanax();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getMetaWebhooksAlmanax");
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

[**GetMetaWebhooksTwitter200Response**](GetMetaWebhooksTwitter200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetaWebhooksRss

> GetMetaWebhooksTwitter200Response getMetaWebhooksRss()

Get RSS Hook Metainfo

Get a list of all available subscriptions. 

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            GetMetaWebhooksTwitter200Response result = apiInstance.getMetaWebhooksRss();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getMetaWebhooksRss");
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

[**GetMetaWebhooksTwitter200Response**](GetMetaWebhooksTwitter200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMetaWebhooksTwitter

> GetMetaWebhooksTwitter200Response getMetaWebhooksTwitter()

Get Twitter Hook Metainfo

Get a list of all available subscriptions. 

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        try {
            GetMetaWebhooksTwitter200Response result = apiInstance.getMetaWebhooksTwitter();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getMetaWebhooksTwitter");
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

[**GetMetaWebhooksTwitter200Response**](GetMetaWebhooksTwitter200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getWebhooksAlmanaxId

> AlmanaxWebhook getWebhooksAlmanaxId(id)

Get Almanax Hook

Retrieve details about an existing Almanax Webhook with a given uuid.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            AlmanaxWebhook result = apiInstance.getWebhooksAlmanaxId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhooksAlmanaxId");
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
| **id** | **String**|  | |

### Return type

[**AlmanaxWebhook**](AlmanaxWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getWebhooksRssId

> RssWebhook getWebhooksRssId(id)

Get RSS Hook

Retrieve details about an existing RSS Webhook with a given uuid.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            RssWebhook result = apiInstance.getWebhooksRssId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhooksRssId");
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
| **id** | **String**|  | |

### Return type

[**RssWebhook**](RssWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getWebhooksTwitterId

> TwitterWebhook getWebhooksTwitterId(id)

Get Twitter Hook

Retrieve details about an existing Twitter Webhook with a given uuid.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            TwitterWebhook result = apiInstance.getWebhooksTwitterId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#getWebhooksTwitterId");
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
| **id** | **String**|  | |

### Return type

[**TwitterWebhook**](TwitterWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postWebhooksAlmanax

> void postWebhooksAlmanax(createAlmanaxWebhook)

Register Almanax Hook

Register a new Webhook to post Almanax updates.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateAlmanaxWebhook createAlmanaxWebhook = new CreateAlmanaxWebhook(); // CreateAlmanaxWebhook | 
        try {
            void result = apiInstance.postWebhooksAlmanax(createAlmanaxWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksAlmanax");
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
| **createAlmanaxWebhook** | [**CreateAlmanaxWebhook**](CreateAlmanaxWebhook.md)|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postWebhooksRss

> void postWebhooksRss(createRSSWebhook)

Register RSS Hook

Register a new Webhook to post RSS news as soon as they are posted.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateRSSWebhook createRSSWebhook = new CreateRSSWebhook(); // CreateRSSWebhook | 
        try {
            void result = apiInstance.postWebhooksRss(createRSSWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksRss");
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
| **createRSSWebhook** | [**CreateRSSWebhook**](CreateRSSWebhook.md)|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## postWebhooksTwitter

> void postWebhooksTwitter(createTwitterWebhook)

Register Twitter Hook

Register a new Webhook to post Twitter updates as soon as they are posted.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        CreateTwitterWebhook createTwitterWebhook = new CreateTwitterWebhook(); // CreateTwitterWebhook | 
        try {
            void result = apiInstance.postWebhooksTwitter(createTwitterWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksTwitter");
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
| **createTwitterWebhook** | [**CreateTwitterWebhook**](CreateTwitterWebhook.md)|  | [optional] |

### Return type

[**void**](Void.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putWebhooksAlmanaxId

> AlmanaxWebhook putWebhooksAlmanaxId(id, putAlmanaxWebhook)

Update Almanax Hook

Update the details of an Almanax Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        PutAlmanaxWebhook putAlmanaxWebhook = new PutAlmanaxWebhook(); // PutAlmanaxWebhook | 
        try {
            AlmanaxWebhook result = apiInstance.putWebhooksAlmanaxId(id, putAlmanaxWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#putWebhooksAlmanaxId");
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
| **id** | **String**|  | |
| **putAlmanaxWebhook** | [**PutAlmanaxWebhook**](PutAlmanaxWebhook.md)|  | [optional] |

### Return type

[**AlmanaxWebhook**](AlmanaxWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putWebhooksRssId

> RssWebhook putWebhooksRssId(id, putRSSWebhook)

Update RSS Hook

Update the details of a RSS Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        PutRSSWebhook putRSSWebhook = new PutRSSWebhook(); // PutRSSWebhook | 
        try {
            RssWebhook result = apiInstance.putWebhooksRssId(id, putRSSWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#putWebhooksRssId");
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
| **id** | **String**|  | |
| **putRSSWebhook** | [**PutRSSWebhook**](PutRSSWebhook.md)|  | [optional] |

### Return type

[**RssWebhook**](RssWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## putWebhooksTwitterId

> TwitterWebhook putWebhooksTwitterId(id, putTwitterWebhook)

Update Twitter Hook

Update the details of a Twitter Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.

### Example

```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dofusdu.de");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String id = "id_example"; // String | 
        PutTwitterWebhook putTwitterWebhook = new PutTwitterWebhook(); // PutTwitterWebhook | 
        try {
            TwitterWebhook result = apiInstance.putWebhooksTwitterId(id, putTwitterWebhook);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#putWebhooksTwitterId");
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
| **id** | **String**|  | |
| **putTwitterWebhook** | [**PutTwitterWebhook**](PutTwitterWebhook.md)|  | [optional] |

### Return type

[**TwitterWebhook**](TwitterWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

