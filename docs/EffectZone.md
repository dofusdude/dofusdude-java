

# EffectZone

Combat-cell area for this effect or activation context, not a geographic world area. Shape, size and inner size describe geometry. Actual affected cells can depend on position, direction and fight state. Each spell effect can have a different zone.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**raw** | **String** | Original compact zone encoding when the source provides one. |  [optional] |
|**shape** | [**ZoneShape**](ZoneShape.md) |  |  |
|**size** | **Integer** | Effective outer size of the area. A point has size 0. Whole-map and custom-cell shapes omit it. |  [optional] |
|**minSize** | **Integer** | Effective inner size for hollow or minimum-size shapes. Omitted when the shape has no inner boundary. |  [optional] |
|**cellIds** | **List&lt;Integer&gt;** | Explicit cells for a custom-cell shape. An empty array is normal for geometric shapes such as circles and does not mean the zone affects no cells. |  |
|**damageDecreaseStepPercent** | **Integer** |  |  [optional] |
|**maxDamageDecreaseApplyCount** | **Integer** |  |  [optional] |
|**forcedDirection** | **Integer** |  |  [optional] |
|**includeCarried** | **Boolean** |  |  [optional] |
|**stopAtTarget** | **Boolean** |  |  [optional] |
|**onlyAffectInSightLine** | **Boolean** |  |  [optional] |



