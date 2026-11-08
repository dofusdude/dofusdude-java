

# EligibilityNode

Client-side conditions using the v1 condition-node structure. Confirmed server-owned predicates are excluded during mapping. This is not the complete server eligibility formula, and the API does not dynamically remove fields based on interpretation status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isOperand** | **Boolean** |  |  [optional] |
|**relation** | [**RelationEnum**](#RelationEnum) |  |  [optional] |
|**children** | [**List&lt;EligibilityNode&gt;**](EligibilityNode.md) |  |  [optional] |
|**condition** | [**EligibilityNodeCondition**](EligibilityNodeCondition.md) |  |  [optional] |



## Enum: RelationEnum

| Name | Value |
|---- | -----|
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |



