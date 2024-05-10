/*
 * dofusdude
 * # A project for you - the developer. The all-in-one toolbelt for your next Ankama related project.  ## Client SDKs - [Javascript](https://github.com/dofusdude/dofusdude-js) `npm i dofusdude-js --save` - [Typescript](https://github.com/dofusdude/dofusdude-ts) `npm i dofusdude-ts --save` - [Go](https://github.com/dofusdude/dodugo) `go get -u github.com/dofusdude/dodugo` - [Python](https://github.com/dofusdude/dofusdude-py) `pip install dofusdude` - [PHP](https://github.com/dofusdude/dofusdude-php) - [Java](https://github.com/dofusdude/dofusdude-java) Maven with GitHub packages setup  Everything, including this site, is generated out of the [Docs Repo](https://github.com/dofusdude/api-docs). Consider it the Single Source of Truth. If there is a problem with the SDKs, create an issue there.  Your favorite language is missing? Please let me know!  # Main Features - 🥷 **Seamless Auto-Update** load data in the background when a new Dofus version is released and serving it within 10 minutes with atomic data source switching. No downtime and no effects for the user, just always up-to-date.  - ⚡ **Blazingly Fast** all data in-memory, aggressive caching over short time spans, HTTP/2 multiplexing, written in Go, optimized for low latency, hosted on bare metal in 🇩🇪.  - 📨 **Discord Integration** Ankama related RSS and Almanax feeds to post to Discord servers with advanced features like filters or mentions. Use the endpoints as a dev or the official [Web Client](https://discord.dofusdude.com) as a user.  - 🩸 **Dofus 2 Beta** from stable to bleeding edge by replacing /dofus2 with /dofus2beta.  - 🗣️ **Multilingual** supporting _en_, _fr_, _es_, _pt_ including the dropped languages from the Dofus website _de_ and _it_.  - 🧠 **Search by Relevance** allowing typos in name and description, handled by language specific text analysis and indexing.  - 🕵️ **Complete** actual data from the game including items invisible to the encyclopedia like quest items.  - 🖼️ **HD Images** rendering game assets to high-res images with up to 800x800 px.  ... and much more on the Roadmap on my [Discord](https://discord.gg/3EtHskZD8h). 
 *
 * The version of the OpenAPI document: 0.9.0
 * Contact: stelzo@steado.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dofusdude.client.model;

import java.util.Objects;
import com.dofusdude.client.model.ConditionTreeNode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.dofusdude.client.JSON;

/**
 * ConditionTreeRelation
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T16:17:13.173014837Z[Etc/UTC]", comments = "Generator version: 7.6.0-SNAPSHOT")
public class ConditionTreeRelation {
  public static final String SERIALIZED_NAME_IS_OPERAND = "is_operand";
  @SerializedName(SERIALIZED_NAME_IS_OPERAND)
  private Boolean isOperand = false;

  public static final String SERIALIZED_NAME_RELATION = "relation";
  @SerializedName(SERIALIZED_NAME_RELATION)
  private String relation = "and";

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private List<ConditionTreeNode> children = new ArrayList<>();

  public ConditionTreeRelation() {
  }

  public ConditionTreeRelation isOperand(Boolean isOperand) {
    this.isOperand = isOperand;
    return this;
  }

   /**
   * always \&quot;false\&quot; for relations
   * @return isOperand
  **/
  @jakarta.annotation.Nullable
  public Boolean getIsOperand() {
    return isOperand;
  }

  public void setIsOperand(Boolean isOperand) {
    this.isOperand = isOperand;
  }


  public ConditionTreeRelation relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * \&quot;and\&quot;, \&quot;or\&quot;
   * @return relation
  **/
  @jakarta.annotation.Nullable
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }


  public ConditionTreeRelation children(List<ConditionTreeNode> children) {
    this.children = children;
    return this;
  }

  public ConditionTreeRelation addChildrenItem(ConditionTreeNode childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @jakarta.annotation.Nullable
  public List<ConditionTreeNode> getChildren() {
    return children;
  }

  public void setChildren(List<ConditionTreeNode> children) {
    this.children = children;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConditionTreeRelation conditionTreeRelation = (ConditionTreeRelation) o;
    return Objects.equals(this.isOperand, conditionTreeRelation.isOperand) &&
        Objects.equals(this.relation, conditionTreeRelation.relation) &&
        Objects.equals(this.children, conditionTreeRelation.children);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isOperand, relation, children);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionTreeRelation {\n");
    sb.append("    isOperand: ").append(toIndentedString(isOperand)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("is_operand");
    openapiFields.add("relation");
    openapiFields.add("children");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConditionTreeRelation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConditionTreeRelation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConditionTreeRelation is not found in the empty JSON string", ConditionTreeRelation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConditionTreeRelation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConditionTreeRelation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("relation") != null && !jsonObj.get("relation").isJsonNull()) && !jsonObj.get("relation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relation").toString()));
      }
      if (jsonObj.get("children") != null && !jsonObj.get("children").isJsonNull()) {
        JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
        if (jsonArraychildren != null) {
          // ensure the json data is an array
          if (!jsonObj.get("children").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
          }

          // validate the optional field `children` (array)
          for (int i = 0; i < jsonArraychildren.size(); i++) {
            ConditionTreeNode.validateJsonElement(jsonArraychildren.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConditionTreeRelation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConditionTreeRelation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConditionTreeRelation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConditionTreeRelation.class));

       return (TypeAdapter<T>) new TypeAdapter<ConditionTreeRelation>() {
           @Override
           public void write(JsonWriter out, ConditionTreeRelation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConditionTreeRelation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConditionTreeRelation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConditionTreeRelation
  * @throws IOException if the JSON string is invalid with respect to ConditionTreeRelation
  */
  public static ConditionTreeRelation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConditionTreeRelation.class);
  }

 /**
  * Convert an instance of ConditionTreeRelation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

