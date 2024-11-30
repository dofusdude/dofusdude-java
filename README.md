# dofusdude-java

dofusdude
- API version: 1.0.0-rc.4
  - Build date: 2024-11-30T09:44:43.172394287Z[Etc/UTC]
  - Generator version: 7.11.0-SNAPSHOT

# Open Ankama Developer Community
The all-in-one toolbelt for your next Ankama related project.

## Versions
- [Dofus 2](https://docs.dofusdu.de/dofus2/)
- [Dofus 3](https://docs.dofusdu.de/dofus3/)
  - v1 [latest] (you are here) 

## Client SDKs
- [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save`
- [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save`
- [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo`
- [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude`
- [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup

Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.

Your favorite language is missing? Please let me know!

# Main Features
- 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.

- ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.

- 📨 **Almanax Discord Integration** Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.

- 🩸 **Dofus 3 Beta** from stable to bleeding edge by replacing /dofus3 with /dofus3beta.

- 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_, _de_.

- 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.

- 🕵️ **Official Sources** generated from actual data from the game.

... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h).


  For more information, please visit [https://discord.gg/3EtHskZD8h](https://discord.gg/3EtHskZD8h)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dofusdude</groupId>
  <artifactId>dofusdude-java</artifactId>
  <version>1.0.0-rc.4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'dofusdude-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'dofusdude-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.dofusdude:dofusdude-java:1.0.0-rc.4"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/dofusdude-java-1.0.0-rc.4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.dofusdude.client.ApiClient;
import com.dofusdude.client.ApiException;
import com.dofusdude.client.Configuration;
import com.dofusdude.client.model.*;
import com.dofusdude.client.api.AlmanaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.dofusdu.de");

    AlmanaxApi apiInstance = new AlmanaxApi(defaultClient);
    String language = "en"; // String | code
    LocalDate date = LocalDate.parse("Tue Jul 14 00:00:00 UTC 2020"); // LocalDate | yyyy-mm-dd
    try {
      Almanax result = apiInstance.getAlmanaxDate(language, date);
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

## Documentation for API Endpoints

All URIs are relative to *https://api.dofusdu.de*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AlmanaxApi* | [**getAlmanaxDate**](docs/AlmanaxApi.md#getAlmanaxDate) | **GET** /dofus2/{language}/almanax/{date} | Single Almanax Date
*AlmanaxApi* | [**getAlmanaxRange**](docs/AlmanaxApi.md#getAlmanaxRange) | **GET** /dofus2/{language}/almanax | Almanax Range
*ConsumablesApi* | [**getAllItemsConsumablesList**](docs/ConsumablesApi.md#getAllItemsConsumablesList) | **GET** /{game}/v1/{language}/items/consumables/all | List All Consumables
*ConsumablesApi* | [**getItemsConsumablesList**](docs/ConsumablesApi.md#getItemsConsumablesList) | **GET** /{game}/v1/{language}/items/consumables | List Consumables
*ConsumablesApi* | [**getItemsConsumablesSearch**](docs/ConsumablesApi.md#getItemsConsumablesSearch) | **GET** /{game}/v1/{language}/items/consumables/search | Search Consumables
*ConsumablesApi* | [**getItemsConsumablesSingle**](docs/ConsumablesApi.md#getItemsConsumablesSingle) | **GET** /{game}/v1/{language}/items/consumables/{ankama_id} | Single Consumables
*CosmeticsApi* | [**getAllCosmeticsList**](docs/CosmeticsApi.md#getAllCosmeticsList) | **GET** /{game}/v1/{language}/items/cosmetics/all | List All Cosmetics
*CosmeticsApi* | [**getCosmeticsList**](docs/CosmeticsApi.md#getCosmeticsList) | **GET** /{game}/v1/{language}/items/cosmetics | List Cosmetics
*CosmeticsApi* | [**getCosmeticsSearch**](docs/CosmeticsApi.md#getCosmeticsSearch) | **GET** /{game}/v1/{language}/items/cosmetics/search | Search Cosmetics
*CosmeticsApi* | [**getCosmeticsSingle**](docs/CosmeticsApi.md#getCosmeticsSingle) | **GET** /{game}/v1/{language}/items/cosmetics/{ankama_id} | Single Cosmetics
*EquipmentApi* | [**getAllItemsEquipmentList**](docs/EquipmentApi.md#getAllItemsEquipmentList) | **GET** /{game}/v1/{language}/items/equipment/all | List All Equipment
*EquipmentApi* | [**getItemsEquipmentList**](docs/EquipmentApi.md#getItemsEquipmentList) | **GET** /{game}/v1/{language}/items/equipment | List Equipment
*EquipmentApi* | [**getItemsEquipmentSearch**](docs/EquipmentApi.md#getItemsEquipmentSearch) | **GET** /{game}/v1/{language}/items/equipment/search | Search Equipment
*EquipmentApi* | [**getItemsEquipmentSingle**](docs/EquipmentApi.md#getItemsEquipmentSingle) | **GET** /{game}/v1/{language}/items/equipment/{ankama_id} | Single Equipment
*GameApi* | [**getGameSearch**](docs/GameApi.md#getGameSearch) | **GET** /{game}/v1/{language}/search | Game Search
*GameApi* | [**getItemsAllSearch**](docs/GameApi.md#getItemsAllSearch) | **GET** /{game}/v1/{language}/items/search | Search All Items
*MetaApi* | [**getGameSearchTypes**](docs/MetaApi.md#getGameSearchTypes) | **GET** /dofus3beta/v1/meta/search/types | Available Game Search Types
*MetaApi* | [**getItemTypes**](docs/MetaApi.md#getItemTypes) | **GET** /dofus3beta/v1/meta/items/types | Available Item Types
*MetaApi* | [**getMetaAlmanaxBonuses**](docs/MetaApi.md#getMetaAlmanaxBonuses) | **GET** /dofus2/meta/{language}/almanax/bonuses | Available Almanax Bonuses
*MetaApi* | [**getMetaAlmanaxBonusesSearch**](docs/MetaApi.md#getMetaAlmanaxBonusesSearch) | **GET** /dofus2/meta/{language}/almanax/bonuses/search | Search Available Almanax Bonuses
*MetaApi* | [**getMetaElements**](docs/MetaApi.md#getMetaElements) | **GET** /dofus3beta/v1/meta/elements | Effects and Condition Elements
*MetaApi* | [**getMetaVersion**](docs/MetaApi.md#getMetaVersion) | **GET** /{game}/v1/meta/version | Game Version
*MountsApi* | [**getAllMountsList**](docs/MountsApi.md#getAllMountsList) | **GET** /{game}/v1/{language}/mounts/all | List All Mounts
*MountsApi* | [**getMountsList**](docs/MountsApi.md#getMountsList) | **GET** /{game}/v1/{language}/mounts | List Mounts
*MountsApi* | [**getMountsSearch**](docs/MountsApi.md#getMountsSearch) | **GET** /{game}/v1/{language}/mounts/search | Search Mounts
*MountsApi* | [**getMountsSingle**](docs/MountsApi.md#getMountsSingle) | **GET** /{game}/v1/{language}/mounts/{ankama_id} | Single Mounts
*QuestItemsApi* | [**getAllItemsQuestList**](docs/QuestItemsApi.md#getAllItemsQuestList) | **GET** /{game}/v1/{language}/items/quest/all | List All Quest Items
*QuestItemsApi* | [**getItemQuestSingle**](docs/QuestItemsApi.md#getItemQuestSingle) | **GET** /{game}/v1/{language}/items/quest/{ankama_id} | Single Quest Items
*QuestItemsApi* | [**getItemsQuestList**](docs/QuestItemsApi.md#getItemsQuestList) | **GET** /{game}/v1/{language}/items/quest | List Quest Items
*QuestItemsApi* | [**getItemsQuestSearch**](docs/QuestItemsApi.md#getItemsQuestSearch) | **GET** /{game}/v1/{language}/items/quest/search | Search Quest Items
*ResourcesApi* | [**getAllItemsResourcesList**](docs/ResourcesApi.md#getAllItemsResourcesList) | **GET** /{game}/v1/{language}/items/resources/all | List All Resources
*ResourcesApi* | [**getItemsResourceSearch**](docs/ResourcesApi.md#getItemsResourceSearch) | **GET** /{game}/v1/{language}/items/resources/search | Search Resources
*ResourcesApi* | [**getItemsResourcesList**](docs/ResourcesApi.md#getItemsResourcesList) | **GET** /{game}/v1/{language}/items/resources | List Resources
*ResourcesApi* | [**getItemsResourcesSingle**](docs/ResourcesApi.md#getItemsResourcesSingle) | **GET** /{game}/v1/{language}/items/resources/{ankama_id} | Single Resources
*SetsApi* | [**getAllSetsList**](docs/SetsApi.md#getAllSetsList) | **GET** /{game}/v1/{language}/sets/all | List All Sets
*SetsApi* | [**getSetsList**](docs/SetsApi.md#getSetsList) | **GET** /{game}/v1/{language}/sets | List Sets
*SetsApi* | [**getSetsSearch**](docs/SetsApi.md#getSetsSearch) | **GET** /{game}/v1/{language}/sets/search | Search Sets
*SetsApi* | [**getSetsSingle**](docs/SetsApi.md#getSetsSingle) | **GET** /{game}/v1/{language}/sets/{ankama_id} | Single Sets
*WebhooksApi* | [**deleteWebhooksAlmanaxId**](docs/WebhooksApi.md#deleteWebhooksAlmanaxId) | **DELETE** /webhooks/almanax/{id} | Unregister Almanax Hook
*WebhooksApi* | [**deleteWebhooksRssId**](docs/WebhooksApi.md#deleteWebhooksRssId) | **DELETE** /webhooks/rss/{id} | Unregister RSS Hook
*WebhooksApi* | [**deleteWebhooksTwitterId**](docs/WebhooksApi.md#deleteWebhooksTwitterId) | **DELETE** /webhooks/twitter/{id} | Unregister Twitter Hook
*WebhooksApi* | [**getMetaWebhooksAlmanax**](docs/WebhooksApi.md#getMetaWebhooksAlmanax) | **GET** /meta/webhooks/almanax | Get Almanax Hook Metainfo
*WebhooksApi* | [**getMetaWebhooksRss**](docs/WebhooksApi.md#getMetaWebhooksRss) | **GET** /meta/webhooks/rss | Get RSS Hook Metainfo
*WebhooksApi* | [**getMetaWebhooksTwitter**](docs/WebhooksApi.md#getMetaWebhooksTwitter) | **GET** /meta/webhooks/twitter | Get Twitter Hook Metainfo
*WebhooksApi* | [**getWebhooksAlmanaxId**](docs/WebhooksApi.md#getWebhooksAlmanaxId) | **GET** /webhooks/almanax/{id} | Get Almanax Hook
*WebhooksApi* | [**getWebhooksRssId**](docs/WebhooksApi.md#getWebhooksRssId) | **GET** /webhooks/rss/{id} | Get RSS Hook
*WebhooksApi* | [**getWebhooksTwitterId**](docs/WebhooksApi.md#getWebhooksTwitterId) | **GET** /webhooks/twitter/{id} | Get Twitter Hook
*WebhooksApi* | [**postWebhooksAlmanax**](docs/WebhooksApi.md#postWebhooksAlmanax) | **POST** /webhooks/almanax | Register Almanax Hook
*WebhooksApi* | [**postWebhooksRss**](docs/WebhooksApi.md#postWebhooksRss) | **POST** /webhooks/rss | Register RSS Hook
*WebhooksApi* | [**postWebhooksTwitter**](docs/WebhooksApi.md#postWebhooksTwitter) | **POST** /webhooks/twitter | Register Twitter Hook
*WebhooksApi* | [**putWebhooksAlmanaxId**](docs/WebhooksApi.md#putWebhooksAlmanaxId) | **PUT** /webhooks/almanax/{id} | Update Almanax Hook
*WebhooksApi* | [**putWebhooksRssId**](docs/WebhooksApi.md#putWebhooksRssId) | **PUT** /webhooks/rss/{id} | Update RSS Hook
*WebhooksApi* | [**putWebhooksTwitterId**](docs/WebhooksApi.md#putWebhooksTwitterId) | **PUT** /webhooks/twitter/{id} | Update Twitter Hook


## Documentation for Models

 - [Almanax](docs/Almanax.md)
 - [AlmanaxBonus](docs/AlmanaxBonus.md)
 - [AlmanaxTribute](docs/AlmanaxTribute.md)
 - [AlmanaxTributeItem](docs/AlmanaxTributeItem.md)
 - [AlmanaxWebhook](docs/AlmanaxWebhook.md)
 - [AlmanaxWebhookDailySettings](docs/AlmanaxWebhookDailySettings.md)
 - [Condition](docs/Condition.md)
 - [ConditionLeaf](docs/ConditionLeaf.md)
 - [ConditionNode](docs/ConditionNode.md)
 - [ConditionRelation](docs/ConditionRelation.md)
 - [CreateAlmanaxWebhook](docs/CreateAlmanaxWebhook.md)
 - [CreateAlmanaxWebhookDailySettings](docs/CreateAlmanaxWebhookDailySettings.md)
 - [CreateAlmanaxWebhookMentionsValueInner](docs/CreateAlmanaxWebhookMentionsValueInner.md)
 - [CreateRSSWebhook](docs/CreateRSSWebhook.md)
 - [CreateTwitterWebhook](docs/CreateTwitterWebhook.md)
 - [Effect](docs/Effect.md)
 - [EffectType](docs/EffectType.md)
 - [Equipment](docs/Equipment.md)
 - [EquipmentSet](docs/EquipmentSet.md)
 - [Error](docs/Error.md)
 - [GameSearch](docs/GameSearch.md)
 - [GameSearchItem](docs/GameSearchItem.md)
 - [GameSearchType](docs/GameSearchType.md)
 - [GetMetaAlmanaxBonuses200ResponseInner](docs/GetMetaAlmanaxBonuses200ResponseInner.md)
 - [GetMetaWebhooksTwitter200Response](docs/GetMetaWebhooksTwitter200Response.md)
 - [Images](docs/Images.md)
 - [ItemSubtype](docs/ItemSubtype.md)
 - [ListEquipmentSet](docs/ListEquipmentSet.md)
 - [ListEquipmentSets](docs/ListEquipmentSets.md)
 - [ListItem](docs/ListItem.md)
 - [ListItemGeneral](docs/ListItemGeneral.md)
 - [ListItems](docs/ListItems.md)
 - [ListMounts](docs/ListMounts.md)
 - [Mount](docs/Mount.md)
 - [MountFamily](docs/MountFamily.md)
 - [PagedLinks](docs/PagedLinks.md)
 - [PutAlmanaxWebhook](docs/PutAlmanaxWebhook.md)
 - [PutRSSWebhook](docs/PutRSSWebhook.md)
 - [PutTwitterWebhook](docs/PutTwitterWebhook.md)
 - [Range](docs/Range.md)
 - [Recipe](docs/Recipe.md)
 - [Resource](docs/Resource.md)
 - [RssWebhook](docs/RssWebhook.md)
 - [TranslatedId](docs/TranslatedId.md)
 - [TwitterWebhook](docs/TwitterWebhook.md)
 - [Version](docs/Version.md)
 - [Weapon](docs/Weapon.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

stelzo@steado.de

