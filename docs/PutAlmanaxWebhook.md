

# PutAlmanaxWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bonusWhitelist** | **List&lt;String&gt;** | from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses. Delete old entries with empty array []. Just null changes nothing. |  [optional] |
|**bonusBlacklist** | **List&lt;String&gt;** | from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses. Delete old entries with empty array []. Just null changes nothing. |  [optional] |
|**subscriptions** | **List&lt;String&gt;** | Get the available subscriptions with /meta/webhooks/almanax |  [optional] |
|**dailySettings** | [**CreateAlmanaxWebhookDailySettings**](CreateAlmanaxWebhookDailySettings.md) |  |  [optional] |
|**isoDate** | **Boolean** | If false, it will use common local time formats and weekday translations. If true, the format is YYYY-MM-DD. |  [optional] |
|**mentions** | **Map&lt;String, List&lt;CreateAlmanaxWebhookMentionsValueInner&gt;&gt;** | Almanax bonus ids mapped to array of mentions. |  [optional] |
|**intervals** | [**Set&lt;IntervalsEnum&gt;**](#Set&lt;IntervalsEnum&gt;) |  |  [optional] |
|**weeklyWeekday** | [**WeeklyWeekdayEnum**](#WeeklyWeekdayEnum) | When to post the weekly preview at the specified time. |  [optional] |



## Enum: Set&lt;IntervalsEnum&gt;

| Name | Value |
|---- | -----|
| DAILY | &quot;daily&quot; |
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |



## Enum: WeeklyWeekdayEnum

| Name | Value |
|---- | -----|
| SUNDAY | &quot;sunday&quot; |
| MONDAY | &quot;monday&quot; |
| TUESDAY | &quot;tuesday&quot; |
| WEDNESDAY | &quot;wednesday&quot; |
| THURSDAY | &quot;thursday&quot; |
| FRIDAY | &quot;friday&quot; |
| SATURDAY | &quot;saturday&quot; |



