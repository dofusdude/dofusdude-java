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

package de.dofusdude.client.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;

/**
  * Mention
 **/

public class CreateAlmanaxWebhookMentionsValueInner  {
  
 /**
   * User or role ID directly from Discord. Activate developer mode and right click a user or role to get them.
  **/
  @JsonbProperty("discord_id")
  private Integer discordId;

 /**
   * Whether an ID describes a role (true) or user (false). This is needed for formatting the mention command so Discord understands it.
  **/
  @JsonbProperty("is_role")
  private Boolean isRole;

 /**
   * Get a mention days before the bonus comes up. It will post on the specified time. Also works when the interval is not daily.
  **/
  @JsonbProperty("ping_days_before")
  private Integer pingDaysBefore;

 /**
   * User or role ID directly from Discord. Activate developer mode and right click a user or role to get them.
   * @return discordId
  **/
  public Integer getDiscordId() {
    return discordId;
  }

  /**
    * Set discordId
  **/
  public void setDiscordId(Integer discordId) {
    this.discordId = discordId;
  }

  public CreateAlmanaxWebhookMentionsValueInner discordId(Integer discordId) {
    this.discordId = discordId;
    return this;
  }

 /**
   * Whether an ID describes a role (true) or user (false). This is needed for formatting the mention command so Discord understands it.
   * @return isRole
  **/
  public Boolean getIsRole() {
    return isRole;
  }

  /**
    * Set isRole
  **/
  public void setIsRole(Boolean isRole) {
    this.isRole = isRole;
  }

  public CreateAlmanaxWebhookMentionsValueInner isRole(Boolean isRole) {
    this.isRole = isRole;
    return this;
  }

 /**
   * Get a mention days before the bonus comes up. It will post on the specified time. Also works when the interval is not daily.
   * minimum: 1
   * maximum: 31
   * @return pingDaysBefore
  **/
  public Integer getPingDaysBefore() {
    return pingDaysBefore;
  }

  /**
    * Set pingDaysBefore
  **/
  public void setPingDaysBefore(Integer pingDaysBefore) {
    this.pingDaysBefore = pingDaysBefore;
  }

  public CreateAlmanaxWebhookMentionsValueInner pingDaysBefore(Integer pingDaysBefore) {
    this.pingDaysBefore = pingDaysBefore;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAlmanaxWebhookMentionsValueInner {\n");
    
    sb.append("    discordId: ").append(toIndentedString(discordId)).append("\n");
    sb.append("    isRole: ").append(toIndentedString(isRole)).append("\n");
    sb.append("    pingDaysBefore: ").append(toIndentedString(pingDaysBefore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
