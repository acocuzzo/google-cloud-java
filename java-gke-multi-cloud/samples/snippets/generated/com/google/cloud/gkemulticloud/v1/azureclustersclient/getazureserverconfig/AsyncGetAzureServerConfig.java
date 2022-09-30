/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gkemulticloud.v1.samples;

// [START gkemulticloud_v1_generated_azureclustersclient_getazureserverconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkemulticloud.v1.AzureClustersClient;
import com.google.cloud.gkemulticloud.v1.AzureServerConfig;
import com.google.cloud.gkemulticloud.v1.AzureServerConfigName;
import com.google.cloud.gkemulticloud.v1.GetAzureServerConfigRequest;

public class AsyncGetAzureServerConfig {

  public static void main(String[] args) throws Exception {
    asyncGetAzureServerConfig();
  }

  public static void asyncGetAzureServerConfig() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AzureClustersClient azureClustersClient = AzureClustersClient.create()) {
      GetAzureServerConfigRequest request =
          GetAzureServerConfigRequest.newBuilder()
              .setName(AzureServerConfigName.of("[PROJECT]", "[LOCATION]").toString())
              .build();
      ApiFuture<AzureServerConfig> future =
          azureClustersClient.getAzureServerConfigCallable().futureCall(request);
      // Do something.
      AzureServerConfig response = future.get();
    }
  }
}
// [END gkemulticloud_v1_generated_azureclustersclient_getazureserverconfig_async]
