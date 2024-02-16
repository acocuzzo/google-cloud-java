/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.retail.v2alpha.samples;

// [START retail_v2alpha_generated_ServingConfigService_ListServingConfigs_Catalogname_sync]
import com.google.cloud.retail.v2alpha.CatalogName;
import com.google.cloud.retail.v2alpha.ServingConfig;
import com.google.cloud.retail.v2alpha.ServingConfigServiceClient;

public class SyncListServingConfigsCatalogname {

  public static void main(String[] args) throws Exception {
    syncListServingConfigsCatalogname();
  }

  public static void syncListServingConfigsCatalogname() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (ServingConfigServiceClient servingConfigServiceClient =
        ServingConfigServiceClient.create()) {
      CatalogName parent = CatalogName.of("[PROJECT]", "[LOCATION]", "[CATALOG]");
      for (ServingConfig element :
          servingConfigServiceClient.listServingConfigs(parent).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END retail_v2alpha_generated_ServingConfigService_ListServingConfigs_Catalogname_sync]
