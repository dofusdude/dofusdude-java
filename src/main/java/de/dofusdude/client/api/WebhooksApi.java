/**
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) npm i dofusdude-js --save - [Typescript](https://github.com/dofusdude/dofusdude-ts) npm i dofusdude-ts --save - [Go](https://github.com/dofusdude/dodugo) go get -u github.com/dofusdude/dodugo - [Python](https://github.com/dofusdude/dofusdude-py) pip install dofusdude - [PHP](https://github.com/dofusdude/dofusdude-php)  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 2 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my Discord.   ## Deploy now. Use forever. Everything you see here on this site, you can use now and forever. Updates could introduce new fields, new paths or parameter but never break backwards compatibility.  There is one exception! **The API will _always_ choose being up-to-date over everything else**. So if Ankama decides to drop languages from the game like they did with their website, the API will loose support for them, too.  ## Thank you! I highly welcome everyone on my [Discord](https://discord.gg/3EtHskZD8h) to just talk about projects and use cases or give feedback of any kind.  The servers have a fixed monthly cost to provide very fast responses. If you want to help me keeping them running or simply donate to that cause, consider becoming a [GitHub Sponsor](https://github.com/sponsors/dofusdude).
 *
 * The version of the OpenAPI document: 0.8.3
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package de.dofusdude.client.api;

import de.dofusdude.client.model.AlmanaxWebhook;
import de.dofusdude.client.model.CreateAlmanaxWebhook;
import de.dofusdude.client.model.CreateRSSWebhook;
import de.dofusdude.client.model.CreateTwitterWebhook;
import de.dofusdude.client.model.GetMetaWebhooksTwitter200Response;
import de.dofusdude.client.model.PutAlmanaxWebhook;
import de.dofusdude.client.model.PutRSSWebhook;
import de.dofusdude.client.model.PutTwitterWebhook;
import de.dofusdude.client.model.RssWebhook;
import de.dofusdude.client.model.TwitterWebhook;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;


import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * dofusdude
 *
 * <p># A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) npm i dofusdude-js --save - [Typescript](https://github.com/dofusdude/dofusdude-ts) npm i dofusdude-ts --save - [Go](https://github.com/dofusdude/dodugo) go get -u github.com/dofusdude/dodugo - [Python](https://github.com/dofusdude/dofusdude-py) pip install dofusdude - [PHP](https://github.com/dofusdude/dofusdude-php)  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 2 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my Discord.   ## Deploy now. Use forever. Everything you see here on this site, you can use now and forever. Updates could introduce new fields, new paths or parameter but never break backwards compatibility.  There is one exception! **The API will _always_ choose being up-to-date over everything else**. So if Ankama decides to drop languages from the game like they did with their website, the API will loose support for them, too.  ## Thank you! I highly welcome everyone on my [Discord](https://discord.gg/3EtHskZD8h) to just talk about projects and use cases or give feedback of any kind.  The servers have a fixed monthly cost to provide very fast responses. If you want to help me keeping them running or simply donate to that cause, consider becoming a [GitHub Sponsor](https://github.com/sponsors/dofusdude).
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("")
public interface WebhooksApi  {

    /**
     * Unregister Almanax Hook
     *
     * Delete a Webhook from the service.
     *
     */
    @DELETE
    @Path("/webhooks/almanax/{id}")
    void deleteWebhooksAlmanaxId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Unregister RSS Hook
     *
     * Delete a Webhook from the service.
     *
     */
    @DELETE
    @Path("/webhooks/rss/{id}")
    void deleteWebhooksRssId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Unregister Twitter Hook
     *
     * Delete a Webhook from the service.
     *
     */
    @DELETE
    @Path("/webhooks/twitter/{id}")
    void deleteWebhooksTwitterId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Get Almanax Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     */
    @GET
    @Path("/meta/webhooks/almanax")
    @Produces({ "application/json" })
    GetMetaWebhooksTwitter200Response getMetaWebhooksAlmanax() throws ApiException, ProcessingException;

    /**
     * Get RSS Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     */
    @GET
    @Path("/meta/webhooks/rss")
    @Produces({ "application/json" })
    GetMetaWebhooksTwitter200Response getMetaWebhooksRss() throws ApiException, ProcessingException;

    /**
     * Get Twitter Hook Metainfo
     *
     * Get a list of all available subscriptions. 
     *
     */
    @GET
    @Path("/meta/webhooks/twitter")
    @Produces({ "application/json" })
    GetMetaWebhooksTwitter200Response getMetaWebhooksTwitter() throws ApiException, ProcessingException;

    /**
     * Get Almanax Hook
     *
     * Retrieve details about an existing Almanax Webhook with a given uuid.
     *
     */
    @GET
    @Path("/webhooks/almanax/{id}")
    @Produces({ "application/json" })
    AlmanaxWebhook getWebhooksAlmanaxId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Get RSS Hook
     *
     * Retrieve details about an existing RSS Webhook with a given uuid.
     *
     */
    @GET
    @Path("/webhooks/rss/{id}")
    @Produces({ "application/json" })
    RssWebhook getWebhooksRssId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Get Twitter Hook
     *
     * Retrieve details about an existing Twitter Webhook with a given uuid.
     *
     */
    @GET
    @Path("/webhooks/twitter/{id}")
    @Produces({ "application/json" })
    TwitterWebhook getWebhooksTwitterId(@PathParam("id") String id) throws ApiException, ProcessingException;

    /**
     * Register Almanax Hook
     *
     * Register a new Webhook to post Almanax updates.
     *
     */
    @POST
    @Path("/webhooks/almanax")
    @Consumes({ "application/json" })
    void postWebhooksAlmanax(CreateAlmanaxWebhook createAlmanaxWebhook) throws ApiException, ProcessingException;

    /**
     * Register RSS Hook
     *
     * Register a new Webhook to post RSS news as soon as they are posted.
     *
     */
    @POST
    @Path("/webhooks/rss")
    @Consumes({ "application/json" })
    void postWebhooksRss(CreateRSSWebhook createRSSWebhook) throws ApiException, ProcessingException;

    /**
     * Register Twitter Hook
     *
     * Register a new Webhook to post Twitter updates as soon as they are posted.
     *
     */
    @POST
    @Path("/webhooks/twitter")
    @Consumes({ "application/json" })
    void postWebhooksTwitter(CreateTwitterWebhook createTwitterWebhook) throws ApiException, ProcessingException;

    /**
     * Update Almanax Hook
     *
     * Update the details of an Almanax Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     */
    @PUT
    @Path("/webhooks/almanax/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    AlmanaxWebhook putWebhooksAlmanaxId(@PathParam("id") String id, PutAlmanaxWebhook putAlmanaxWebhook) throws ApiException, ProcessingException;

    /**
     * Update RSS Hook
     *
     * Update the details of a RSS Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     */
    @PUT
    @Path("/webhooks/rss/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    RssWebhook putWebhooksRssId(@PathParam("id") String id, PutRSSWebhook putRSSWebhook) throws ApiException, ProcessingException;

    /**
     * Update Twitter Hook
     *
     * Update the details of a Twitter Webhook. All fields are optional and arrays will be overwritten, so always put all selected items of an array.
     *
     */
    @PUT
    @Path("/webhooks/twitter/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    TwitterWebhook putWebhooksTwitterId(@PathParam("id") String id, PutTwitterWebhook putTwitterWebhook) throws ApiException, ProcessingException;
}
