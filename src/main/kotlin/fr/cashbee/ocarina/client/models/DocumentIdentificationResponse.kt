/**
* Ocarina API
* OptiCAl Recognition of IdeNtity pApers
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package fr.cashbee.ocarina.client.models


import com.squareup.moshi.Json
/**
 * 
 * @param id 
 * @param result 
 * @param category 
 */
data class DocumentIdentificationResponse (
    @Json(name = "id")
    val id: kotlin.Long? = null,
    @Json(name = "result")
    val result: kotlin.String? = null,
    @Json(name = "category")
    val category: kotlin.String? = null
) {

}

