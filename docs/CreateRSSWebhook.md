

# CreateRSSWebhook



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**whitelist** | **List&lt;String&gt;** |  |  [optional] |
|**blacklist** | **List&lt;String&gt;** |  |  [optional] |
|**subscriptions** | **Set&lt;String&gt;** | Get the available subscriptions with /meta/webhooks/rss |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**previewLength** | **Integer** |  |  [optional] |
|**callback** | **URI** | Discord Webhook URL |  |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| DISCORD | &quot;discord&quot; |



