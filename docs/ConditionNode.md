

# ConditionNode

Client-side requirement tree. Leaf nodes contain one condition and relation nodes combine children with and or or. Preserves grouping. Not an authoritative server eligibility decision.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isOperand** | **Boolean** | always \&quot;true\&quot; for the leaf of a tree |  [optional] |
|**relation** | **String** | \&quot;and\&quot;, \&quot;or\&quot; |  [optional] |
|**children** | [**List&lt;ConditionNode&gt;**](ConditionNode.md) |  |  [optional] |
|**condition** | [**Condition**](Condition.md) |  |  [optional] |



