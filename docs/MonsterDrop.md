

# MonsterDrop

A possible item drop with base rates indexed by monster grade. Final player-specific chances also depend on conditions and game modifiers.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**item** | **CombatReference** |  |  |
|**ratesPercent** | [**List&lt;MonsterDropRatesPercentInner&gt;**](MonsterDropRatesPercentInner.md) | Base drop percentages indexed by MonsterGrade.grade, not spell grade or array position. A value of 5 means 5 percent, not 0.05 percent. These are not spawn percentages. |  |
|**hasConditions** | **Boolean** | The source reports restrictions. Can be true without a complete client-side condition tree because server-only predicates are not exposed. |  |
|**dropId** | **Integer** |  |  [optional] |
|**count** | **Integer** |  |  [optional] |
|**condition** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**hiddenIfInvalidConditions** | **Boolean** |  |  [optional] |
|**disableDropModifier** | **Boolean** |  |  [optional] |
|**specificCoefficients** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  [optional] |



