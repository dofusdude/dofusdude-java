# GameDataApi

All URIs are relative to *https://api.dofusdu.de*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllAreas**](GameDataApi.md#getAllAreas) | **GET** /{game}/v1/{language}/areas/all | Get all areas |
| [**getAllClasses**](GameDataApi.md#getAllClasses) | **GET** /{game}/v1/{language}/classes/all | Get all classes |
| [**getAllMonsters**](GameDataApi.md#getAllMonsters) | **GET** /{game}/v1/{language}/monsters/all | Get all monsters |
| [**getAllSpells**](GameDataApi.md#getAllSpells) | **GET** /{game}/v1/{language}/spells/all | Get all spells |
| [**getAllSubareas**](GameDataApi.md#getAllSubareas) | **GET** /{game}/v1/{language}/subareas/all | Get all subareas |
| [**getAllSuperAreas**](GameDataApi.md#getAllSuperAreas) | **GET** /{game}/v1/{language}/super-areas/all | Get all super-areas |
| [**getAreaById**](GameDataApi.md#getAreaById) | **GET** /{game}/v1/{language}/areas/{ankama_id} | Get one area |
| [**getAreas**](GameDataApi.md#getAreas) | **GET** /{game}/v1/{language}/areas | List areas |
| [**getClassById**](GameDataApi.md#getClassById) | **GET** /{game}/v1/{language}/classes/{ankama_id} | Get one class |
| [**getClasses**](GameDataApi.md#getClasses) | **GET** /{game}/v1/{language}/classes | List classes |
| [**getMonsterById**](GameDataApi.md#getMonsterById) | **GET** /{game}/v1/{language}/monsters/{ankama_id} | Get one monster |
| [**getMonsters**](GameDataApi.md#getMonsters) | **GET** /{game}/v1/{language}/monsters | List monsters |
| [**getSpellById**](GameDataApi.md#getSpellById) | **GET** /{game}/v1/{language}/spells/{ankama_id} | Get one spell |
| [**getSpells**](GameDataApi.md#getSpells) | **GET** /{game}/v1/{language}/spells | List spells |
| [**getSubareaById**](GameDataApi.md#getSubareaById) | **GET** /{game}/v1/{language}/subareas/{ankama_id} | Get one subarea |
| [**getSubareas**](GameDataApi.md#getSubareas) | **GET** /{game}/v1/{language}/subareas | List subareas |
| [**getSuperAreaById**](GameDataApi.md#getSuperAreaById) | **GET** /{game}/v1/{language}/super-areas/{ankama_id} | Get one super-area |
| [**getSuperAreas**](GameDataApi.md#getSuperAreas) | **GET** /{game}/v1/{language}/super-areas | List super-areas |
| [**searchAreas**](GameDataApi.md#searchAreas) | **GET** /{game}/v1/{language}/areas/search | Search areas |
| [**searchClasses**](GameDataApi.md#searchClasses) | **GET** /{game}/v1/{language}/classes/search | Search classes |
| [**searchMonsters**](GameDataApi.md#searchMonsters) | **GET** /{game}/v1/{language}/monsters/search | Search monsters |
| [**searchSpells**](GameDataApi.md#searchSpells) | **GET** /{game}/v1/{language}/spells/search | Search spells |
| [**searchSubareas**](GameDataApi.md#searchSubareas) | **GET** /{game}/v1/{language}/subareas/search | Search subareas |
| [**searchSuperAreas**](GameDataApi.md#searchSuperAreas) | **GET** /{game}/v1/{language}/super-areas/search | Search super-areas |


<a id="getAllAreas"></a>
# **getAllAreas**
> MappedEntityCollection getAllAreas(game, language)

Get all areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAllAreas(game, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized area document. |  -  |

<a id="getAllClasses"></a>
# **getAllClasses**
> MappedEntityCollection getAllClasses(game, language)

Get all classes

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAllClasses(game, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllClasses");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized class document. |  -  |

<a id="getAllMonsters"></a>
# **getAllMonsters**
> MappedEntityCollection getAllMonsters(game, language, include)

Get all monsters

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String include = "spells.grade"; // String | Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. `spells.grade` inlines that grade only; `spells` inlines the complete spell with every available grade.
    try {
      MappedEntityCollection result = apiInstance.getAllMonsters(game, language, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllMonsters");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **include** | **String**| Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. &#x60;spells.grade&#x60; inlines that grade only; &#x60;spells&#x60; inlines the complete spell with every available grade. | [optional] [enum: spells.grade, spells] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized monster document. |  -  |

<a id="getAllSpells"></a>
# **getAllSpells**
> MappedEntityCollection getAllSpells(game, language)

Get all spells

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAllSpells(game, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllSpells");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized spell document. |  -  |

<a id="getAllSubareas"></a>
# **getAllSubareas**
> MappedEntityCollection getAllSubareas(game, language)

Get all subareas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAllSubareas(game, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllSubareas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized subarea document. |  -  |

<a id="getAllSuperAreas"></a>
# **getAllSuperAreas**
> MappedEntityCollection getAllSuperAreas(game, language)

Get all super-areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAllSuperAreas(game, language);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAllSuperAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Every complete localized super-area document. |  -  |

<a id="getAreaById"></a>
# **getAreaById**
> WorldArea getAreaById(game, language, ankamaId)

Get one area

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    try {
      WorldArea result = apiInstance.getAreaById(game, language, ankamaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAreaById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |

### Return type

[**WorldArea**](WorldArea.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized area document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getAreas"></a>
# **getAreas**
> MappedEntityCollection getAreas(game, language, pageNumber, pageSize, fieldsAreas)

List areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsAreas = "all"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getAreas(game, language, pageNumber, pageSize, fieldsAreas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsAreas** | **String**|  | [optional] [enum: all] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated areas. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="getClassById"></a>
# **getClassById**
> ModelClass getClassById(game, language, ankamaId)

Get one class

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    try {
      ModelClass result = apiInstance.getClassById(game, language, ankamaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getClassById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |

### Return type

[**ModelClass**](ModelClass.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized class document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getClasses"></a>
# **getClasses**
> MappedEntityCollection getClasses(game, language, pageNumber, pageSize, fieldsClasses)

List classes

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsClasses = "all"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getClasses(game, language, pageNumber, pageSize, fieldsClasses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getClasses");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsClasses** | **String**|  | [optional] [enum: all] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated classes. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="getMonsterById"></a>
# **getMonsterById**
> Monster getMonsterById(game, language, ankamaId, include)

Get one monster

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    String include = "spells.grade"; // String | Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. `spells.grade` inlines that grade only; `spells` inlines the complete spell with every available grade.
    try {
      Monster result = apiInstance.getMonsterById(game, language, ankamaId, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getMonsterById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |
| **include** | **String**| Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. &#x60;spells.grade&#x60; inlines that grade only; &#x60;spells&#x60; inlines the complete spell with every available grade. | [optional] [enum: spells.grade, spells] |

### Return type

[**Monster**](Monster.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized monster document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getMonsters"></a>
# **getMonsters**
> MappedEntityCollection getMonsters(game, language, pageNumber, pageSize, fieldsMonsters, include)

List monsters

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsMonsters = "all"; // String | 
    String include = "spells.grade"; // String | Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. `spells.grade` inlines that grade only; `spells` inlines the complete spell with every available grade.
    try {
      MappedEntityCollection result = apiInstance.getMonsters(game, language, pageNumber, pageSize, fieldsMonsters, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getMonsters");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsMonsters** | **String**|  | [optional] [enum: all] |
| **include** | **String**| Controls monster spell relationships. By default each monster grade contains a compact relationship whose URL selects the assigned spell grade. &#x60;spells.grade&#x60; inlines that grade only; &#x60;spells&#x60; inlines the complete spell with every available grade. | [optional] [enum: spells.grade, spells] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated monsters. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="getSpellById"></a>
# **getSpellById**
> Spell getSpellById(game, language, ankamaId, grade)

Get one spell

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    Integer grade = 56; // Integer | Return only the requested mapped spell grade in `levels`.
    try {
      Spell result = apiInstance.getSpellById(game, language, ankamaId, grade);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSpellById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |
| **grade** | **Integer**| Return only the requested mapped spell grade in &#x60;levels&#x60;. | [optional] |

### Return type

[**Spell**](Spell.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized spell document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getSpells"></a>
# **getSpells**
> MappedEntityCollection getSpells(game, language, pageNumber, pageSize, fieldsSpells)

List spells

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsSpells = "all"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getSpells(game, language, pageNumber, pageSize, fieldsSpells);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSpells");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsSpells** | **String**|  | [optional] [enum: all] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated spells. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="getSubareaById"></a>
# **getSubareaById**
> WorldArea getSubareaById(game, language, ankamaId)

Get one subarea

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    try {
      WorldArea result = apiInstance.getSubareaById(game, language, ankamaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSubareaById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |

### Return type

[**WorldArea**](WorldArea.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized subarea document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getSubareas"></a>
# **getSubareas**
> MappedEntityCollection getSubareas(game, language, pageNumber, pageSize, fieldsSubareas)

List subareas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsSubareas = "all"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getSubareas(game, language, pageNumber, pageSize, fieldsSubareas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSubareas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsSubareas** | **String**|  | [optional] [enum: all] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated subareas. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="getSuperAreaById"></a>
# **getSuperAreaById**
> WorldArea getSuperAreaById(game, language, ankamaId)

Get one super-area

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer ankamaId = 56; // Integer | 
    try {
      WorldArea result = apiInstance.getSuperAreaById(game, language, ankamaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSuperAreaById");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **ankamaId** | **Integer**|  | |

### Return type

[**WorldArea**](WorldArea.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Complete localized super-area document. |  -  |
| **404** | Entity not found. |  -  |

<a id="getSuperAreas"></a>
# **getSuperAreas**
> MappedEntityCollection getSuperAreas(game, language, pageNumber, pageSize, fieldsSuperAreas)

List super-areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    Integer pageNumber = 1; // Integer | 
    Integer pageSize = 20; // Integer | 
    String fieldsSuperAreas = "all"; // String | 
    try {
      MappedEntityCollection result = apiInstance.getSuperAreas(game, language, pageNumber, pageSize, fieldsSuperAreas);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#getSuperAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**|  | [optional] [default to 20] |
| **fieldsSuperAreas** | **String**|  | [optional] [enum: all] |

### Return type

[**MappedEntityCollection**](MappedEntityCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated super-areas. |  -  |
| **400** | Invalid pagination or field selection. |  -  |

<a id="searchAreas"></a>
# **searchAreas**
> List&lt;MappedEntityListEntry&gt; searchAreas(game, language, query, limit)

Search areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchAreas(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

<a id="searchClasses"></a>
# **searchClasses**
> List&lt;MappedEntityListEntry&gt; searchClasses(game, language, query, limit)

Search classes

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchClasses(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchClasses");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

<a id="searchMonsters"></a>
# **searchMonsters**
> List&lt;MappedEntityListEntry&gt; searchMonsters(game, language, query, limit)

Search monsters

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchMonsters(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchMonsters");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

<a id="searchSpells"></a>
# **searchSpells**
> List&lt;MappedEntityListEntry&gt; searchSpells(game, language, query, limit)

Search spells

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchSpells(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchSpells");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

<a id="searchSubareas"></a>
# **searchSubareas**
> List&lt;MappedEntityListEntry&gt; searchSubareas(game, language, query, limit)

Search subareas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchSubareas(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchSubareas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

<a id="searchSuperAreas"></a>
# **searchSuperAreas**
> List&lt;MappedEntityListEntry&gt; searchSuperAreas(game, language, query, limit)

Search super-areas

### Example
```java
// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.models.*;
import com.dofusdude.client.api.GameDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    GameDataApi apiInstance = new GameDataApi(defaultClient);
    String game = "dofus3"; // String | 
    String language = "en"; // String | 
    String query = "query_example"; // String | 
    Integer limit = 8; // Integer | 
    try {
      List<MappedEntityListEntry> result = apiInstance.searchSuperAreas(game, language, query, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataApi#searchSuperAreas");
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
| **game** | **String**|  | [enum: dofus3, dofus3beta] |
| **language** | **String**|  | [enum: en, fr, de, es, pt] |
| **query** | **String**|  | |
| **limit** | **Integer**|  | [optional] [default to 8] |

### Return type

[**List&lt;MappedEntityListEntry&gt;**](MappedEntityListEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Matching localized summaries. |  -  |
| **404** | No matching entities. |  -  |

