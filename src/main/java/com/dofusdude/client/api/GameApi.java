/*
 * dofusdude
 * # Open Ankama Developer Community The all-in-one toolbelt for your next Ankama related project.  ## Versions - [Dofus 2](https://docs.dofusdu.de/dofus2/) - [Dofus 3](https://docs.dofusdu.de/dofus3/)   - v1 [latest] (you are here)   ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Official Sources** generated from actual data from the game.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 1.0.0
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


import com.dofusdude.client.model.Error;
import com.dofusdude.client.model.GameSearch;
import com.dofusdude.client.model.ListItemGeneral;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GameApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GameApi(ApiClient apiClient) {
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
     * Build call for getGameSearch
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query search query (required)
     * @param filterSearchIndex only results with all specific type (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param fieldsItem adds fields from the item search to the list entries if the hit is an item. Multiple comma separated values allowed. (optional)
     * @param filterTypeNameId multi-filter results with the english item type name, including \&quot;mount\&quot; and \&quot;set\&quot; from filter[search_index]. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGameSearchCall(String language, String game, String query, Set<String> filterSearchIndex, Integer limit, Set<String> fieldsItem, Set<String> filterTypeNameId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/{game}/v1/{language}/search"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()))
            .replace("{" + "game" + "}", localVarApiClient.escapeString(game.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (filterSearchIndex != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "filter[search_index]", filterSearchIndex));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (fieldsItem != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields[item]", fieldsItem));
        }

        if (filterTypeNameId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "filter[type.name_id]", filterTypeNameId));
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
    private okhttp3.Call getGameSearchValidateBeforeCall(String language, String game, String query, Set<String> filterSearchIndex, Integer limit, Set<String> fieldsItem, Set<String> filterTypeNameId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getGameSearch(Async)");
        }

        // verify the required parameter 'game' is set
        if (game == null) {
            throw new ApiException("Missing the required parameter 'game' when calling getGameSearch(Async)");
        }

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getGameSearch(Async)");
        }

        return getGameSearchCall(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId, _callback);

    }

    /**
     * Game Search
     * Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus3/meta/search/types.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query search query (required)
     * @param filterSearchIndex only results with all specific type (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param fieldsItem adds fields from the item search to the list entries if the hit is an item. Multiple comma separated values allowed. (optional)
     * @param filterTypeNameId multi-filter results with the english item type name, including \&quot;mount\&quot; and \&quot;set\&quot; from filter[search_index]. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @return List&lt;GameSearch&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<GameSearch> getGameSearch(String language, String game, String query, Set<String> filterSearchIndex, Integer limit, Set<String> fieldsItem, Set<String> filterTypeNameId) throws ApiException {
        ApiResponse<List<GameSearch>> localVarResp = getGameSearchWithHttpInfo(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId);
        return localVarResp.getData();
    }

    /**
     * Game Search
     * Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus3/meta/search/types.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query search query (required)
     * @param filterSearchIndex only results with all specific type (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param fieldsItem adds fields from the item search to the list entries if the hit is an item. Multiple comma separated values allowed. (optional)
     * @param filterTypeNameId multi-filter results with the english item type name, including \&quot;mount\&quot; and \&quot;set\&quot; from filter[search_index]. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @return ApiResponse&lt;List&lt;GameSearch&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<GameSearch>> getGameSearchWithHttpInfo(String language, String game, String query, Set<String> filterSearchIndex, Integer limit, Set<String> fieldsItem, Set<String> filterTypeNameId) throws ApiException {
        okhttp3.Call localVarCall = getGameSearchValidateBeforeCall(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId, null);
        Type localVarReturnType = new TypeToken<List<GameSearch>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Game Search (asynchronously)
     * Search in all names and descriptions of all supported types in the game. For the list of supported types see the endpoint /dofus3/meta/search/types.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query search query (required)
     * @param filterSearchIndex only results with all specific type (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param fieldsItem adds fields from the item search to the list entries if the hit is an item. Multiple comma separated values allowed. (optional)
     * @param filterTypeNameId multi-filter results with the english item type name, including \&quot;mount\&quot; and \&quot;set\&quot; from filter[search_index]. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGameSearchAsync(String language, String game, String query, Set<String> filterSearchIndex, Integer limit, Set<String> fieldsItem, Set<String> filterTypeNameId, final ApiCallback<List<GameSearch>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGameSearchValidateBeforeCall(language, game, query, filterSearchIndex, limit, fieldsItem, filterTypeNameId, _callback);
        Type localVarReturnType = new TypeToken<List<GameSearch>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getItemsAllSearch
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query case sensitive search query (required)
     * @param filterMinLevel only results which level is equal or above this value (optional)
     * @param filterMaxLevel only results which level is equal or below this value (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param filterTypeNameId multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getItemsAllSearchCall(String language, String game, String query, Integer filterMinLevel, Integer filterMaxLevel, Integer limit, Set<String> filterTypeNameId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/{game}/v1/{language}/items/search"
            .replace("{" + "language" + "}", localVarApiClient.escapeString(language.toString()))
            .replace("{" + "game" + "}", localVarApiClient.escapeString(game.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (filterMinLevel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[min_level]", filterMinLevel));
        }

        if (filterMaxLevel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[max_level]", filterMaxLevel));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filterTypeNameId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "filter[type.name_id]", filterTypeNameId));
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
    private okhttp3.Call getItemsAllSearchValidateBeforeCall(String language, String game, String query, Integer filterMinLevel, Integer filterMaxLevel, Integer limit, Set<String> filterTypeNameId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'language' is set
        if (language == null) {
            throw new ApiException("Missing the required parameter 'language' when calling getItemsAllSearch(Async)");
        }

        // verify the required parameter 'game' is set
        if (game == null) {
            throw new ApiException("Missing the required parameter 'game' when calling getItemsAllSearch(Async)");
        }

        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling getItemsAllSearch(Async)");
        }

        return getItemsAllSearchCall(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId, _callback);

    }

    /**
     * Search All Items
     * Search in all names and descriptions of Dofus items (including all subtypes) with a query.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query case sensitive search query (required)
     * @param filterMinLevel only results which level is equal or above this value (optional)
     * @param filterMaxLevel only results which level is equal or below this value (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param filterTypeNameId multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @return List&lt;ListItemGeneral&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public List<ListItemGeneral> getItemsAllSearch(String language, String game, String query, Integer filterMinLevel, Integer filterMaxLevel, Integer limit, Set<String> filterTypeNameId) throws ApiException {
        ApiResponse<List<ListItemGeneral>> localVarResp = getItemsAllSearchWithHttpInfo(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId);
        return localVarResp.getData();
    }

    /**
     * Search All Items
     * Search in all names and descriptions of Dofus items (including all subtypes) with a query.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query case sensitive search query (required)
     * @param filterMinLevel only results which level is equal or above this value (optional)
     * @param filterMaxLevel only results which level is equal or below this value (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param filterTypeNameId multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @return ApiResponse&lt;List&lt;ListItemGeneral&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ListItemGeneral>> getItemsAllSearchWithHttpInfo(String language, String game, String query, Integer filterMinLevel, Integer filterMaxLevel, Integer limit, Set<String> filterTypeNameId) throws ApiException {
        okhttp3.Call localVarCall = getItemsAllSearchValidateBeforeCall(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId, null);
        Type localVarReturnType = new TypeToken<List<ListItemGeneral>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search All Items (asynchronously)
     * Search in all names and descriptions of Dofus items (including all subtypes) with a query.
     * @param language a valid language code (required)
     * @param game game main &#39;dofus3&#39; or beta channel &#39;dofus3beta&#39; (required)
     * @param query case sensitive search query (required)
     * @param filterMinLevel only results which level is equal or above this value (optional)
     * @param filterMaxLevel only results which level is equal or below this value (optional)
     * @param limit maximum number of returned results (optional, default to 8)
     * @param filterTypeNameId multi-filter results with the english type name. Add with \&quot;wood\&quot; or \&quot;+wood\&quot; and exclude with \&quot;-wood\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 400 </td><td>  </td><td>  -  </td></tr>
        <tr><td> 404 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getItemsAllSearchAsync(String language, String game, String query, Integer filterMinLevel, Integer filterMaxLevel, Integer limit, Set<String> filterTypeNameId, final ApiCallback<List<ListItemGeneral>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getItemsAllSearchValidateBeforeCall(language, game, query, filterMinLevel, filterMaxLevel, limit, filterTypeNameId, _callback);
        Type localVarReturnType = new TypeToken<List<ListItemGeneral>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
