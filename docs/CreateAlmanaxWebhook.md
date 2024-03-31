

# CreateAlmanaxWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bonusWhitelist** | **List&lt;String&gt;** | from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses |  [optional] |
|**bonusBlacklist** | **List&lt;String&gt;** | from all available bonuses (ids) from /dofus2/meta/{language}/almanax/bonuses |  [optional] |
|**subscriptions** | **List&lt;String&gt;** | Get the available subscriptions with /meta/webhooks/almanax |  |
|**format** | [**FormatEnum**](#FormatEnum) |  |  |
|**callback** | **URI** | Discord Webhook URL |  |
|**dailySettings** | [**CreateAlmanaxWebhookDailySettings**](CreateAlmanaxWebhookDailySettings.md) |  |  [optional] |
|**isoDate** | **Boolean** | If false, it will use common local time formats and weekday translations. If true, the format is YYYY-MM-DD. |  [optional] |
|**mentions** | **Map&lt;String, List&lt;CreateAlmanaxWebhookMentionsValueInner&gt;&gt;** | Almanax bonus ids mapped to array of mentions. |  [optional] |
|**intervals** | [**Set&lt;IntervalsEnum&gt;**](#Set&lt;IntervalsEnum&gt;) | - Daily posts each day, filtering with Black/Whitelist and mentions are applied daily. - Weekly posts the next 7 days (excluding the posting day) once per week at the specified time. With only weekly selected, of all mentions, only prior notices will come through daily. The 7 day preview gets filtered by the Black/Whitelist. - Monthly posts a preview of the next month from first to last date. The post will be on the last day of a month (ignoring day of the week) at the specified time. Mentions and filtering works like weekly. The biggest difference between daily and the other two is that daily always posts the current day while monthly and weekly only show future days. You can always combine the intervals by selecting multiple intervals for one hook or create multiple hooks for the same channel with different settings to get every highly specific combination you want. |  |
|**weeklyWeekday** | [**WeeklyWeekdayEnum**](#WeeklyWeekdayEnum) | When to post the weekly preview at the specified time. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| DISCORD | &quot;discord&quot; |



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



