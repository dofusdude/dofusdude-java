/*
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [PHP](https://github.com/dofusdude/dofusdude-php) - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 0.9.2
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


import com.dofusdude.client.model.GetMetaAlmanaxBonuses200ResponseInner;
import com.dofusdude.client.model.GetMetaVersion200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetaApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public MetaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetaApi(ApiClient apiClient) {
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
     * Build call for getGameSearchTypes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGameSearchTypesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/search/types";

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
    private okhttp3.Call getGameSearchTypesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getGameSearchTypesCall(_callback);

    }

    /**
     * Available Game Search Types
     * Get all types for /{game}/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> getGameSearchTypes() throws ApiException {
        ApiResponse<List<String>> localVarResp = getGameSearchTypesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Available Game Search Types
     * Get all types for /{game}/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> getGameSearchTypesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getGameSearchTypesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Available Game Search Types (asynchronously)
     * Get all types for /{game}/{lang}/search available for filtering. All names are english for comparing them inside applications. Order is fixed so you can compare indices instead of strings.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGameSearchTypesAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGameSearchTypesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getItemTypes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getItemTypesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/items/types";

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
    private okhttp3.Call getItemTypesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getItemTypesCall(_callback);

    }

    /**
     * Available Item Types
     * Get all types of all items. Primarily used for filtering more detailed types in listings or search endpoints. All names are english for comparing them inside applications. Ordering is not guaranteed to persist with game updates.
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> getItemTypes() throws ApiException {
        ApiResponse<List<String>> localVarResp = getItemTypesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Available Item Types
     * Get all types of all items. Primarily used for filtering more detailed types in listings or search endpoints. All names are english for comparing them inside applications. Ordering is not guaranteed to persist with game updates.
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> getItemTypesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getItemTypesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Available Item Types (asynchronously)
     * Get all types of all items. Primarily used for filtering more detailed types in listings or search endpoints. All names are english for comparing them inside applications. Ordering is not guaranteed to persist with game updates.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getItemTypesAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getItemTypesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetaAlmanaxBonuses
     * @param language  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaAlmanaxBonusesCall(String language, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/{language}/almanax/bonuses"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()));

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
    private okhttp3.Call getMetaAlmanaxBonusesValidateBeforeCall(String language, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getMetaAlmanaxBonuses(Async)");
        }

        return getMetaAlmanaxBonusesCall(language, _callback);

    }

    /**
     * Available Almanax Bonuses
     * Get all the available bonuses and their id for filtering them in the range endpoint.
     * @param language  (required)
     * @return List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<GetMetaAlmanaxBonuses200ResponseInner> getMetaAlmanaxBonuses(String language) throws ApiException {
        ApiResponse<List<GetMetaAlmanaxBonuses200ResponseInner>> localVarResp = getMetaAlmanaxBonusesWithHttpInfo(language);
        return localVarResp.getData();
    }

    /**
     * Available Almanax Bonuses
     * Get all the available bonuses and their id for filtering them in the range endpoint.
     * @param language  (required)
     * @return ApiResponse&lt;List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GetMetaAlmanaxBonuses200ResponseInner>> getMetaAlmanaxBonusesWithHttpInfo(String language) throws ApiException {
        okhttp3.Call localVarCall = getMetaAlmanaxBonusesValidateBeforeCall(language, null);
        Type localVarReturnType = new TypeToken<List<GetMetaAlmanaxBonuses200ResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Available Almanax Bonuses (asynchronously)
     * Get all the available bonuses and their id for filtering them in the range endpoint.
     * @param language  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaAlmanaxBonusesAsync(String language, final ApiCallback<List<GetMetaAlmanaxBonuses200ResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaAlmanaxBonusesValidateBeforeCall(language, _callback);
        Type localVarReturnType = new TypeToken<List<GetMetaAlmanaxBonuses200ResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetaAlmanaxBonusesSearch
     * @param language a valid language code (required)
     * @param query case sensitive search query (required)
     * @param limit maximum number of returned results (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaAlmanaxBonusesSearchCall(String language, String query, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/{language}/almanax/bonuses/search"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call getMetaAlmanaxBonusesSearchValidateBeforeCall(String language, String query, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getMetaAlmanaxBonusesSearch(Async)");
        }

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getMetaAlmanaxBonusesSearch(Async)");
        }

        return getMetaAlmanaxBonusesSearchCall(language, query, limit, _callback);

    }

    /**
     * Search Available Almanax Bonuses
     * Search all the available bonuses and their id for filtering them in the range endpoint.
     * @param language a valid language code (required)
     * @param query case sensitive search query (required)
     * @param limit maximum number of returned results (optional)
     * @return List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<GetMetaAlmanaxBonuses200ResponseInner> getMetaAlmanaxBonusesSearch(String language, String query, Integer limit) throws ApiException {
        ApiResponse<List<GetMetaAlmanaxBonuses200ResponseInner>> localVarResp = getMetaAlmanaxBonusesSearchWithHttpInfo(language, query, limit);
        return localVarResp.getData();
    }

    /**
     * Search Available Almanax Bonuses
     * Search all the available bonuses and their id for filtering them in the range endpoint.
     * @param language a valid language code (required)
     * @param query case sensitive search query (required)
     * @param limit maximum number of returned results (optional)
     * @return ApiResponse&lt;List&lt;GetMetaAlmanaxBonuses200ResponseInner&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GetMetaAlmanaxBonuses200ResponseInner>> getMetaAlmanaxBonusesSearchWithHttpInfo(String language, String query, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getMetaAlmanaxBonusesSearchValidateBeforeCall(language, query, limit, null);
        Type localVarReturnType = new TypeToken<List<GetMetaAlmanaxBonuses200ResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Available Almanax Bonuses (asynchronously)
     * Search all the available bonuses and their id for filtering them in the range endpoint.
     * @param language a valid language code (required)
     * @param query case sensitive search query (required)
     * @param limit maximum number of returned results (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaAlmanaxBonusesSearchAsync(String language, String query, Integer limit, final ApiCallback<List<GetMetaAlmanaxBonuses200ResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaAlmanaxBonusesSearchValidateBeforeCall(language, query, limit, _callback);
        Type localVarReturnType = new TypeToken<List<GetMetaAlmanaxBonuses200ResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetaElements
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaElementsCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/elements";

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
    private okhttp3.Call getMetaElementsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getMetaElementsCall(_callback);

    }

    /**
     * Effects and Condition Elements
     * Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.
     * @return List&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public List<String> getMetaElements() throws ApiException {
        ApiResponse<List<String>> localVarResp = getMetaElementsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Effects and Condition Elements
     * Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<String>> getMetaElementsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getMetaElementsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Effects and Condition Elements (asynchronously)
     * Get the mappings for all specific elements that are linked in the dataset. All names are english. Translations are not needed because of a global unique id which is the index inside the array. Future elements will get a higher id.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaElementsAsync(final ApiCallback<List<String>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaElementsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<String>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getMetaVersion
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaVersionCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/dofus2/meta/version";

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
    private okhttp3.Call getMetaVersionValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getMetaVersionCall(_callback);

    }

    /**
     * Game Version
     * The current game version of the hosted data.
     * @return GetMetaVersion200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetMetaVersion200Response getMetaVersion() throws ApiException {
        ApiResponse<GetMetaVersion200Response> localVarResp = getMetaVersionWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Game Version
     * The current game version of the hosted data.
     * @return ApiResponse&lt;GetMetaVersion200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetMetaVersion200Response> getMetaVersionWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getMetaVersionValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetMetaVersion200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Game Version (asynchronously)
     * The current game version of the hosted data.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getMetaVersionAsync(final ApiCallback<GetMetaVersion200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getMetaVersionValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetMetaVersion200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
