/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0-rc.3
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.api;

import com.dofusdude.client.ApiCallback;
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.ApiResponse;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.Pair;
import com.dofusdude.client.ProgressRequestBody;
import com.dofusdude.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.dofusdude.client.model.Almanax;
import java.time.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlmanaxApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlmanaxApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlmanaxApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAlmanaxDate
     * @param language code (required)
     * @param date yyyy-mm-dd (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAlmanaxDateCall(String language, LocalDate date, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dofus2/{language}/almanax/{date}"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()))
            .replace("{" + "date" + "}", localVarApiClient.escapeString(date.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAlmanaxDateValidateBeforeCall(String language, LocalDate date, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getAlmanaxDate(Async)");
        }

        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling getAlmanaxDate(Async)");
        }

        return getAlmanaxDateCall(language, date, _callback);

    }

    /**
     * Single Almanax Date
     * Get a single date. There are not more details in the returned object than the normal range endpoint.
     * @param language code (required)
     * @param date yyyy-mm-dd (required)
     * @return Almanax
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public Almanax getAlmanaxDate(String language, LocalDate date) throws ApiException {
        ApiResponse<Almanax> localVarResp = getAlmanaxDateWithHttpInfo(language, date);
        return localVarResp.getData();
    }

    /**
     * Single Almanax Date
     * Get a single date. There are not more details in the returned object than the normal range endpoint.
     * @param language code (required)
     * @param date yyyy-mm-dd (required)
     * @return ApiResponse&lt;Almanax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Almanax> getAlmanaxDateWithHttpInfo(String language, LocalDate date) throws ApiException {
        okhttp3.Call localVarCall = getAlmanaxDateValidateBeforeCall(language, date, null);
        Type localVarReturnType = new TypeToken<Almanax>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Single Almanax Date (asynchronously)
     * Get a single date. There are not more details in the returned object than the normal range endpoint.
     * @param language code (required)
     * @param date yyyy-mm-dd (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAlmanaxDateAsync(String language, LocalDate date, final ApiCallback<Almanax> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlmanaxDateValidateBeforeCall(language, date, _callback);
        Type localVarReturnType = new TypeToken<Almanax>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAlmanaxRange
     * @param language code (required)
     * @param filterBonusType ids from meta/{language}/almanax/bonuses (optional)
     * @param rangeFrom yyyy-mm-dd (optional)
     * @param rangeTo yyyy-mm-dd (optional)
     * @param rangeSize size of the returned range (optional)
     * @param timezone determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. (optional, default to Europe/Paris)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAlmanaxRangeCall(String language, String filterBonusType, LocalDate rangeFrom, LocalDate rangeTo, Integer rangeSize, String timezone, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dofus2/{language}/almanax"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filterBonusType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[bonus_type]", filterBonusType));
        }

        if (rangeFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("range[from]", rangeFrom));
        }

        if (rangeTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("range[to]", rangeTo));
        }

        if (rangeSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("range[size]", rangeSize));
        }

        if (timezone != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timezone", timezone));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAlmanaxRangeValidateBeforeCall(String language, String filterBonusType, LocalDate rangeFrom, LocalDate rangeTo, Integer rangeSize, String timezone, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getAlmanaxRange(Async)");
        }

        return getAlmanaxRangeCall(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone, _callback);

    }

    /**
     * Almanax Range
     * Get a range of dates, defaults to today + 6 following days but can specified by the query parameters.   filter[bonus_type] can be used seperately and does not have an effect on the other parameters.  range[from] changes the start date, everything else defaults to 6 following dates from this start date.  range[to] when used without anything else, it will use today as start date and this parameter as end. All ranges are inclusive.  range[from] + range[to] &#x3D; inclusive range over the specified dates, should never be farther apart than 35 days.  range[from|to] + range[size] no need to specify the date, just following days with [from] (0 is today) or go backwards in time with only [to] and [size].  Not all combinations are listed but this should give you an idea how to they could work.
     * @param language code (required)
     * @param filterBonusType ids from meta/{language}/almanax/bonuses (optional)
     * @param rangeFrom yyyy-mm-dd (optional)
     * @param rangeTo yyyy-mm-dd (optional)
     * @param rangeSize size of the returned range (optional)
     * @param timezone determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. (optional, default to Europe/Paris)
     * @return List&lt;Almanax&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<Almanax> getAlmanaxRange(String language, String filterBonusType, LocalDate rangeFrom, LocalDate rangeTo, Integer rangeSize, String timezone) throws ApiException {
        ApiResponse<List<Almanax>> localVarResp = getAlmanaxRangeWithHttpInfo(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone);
        return localVarResp.getData();
    }

    /**
     * Almanax Range
     * Get a range of dates, defaults to today + 6 following days but can specified by the query parameters.   filter[bonus_type] can be used seperately and does not have an effect on the other parameters.  range[from] changes the start date, everything else defaults to 6 following dates from this start date.  range[to] when used without anything else, it will use today as start date and this parameter as end. All ranges are inclusive.  range[from] + range[to] &#x3D; inclusive range over the specified dates, should never be farther apart than 35 days.  range[from|to] + range[size] no need to specify the date, just following days with [from] (0 is today) or go backwards in time with only [to] and [size].  Not all combinations are listed but this should give you an idea how to they could work.
     * @param language code (required)
     * @param filterBonusType ids from meta/{language}/almanax/bonuses (optional)
     * @param rangeFrom yyyy-mm-dd (optional)
     * @param rangeTo yyyy-mm-dd (optional)
     * @param rangeSize size of the returned range (optional)
     * @param timezone determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. (optional, default to Europe/Paris)
     * @return ApiResponse&lt;List&lt;Almanax&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Almanax>> getAlmanaxRangeWithHttpInfo(String language, String filterBonusType, LocalDate rangeFrom, LocalDate rangeTo, Integer rangeSize, String timezone) throws ApiException {
        okhttp3.Call localVarCall = getAlmanaxRangeValidateBeforeCall(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone, null);
        Type localVarReturnType = new TypeToken<List<Almanax>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Almanax Range (asynchronously)
     * Get a range of dates, defaults to today + 6 following days but can specified by the query parameters.   filter[bonus_type] can be used seperately and does not have an effect on the other parameters.  range[from] changes the start date, everything else defaults to 6 following dates from this start date.  range[to] when used without anything else, it will use today as start date and this parameter as end. All ranges are inclusive.  range[from] + range[to] &#x3D; inclusive range over the specified dates, should never be farther apart than 35 days.  range[from|to] + range[size] no need to specify the date, just following days with [from] (0 is today) or go backwards in time with only [to] and [size].  Not all combinations are listed but this should give you an idea how to they could work.
     * @param language code (required)
     * @param filterBonusType ids from meta/{language}/almanax/bonuses (optional)
     * @param rangeFrom yyyy-mm-dd (optional)
     * @param rangeTo yyyy-mm-dd (optional)
     * @param rangeSize size of the returned range (optional)
     * @param timezone determine what the current time is. If you live in Brazil, \&quot;today\&quot; will be hours apart from Paris. Use your timezone to get results relative to your location. (optional, default to Europe/Paris)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAlmanaxRangeAsync(String language, String filterBonusType, LocalDate rangeFrom, LocalDate rangeTo, Integer rangeSize, String timezone, final ApiCallback<List<Almanax>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAlmanaxRangeValidateBeforeCall(language, filterBonusType, rangeFrom, rangeTo, rangeSize, timezone, _callback);
        Type localVarReturnType = new TypeToken<List<Almanax>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
