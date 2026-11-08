

# EffectZone


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**raw** | **String** | Original compact zone encoding when the source provides one. |  [optional] |
|**shape** | [**ZoneShape**](ZoneShape.md) |  |  |
|**size** | **Integer** | Effective outer size of the area. A point has size 0; whole-map and custom-cell shapes omit it. |  [optional] |
|**minSize** | **Integer** | Effective inner size for hollow or minimum-size shapes. Omitted when the shape has no inner boundary. |  [optional] |
|**cellIds** | **List&lt;Integer&gt;** |  |  |
|**damageDecreaseStepPercent** | **Integer** |  |  [optional] |
|**maxDamageDecreaseApplyCount** | **Integer** |  |  [optional] |
|**forcedDirection** | **Integer** |  |  [optional] |
|**includeCarried** | **Boolean** |  |  [optional] |
|**stopAtTarget** | **Boolean** |  |  [optional] |
|**onlyAffectInSightLine** | **Boolean** |  |  [optional] |



