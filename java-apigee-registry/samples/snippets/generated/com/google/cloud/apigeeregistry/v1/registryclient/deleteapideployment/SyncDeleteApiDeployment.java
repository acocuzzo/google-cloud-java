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

package com.google.cloud.apigeeregistry.v1.samples;

// [START apigeeregistry_v1_generated_registryclient_deleteapideployment_sync]
import com.google.cloud.apigeeregistry.v1.ApiDeploymentName;
import com.google.cloud.apigeeregistry.v1.DeleteApiDeploymentRequest;
import com.google.cloud.apigeeregistry.v1.RegistryClient;

public class SyncDeleteApiDeployment {

  public static void main(String[] args) throws Exception {
    syncDeleteApiDeployment();
  }

  public static void syncDeleteApiDeployment() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RegistryClient registryClient = RegistryClient.create()) {
      DeleteApiDeploymentRequest request =
          DeleteApiDeploymentRequest.newBuilder()
              .setName(
                  ApiDeploymentName.of("[PROJECT]", "[LOCATION]", "[API]", "[DEPLOYMENT]")
                      .toString())
              .setForce(true)
              .build();
      registryClient.deleteApiDeployment(request);
    }
  }
}
// [END apigeeregistry_v1_generated_registryclient_deleteapideployment_sync]
