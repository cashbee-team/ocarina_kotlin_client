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
 * @param size 
 * @param contentMd5 
 */
data class DirectUploadRequest (
    @Json(name = "size")
    val size: kotlin.Long? = null,
    @Json(name = "content_md5")
    val contentMd5: kotlin.String? = null
) {

}

