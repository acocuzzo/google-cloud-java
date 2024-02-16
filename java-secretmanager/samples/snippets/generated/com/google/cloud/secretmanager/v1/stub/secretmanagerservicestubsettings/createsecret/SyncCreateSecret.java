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

package com.google.cloud.secretmanager.v1.stub.samples;

// [START secretmanager_v1_generated_SecretManagerServiceStubSettings_CreateSecret_sync]
import com.google.cloud.secretmanager.v1.stub.SecretManagerServiceStubSettings;
import java.time.Duration;

public class SyncCreateSecret {

  public static void main(String[] args) throws Exception {
    syncCreateSecret();
  }

  public static void syncCreateSecret() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    SecretManagerServiceStubSettings.Builder secretManagerServiceSettingsBuilder =
        SecretManagerServiceStubSettings.newBuilder();
    secretManagerServiceSettingsBuilder
        .createSecretSettings()
        .setRetrySettings(
            secretManagerServiceSettingsBuilder
                .createSecretSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    SecretManagerServiceStubSettings secretManagerServiceSettings =
        secretManagerServiceSettingsBuilder.build();
  }
}
// [END secretmanager_v1_generated_SecretManagerServiceStubSettings_CreateSecret_sync]
