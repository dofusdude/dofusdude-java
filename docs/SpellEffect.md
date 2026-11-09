

# SpellEffect

One normal or critical effect of a particular spell grade. Its zone defines where it applies, target_mask defines eligible targets and triggers defines activation events. Templated text is for display, not a formula to parse.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Localized effect category, such as Air damage. This is not a spell ID or a structured game reference. |  [optional] |
|**min** | **Integer** |  |  [optional] |
|**max** | **Integer** |  |  [optional] |
|**duration** | **Integer** | Effect duration in fight turns as represented by the source. Not a real-time duration in seconds. |  [optional] |
|**delay** | **Integer** | Delay before the effect in fight turns as represented by the source. |  [optional] |
|**random** | **BigDecimal** | Source random-selection value. Do not interpret it as a percentage without the effect&#39;s selection rules. |  [optional] |
|**group** | **Integer** |  |  [optional] |
|**dispellable** | **Integer** |  |  [optional] |
|**effectUid** | **Integer** | Stable identifier of this concrete effect instance. |  [optional] |
|**targetId** | **Integer** |  |  [optional] |
|**triggeredDuration** | **Integer** |  |  [optional] |
|**displayZero** | **Boolean** |  |  [optional] |
|**modifier** | **Integer** |  |  [optional] |
|**zone** | [**EffectZone**](EffectZone.md) |  |  [optional] |
|**targetMask** | [**TargetMask**](TargetMask.md) |  |  [optional] |
|**triggers** | [**SpellTriggers**](SpellTriggers.md) |  |  [optional] |
|**templated** | **String** | Localized effect text suitable for display. Numeric effect properties remain available separately. |  [optional] |



